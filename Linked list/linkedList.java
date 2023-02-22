import java.util.*;

public class linkedList{
    int head;
    linkedList tail;


    public linkedList(int item, linkedList list) {
        head = item;
        tail = list;
        }

    public int head() {
        return this.head;
        }
    

    public linkedList tail() {
    return this.tail;
    }

    // a function which append list b to the current list
    public void append(linkedList b) {
        linkedList nxt = this;
        while (nxt.tail != null) {
        nxt = nxt.tail;
        }
        nxt.tail = b;
    }

    // a function which can show the nodes in a linked list
    public void show() {
        linkedList nxt = this;
        while (nxt.tail != null) {
            System.out.println(nxt.head);
            nxt = nxt.tail;
        }
        System.out.println(nxt.head);
        System.exit(-1);        
    }

    // a functio which generate a linked list with a number of nodes
    public static linkedList listGenerater(int size){
        Random rnd = new Random();
        linkedList listB = new linkedList(rnd.nextInt(100), null);

        for(int i=0; i<size-1; i++){
            linkedList list2 = new linkedList(rnd.nextInt(100), null);
            listB.append(list2);
        }
        return listB;

    }

    // a function which append array b to the array a
    public static void allocArray(int[]a, int[]b){

        int[] newArray = new int[(a.length) + (b.length)];
        for(int i=0; i<newArray.length; i++){
            for(int j=0; j<a.length;j++){
                newArray[i++] = a[j];
            }
            for(int t=0; t<b.length; t++){
                newArray[i++] = b[t];
            }
        }
    }

    // a function which generate an array of determined size
    public static int[] arrayGenerater(int size){
        Random rnd = new Random();
        int [] newArray = new int[size];
        for(int i=0; i<size; i++){
            newArray[i] = rnd.nextInt(100);
        }

        return newArray;
    }





    public static void main(String[] args){

        // int[] a = {2,3,4,5,6,7,8,9};
        // int[] b = {2,3,4,5,6};
        // System.out.println(Arrays.toString(allocArray(a,b)));


        // BENCHMARK 1
        int [] number = {100, 200, 300, 400, 500, 600, 700, 800};
        int loop = 10000;
       
        
        // System.out.printf("---------------------------------------------------------------------------------------------------------\n");
        // System.out.printf("%-15s %-23s %-23s %-23s %-10s \n", "NUMBER" , "Append a(v) to b(f)" , "Append a(f) to b(v)" ,
        // "Append a(v) to b(f)", "Append a(f) to b(v)");
        // System.out.printf("---------------------------------------------------------------------------------------------------------\n");
        
        // for(int i=0; i<number.length; i++){
            
        //     Double min_appendL = Double.POSITIVE_INFINITY;
        //     Double min_appendL2 = Double.POSITIVE_INFINITY;
        //     Double min_appendA = Double.POSITIVE_INFINITY;
        //     Double min_appendA2 = Double.POSITIVE_INFINITY;
            
        //     // To determine the minimum runtime with different array sizes
        //     for(int j=0; j<loop; j++){
        //         linkedList fixedList = listGenerater(100); // list b with a fixed size of 100 nodes
        //         linkedList variedList = listGenerater(number[i]);  // list a with a varied size of nodes
               
                
        //         double t0 = System.nanoTime();

        //         // append a(varied) to the b(fixed) 
        //         fixedList.append(variedList);

        //         double t1 = System.nanoTime();

        //         double time_append = (t1 - t0);
                
        //         // find the minimum execution time
        //         if(time_append < min_appendL){
        //             min_appendL = time_append;
        //         }
                
        //     }

        //     for(int j=0; j<loop; j++){
        //         linkedList fixedList = listGenerater(100);
        //         // list a
        //         linkedList variedList = listGenerater(number[i]);
                
        //         double t0 = System.nanoTime();

        //         // append b(fixed) to the a(varied)
        //         variedList.append(fixedList);

        //         double t1 = System.nanoTime();

        //         double t_append = (t1 - t0);
                
        //         // find the minimum execution time
        //         if(t_append < min_appendL2){
        //             min_appendL2 = t_append;
        //         }
        //     }

        //     for(int j=0; j<loop; j++){
        //         int [] fixedArray = arrayGenerater(100);   // array b with a fixed size of 100 elements
        //         int[] variedArrayA = arrayGenerater(number[i]); // array a
                
        //         double t0 = System.nanoTime();

        //         // append array a(varied) to the b(fixed)
        //         allocArray(fixedArray, variedArrayA);

        //         double t1 = System.nanoTime();

        //         double t_append = (t1 - t0);
                
        //         // find the minimum execution time
        //         if(t_append < min_appendA){
        //             min_appendA = t_append;
        //         }
        //     }

        //     for(int j=0; j<loop; j++){
        //         int [] fixedArray = arrayGenerater(100);   // array b with a fixed size of 100 elements
        //         int[] variedArray = arrayGenerater(number[i]); // array a
                
        //         double t0 = System.nanoTime();

        //         // append array b(fixed) to the a(varied)
        //         allocArray(variedArray, fixedArray);

        //         double t1 = System.nanoTime();

        //         double t_append = (t1 - t0);
                
        //         // find the minimum execution time
        //         if(t_append < min_appendA2){
        //             min_appendA2 = t_append;
        //         }
        //     }
        //     System.out.println( number[i] + " \t\t" + (min_appendL) + " ns." + " \t\t" + (min_appendL2) + " ns." +
        //      " \t\t" + (min_appendA) + " ns." +  " \t\t" + (min_appendA2) + " ns."); 
        // } 
        // System.out.printf("---------------------------------------------------------------------------------------------------------\n");

        // BENCHMARK 2 Allocating an array of n size VS allocating a list of n sizes
        System.out.printf("------------------------------------------------------------------------------------- \n");
        System.out.printf("%-15s %-23s %-10s \n", "NUMBER" , "Allocate a list" , "Allocate an array");
        System.out.printf("--------------------------------------------------------------------------------------\n");

        for(int i=0; i<number.length; i++){
            Double min_list = Double.POSITIVE_INFINITY;
            Double min_array = Double.POSITIVE_INFINITY;

            for(int j=0; j<loop; j++){
                
                double t0 = System.nanoTime();
                
                // To allocate a list of n sizes
                linkedList variedList = listGenerater(number[i]);
               

                double t1 = System.nanoTime();

                double t_append = (t1 - t0);
                
                // find the minimum execution time
                if(t_append < min_list){
                    min_list = t_append;
                }
            }

            for(int j=0; j<loop; j++){
                
                double t0 = System.nanoTime();
                
                // To allocate a list of n sizes
                int[] variedArray = arrayGenerater(number[i]);
               

                double t1 = System.nanoTime();

                double t_append = (t1 - t0);
                
                // find the minimum execution time
                if(t_append < min_array){
                    min_array = t_append;
                }
            }

            System.out.println( number[i] + " \t\t" + (min_list) + " ns." + " \t\t" + (min_array) + " ns."); 

        }
        
        System.out.printf("--------------------------------------------------------------------------------------\n");
    }





}