import java.util.*;

public class duplicate {

    // a method to generate an unsorted array
    public static double[] unsorted(int n) {
       Random rnd = new Random();
       double[] array = new double[n];
       int nxt = 0;
       for (int i = 0; i < n ; i++) {
       nxt = rnd.nextInt(10) * rnd.nextInt(10);
       array[i] = nxt;
       }
       return array;
       }

    // a method which calculates the runtime for finding the duplicates in an unsorted array
    public static double findDup_unsorted(double[]array, double[]keys){
        int loop = 10000;
        long t_total = 0;
        int sum = 0;

        for(int i=0; i<loop; i++){
            long t0 = System.nanoTime();
            for (int j = 0; j < keys.length; j++) {
                double key = keys[j];
                for (int k = 0; k < array.length ; k++) {
                    if (array[k] == key) {
                        sum++;
                    }
                }
            }
            t_total += (System.nanoTime() - t0);
        }
        return ((double)(t_total))/ ((double)loop);
    }

    // a method which calculates the runtime for finding the duplicates in a sorted array
    public static double findDup_sorted(double[]array, double[] keys){
        double[] array_sorted = Search.utbytessortering(array);
        double[] keys_sorted = Search.utbytessortering(keys);

        boolean search;
        int loop = 10000;
        long t_total = 0;
        int sum = 0;

        for(int i=0; i<loop; i++){

            long t0 = System.nanoTime();
            for (int j = 0; j < keys_sorted.length; j++) {
                double key = keys_sorted[j];
                search = Search.binary_search(array_sorted, key);
                if(search){
                    sum++;
                }
            }
            t_total += (System.nanoTime() - t0);
        }
        return ((double)(t_total))/ ((double)loop);
    }


    // an optimized algorithm that keeps track of next element which can be used for sorted arrays
    public static double optimized_findDup(double[] array, double[] keys){
        int sum = 0;
        int loop = 10000;
        long t_total = 0;
        
        // for loop will executes a number of times and the average time will be calculated
        for(int k=0; k<loop; k++){      
            int i = 0;
            long t0 = System.nanoTime();
            for(int j=0; j<keys.length; j++){ 
                // if keys[j]==array[i] then its a hit and sum++ and then continue
                if(keys[j] == array[i]){    
                    sum++;
                    continue;
                }
                // if keys[j] < array[i] and we are not at the end of the keys_array then continue
                if(keys[j] < array[i] && j<keys.length-1){   
                    continue;
                }
                // if keys[j] > array[i] and we are not at the end of array then increment the index of array and decrement
                // the index of keys_array and then continue
                if(keys[j] > array[i] && i<array.length-1){  //
                    i++;
                    j--;
                    continue;
                }
            }
            // sum up the runtime for every iteration in variabel t_total
            t_total += (System.nanoTime() - t0);
            
        }
        // return the average time to find duplicates by dividing t_total over number of loops
        return ((double)(t_total))/loop;
    }

    public static void main(String[] args){
        int []number = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600};

        System.out.printf("-------------------------------------------------------------------------\n");
        System.out.printf("%-15s %-23s %-23s %-15s \n", "NUMBER" , "UNSORTED" , "SORTED" , "OPTIMIZED");
        System.out.printf("-------------------------------------------------------------------------\n");
        
        for(int i=0; i<number.length; i++){
            double [] array_unsorted = unsorted(number[i]);
            double [] keys_unsorted = unsorted(number[i]);
            
            double [] array_sorted = Search.sorted(number[i]);
            double [] keys_sorted = Search.sorted(number[i]);

            // // comparing the runtime between findDup_sorted method and findDup_unsorted method by sending two unsorted arrays to the both 
            // System.out.println(number[i] + "\t\t" + (int)(findDup_unsorted(array_unsorted, keys_unsorted)) + " ns." + "\t\t" + 
            // (int)(findDup_sorted(array_unsorted, keys_unsorted)) + " ns.");
            
            //comparing the runtime between findDup_sorted method, findDup_unsorted method and optimized_findDup by sending two sorted 
            // arrays to all three methods 
            System.out.println(number[i] + "\t\t" + (int)(findDup_unsorted(array_sorted, keys_sorted)) + " ns." + "\t\t" + 
            (int)(findDup_sorted(array_sorted, keys_sorted)) + " ns." + "\t\t" + (int)(optimized_findDup(array_sorted, keys_sorted)) + " ns.");
        
        } 
        System.out.printf("-------------------------------------------------------------------------\n");
        
        
    //     double[] a1 = {2, 8, 10, 13, 16};
    //     double[] a2 = {3, 5, 8, 13, 17};
        
    //     System.out.println("RUNTIME: " + optimized_findDup(a1, a2));
        
    }
    
}
