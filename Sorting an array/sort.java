import java.util.*;
class java{

    // third stage of function sort by merging the arrays
    private static void merge(int[] org, int[] aux, int lo, int mid, int hi) {
        // copy all items from lo to hi from org to aux
        for (int i=lo; i<=hi; i++) {
            aux[i] = org[i];
        }

        // let's do the merging
        int i = lo; // the index in the first part
        int j = mid+1; // the index in the second part

        // for all indeces from lo to hi
        for ( int k = lo; k <= hi; k++) {
            // if i is greater than mid, move the j item to the org array, update j
            if(i>mid && j<=hi){
                org[k] = aux[j++]; 
            }

            // else if j is greate than hi, move the i item to the org array, update i
            else if(j>hi && i<=mid){
                org[k] = aux[i++];
            }

            // else if the i item is smaller than the j item,
            // move it to the org array, update i
            else if(aux[i]<aux[j] && i<=mid){
                org[k] = aux[i++];
            }

            // else you can move the j item to the org array, update j
            else if(j<=hi)
            org[k] = aux[j++];
        }
    }


    // second stage of function sort 
    private static void sort(int[] org, int[] aux, int lo, int hi) {
        if (lo != hi) {
        int mid = lo + (hi-lo)/2;

        // sort the items from lo to mid
        sort(org, aux, lo, mid);

        // sort the items from mid+1 to hi
        sort(org, aux, mid+1, hi);

        // merge the two sections using the additional array
        merge(org, aux, lo, mid, hi);
        }
    }


    // first stage of function sort
    public static void sort(int[] org) {
        if (org.length == 0)
        return;
        int[] aux = new int[org.length];
        sort(org, aux, 0, org.length -1);
    }


    // a function which sort the elements in an array by inserting 
    public static void insertionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            // for each element from i towards 1, swap the item found with the
            // item before it if it is smaller

            for (int j = i; j > 0 && array[j] < array[j-1]; j--) {

                int tempurary = array[j];
                array[j] = array[j-1];
                array[j-1] = tempurary;
               
            }
        }
    }           


    // a function which sort the elements in an array by chosing the min value and swaping to the right place
    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length -1; i++) {
            // let's set the first candidate to the index itself
            int cand = i;
            for (int j = i; j < array.length ; j++) {
            // If the element at position j is smaller than the value
            // at the candidate position - then you have a new candidate
            // posistion.
                if(array[j]<array[cand]){
                    cand = j;
                }
            }
            // Swap the item at position i with the item at the candidate position.
            int temp = array[i];
            array[i] = array[cand];
            array[cand] = temp;
        }
    }



    // a method to generate an unsorted array
    public static int[] unsorted(int n) {
        Random rnd = new Random();
        int[] array = new int[n];

        for (int i = 0; i < n ; i++) {
        array[i] = (rnd.nextInt(10)+2) * rnd.nextInt(10);   
        }

        return array;
        }



    public static void main(String[] args){
        // int [] arr = {3,2,1,9,12,5,34,17,-34,12,-78};
        // insertionSort(arr);
        // System.out.println(Arrays.toString(arr));    


        // BENCHMARK
        int [] number = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600};
        int loop = 10000;


        System.out.printf("---------------------------------------------------------------------------\n");
        System.out.printf("%-15s %-23s %-23s %-10s \n", "NUMBER" , "SELECTION SORT" , "INSERTION SORT" , "MERGE SORT");
        System.out.printf("---------------------------------------------------------------------------\n");
        
        for(int j=0; j<number.length; j++){
            
            Double min_selection = Double.POSITIVE_INFINITY;
            Double min_insertion = Double.POSITIVE_INFINITY;
            Double min_merge = Double.POSITIVE_INFINITY;

            for(int i=0; i<loop; i++){
                // to create an unsorted array
                int[] array = unsorted(number[j]);
                
                
                // // INSERTION SORT
                // // start to calculate the time
                // double t2 = System.nanoTime();
    
                // // call the method insertionSort
                // insertionSort(array);                
    
                // // stop calculating of the time
                // double t3 = System.nanoTime();
    
                // // calculate the execution time  
                // double time_insertion = (t3 - t2);
                
                // // find the minimum execution time
                // if(time_insertion < min_insertion){
                //     min_insertion = time_insertion;
                // }
                
                // SELECTION SORT
                // start to calculate the time
                double t0 = System.nanoTime();
                
                // // call the method selectionSort
                selectionSort(array);
                
                // stop calculating of the time
                double t1 = System.nanoTime();
                
                // calculate the execution time  
                double time_selection = (t1 - t0);
                
                // find the minimum execution time
                if(time_selection < min_selection){
                    min_selection = time_selection;
                }
                
                
                
                // // MEGE SORT
                // // start to calculate the time
                // double t4 = System.nanoTime();
                
                // // // call the method insertionSort
                // sort(array);
                
                // // stop calculating of the time
                // double t5 = System.nanoTime();
                
                // // calculate the execution time  
                // double time_merge = (t5 - t4);
                
                // // find the minimum execution time
                // if(time_merge < min_merge){
                //     min_merge = time_merge;
                // }
                
            }
            
            System.out.println( number[j] + " \t\t" + (min_selection) + " ns." +  " \t\t" + (min_insertion) + " ns." +  
            " \t\t" + (min_merge) + " ns.");

        }
        System.out.printf("---------------------------------------------------------------------------\n");
    }


}