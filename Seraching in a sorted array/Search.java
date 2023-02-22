import java.util.*;

public class Search{

    // A benchmark for an unsorted array 
    public static boolean search_unsorted(double[] array, double key) {
        for (int index = 0; index < array.length; index++) {
        if (array[index] == key) {
        return true;
        }
        }
        return false;
    }


    // An optimized method for searching in a sorted array
    public static boolean search_sorted(double[] array, double key) {
        for (int index = 0; index < array.length ; index++) {
        if (array[index] >= key){
            if (array[index] == key) {
                return true;

            }
            return false;
            }
        }
        return false;
    }

    
    //  A method for the binary-search
    public static boolean binary_search(double[] array, double key) {
        int first = 0;
        int last = array.length-1;

        while (true) {
            // jump to the middle
            int index = first + ((last - first)/2);

            if (array[index] == key) {
            // hmm what now?
            return true;
            }

            if (array[index] < key && index < last) {
            // The index position holds something that is less than
            // what we're looking for, what is the first possible page?
            first = index + 1;
            continue;
            }
            if (array[index] > key && index > first) {
            // The index position holds something that is larger than
            // what we're looking for, what is the last possible page?
            last = index - 1 ;
            continue;
            }
            // Why do we land here? What should we do?
            // Asnswer: The key does not exist in the array. We should break the while loop
            
            break;
        }
        return false;
        }

    public static boolean binary_search_rec (double [] array , double key , int min, int max){

        int mid = ( min + max )/2;
        if ( array [ mid ] == key ){
         return true ;
        }
        if (( array [ mid ] > key ) & ( mid > min )){
            binary_search_rec ( array , key , min , mid -1);
        }
        else if ( mid < max ){
            binary_search_rec ( array , key , mid + 1 , max );
        }
        return false;
    }


    public static boolean binary_search_rec (double [] array , double key ) {
        return binary_search_rec ( array , key , 0 , array . length - 1);
        }

    // a method which generate a sorted array
    public static double[] sorted(int n) {
        Random rnd = new Random();
        double[] array = new double[n];
        int nxt = 0;
        for (int i = 0; i < n ; i++) {
        nxt += rnd.nextInt(10) + 1;
        array[i] = nxt;
        }
        return array;
        }

    // A sort function to sort an array
    public static double[] utbytessortering (double[] p)
	{
		int    i = 0;
		while(i < p.length - 1)
		{
			int    j = i + 1;
			while (j < p.length)
			{
				if (p[j] < p[i])
				{
					double u = p[j];
					p[j] = p[i];
					p[i] = u;
				}
				j++;
			}
			i++;
		}
		return p;
	}


    public static void main(String[]args){
        Random rnd = new Random();
        int [] number = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600};
        boolean search;
        int loop = 10000;

        long totalTime_unsorted = 0; 
        long totalTime_sorted = 0;  
        long totalTime_binary = 0;
        System.out.printf("-----------------------------------------------------------\n");
        System.out.printf("%-15s %-15s %-15s %-10s \n", "NUMBER" , "UNSORTED" , "SORTED" , "BINARY");
        System.out.printf("-----------------------------------------------------------\n");

        for(int j=0; j<number.length; j++){

            for(int i=0; i<loop; i++){
                double [] array = duplicate.unsorted(number[j]);
                double key = rnd.nextInt(number[j]);


                // // start to calculate the time
                // long t0 = System.nanoTime();

                // // // call the method search_unsorted
                // search = search_unsorted(array,key);

                // // stop calculating of the time
                // long t1 = System.nanoTime();

                // // sum up the time for every iteration 
                // totalTime_unsorted += (t1 - t0);


                //start to calculate the time
                long t2 = System.nanoTime();

                // // call the method search_sorted 
                search = binary_search_rec(array, key); 

                // stop calculating of the time
                long t3 = System.nanoTime();

                // sum up the time for every iteration 
                totalTime_sorted += (t3 - t2);


                // start to calculate the time
                long t4 = System.nanoTime();

                //call the method binary_search
                search = binary_search(array, key);

                // stop calculating of the time
                long t5 = System.nanoTime();
                //t_array[i] = (t1 - t0);

                // sum up the time for every iteration 
                totalTime_binary += (t5 - t4);

            }
            
            System.out.println( number[j] + " \t\t" + (totalTime_unsorted/loop) + " ns." +  " \t" + (totalTime_sorted/loop) + " ns."
            +  " \t" + (totalTime_binary/loop) + " ns.");
        }
        System.out.printf("-----------------------------------------------------------\n");
    }
}