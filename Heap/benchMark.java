import java.util.Random;

public class benchMark {
    public static void main(String[] args){
        // benchmark priority queue with a linked list
    //     Random rnd = new Random();
    //     int [] number = {100, 200, 300, 400, 500, 600, 700, 800};
    //     int loop = 1000;

    //     System.out.printf("------------------------------------------------------------------------------------- \n");
    //     System.out.printf("%-15s %-23s %-10s \n", "NUMBER" , "Implemetion 1" , "Implemetion 2");
    //     System.out.printf("--------------------------------------------------------------------------------------\n");

    //     for(int i=0; i<number.length; i++){
          
    //         double min_t_imp1 = Double.POSITIVE_INFINITY;;
    //         double min_t_imp2 = Double.POSITIVE_INFINITY;;
        
        
    //         for(int a=0; a<loop; a++){
    //             PQLinkedList imp1 = new PQLinkedList();
    //             PQLinkedList imp2 = new PQLinkedList();

    //             int[] arr = new int[number[i]];
    //             for(int t = 0; t < arr.length; t++){
    //                 arr[t] = (rnd.nextInt(1000));
    //             }


    //             double t0 = System.nanoTime();
    //             for(int j=0; j<number[i]; j++){
    //                 imp1.add(arr[j]);
    //             }
    //             for(int j=0; j<number[i]; j++){
    //                 imp1.remove();
    //             }
    //             double t1 = System.nanoTime();

    //             double t_imp1 = (t1-t0);
    //             if(t_imp1 < min_t_imp1){
    //                 min_t_imp1 = t_imp1;
    //             }



    //             double t2 = System.nanoTime();
    //             for(int s=0; s<number[i]; s++){
    //                 imp2.addOrdered(arr[s]);
    //             }
    //             for(int s=0; s<number[i]; s++){
    //                 imp2.removeOrdered();
    //             }
    //             double t3 = System.nanoTime();


    //             double t_imp2 = (t3-t2);
    //             if(t_imp2 < min_t_imp2){
    //                 min_t_imp2 = t_imp2;
    //             }
    //         }

        
    //         System.out.println( number[i] + " \t\t" + (long)(min_t_imp1/1000) + " us." + " \t\t" + (long)(min_t_imp2/1000) + " us."); 
    // }
    // System.out.printf("--------------------------------------------------------------------------------------\n");

        
    
//////////////////////////////////////////////////////////////////////////////////////////////
    // benchmark heap
    // heap hp = new heap();
    // Random rnd2 = new Random();

    // // create a heap by random values with 64 nodes
    // for(int i=0;i < 64; i++){
    //     hp.add((rnd2.nextInt(101)));
    // }

    // // create a random sequence of values that haep should be pushed and added with
    // int[] array = new int[1000000];
    // for(int i = 0; i < array.length; i++){
    //     array[i] = (rnd2.nextInt(11))+10;
    // }

    // // benchmark push method
    // int totDepthPush = 0;
    // for(int i=0; i<array.length; i++){
    //     totDepthPush += hp.push(array[i]);
    //    // System.out.println("Push[" + (i+1) + "]=" + "Depth " + hp.push(array[i]));
    // }
    // System.out.println("\n\nAVERAGE DEPTH FOR PUSH: " + (totDepthPush/array.length));


    // // benchmark add method
    // int totDepthAdd = 0;
    // for(int i=0; i<array.length; i++){
    //     totDepthAdd += hp.add(array[i]);
    //     //System.out.println("Add[" + (i+1) + "]=" + "Depth " + hp.add(array[i]));
    // }
    // System.out.println("AVERAGE DEPTH FOR ADD: " + (totDepthAdd/array.length));


///////////////////////////////////////////////////////////////////////////////////////////////

    //benchmark heap linked list vs heap array
    // Random rnd = new Random();

    // int [] number = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000, 11000, 12000, 13000, 14000, 15000, 16000};
    // int loop = 5;
    
    // System.out.printf("------------------------------------------------------------------------------------- \n");
    // System.out.printf("%-15s %-23s %-10s \n", "NUMBER" , "heap LL" , "heap Array");
    // System.out.printf("--------------------------------------------------------------------------------------\n");
    // for(int i=0; i<number.length; i++){
        
    //     double min_t_heapll = Double.POSITIVE_INFINITY;;
    //     double min_t_heapArr = Double.POSITIVE_INFINITY;;
           double min_t_imp2 = Double.POSITIVE_INFINITY;
        
        
    //     for(int a=0; a<loop; a++){
    //         heap heapll = new heap();
    //         heapArray heapArr = new heapArray();
               PQLinkedList imp2 = new PQLinkedList();


    //         int[] arr = new int[number[i]];
    //         for(int t = 0; t < arr.length; t++){
    //             arr[t] = (rnd.nextInt(10))+10;
    //         }

            
    //         long t0 = System.nanoTime();
    //         for(int j=0; j<arr.length; j++){
    //             heapll.add(arr[j]);
    //         }
    //         for(int j=0; j<arr.length; j++){
    //             heapll.remove();
    //         }
    //         long t1 = System.nanoTime();

    //         double t_heapll = (t1-t0);
    //         if(t_heapll < min_t_heapll){
    //             min_t_heapll = t_heapll;
    //         }


            
    //         long t2 = System.nanoTime();
    //         for(int s=0; s<arr.length; s++){
    //             heapArr.insert(arr[s]);
    //         }
    //         for(int s=0; s<arr.length; s++){
    //             heapArr.remove();
    //         }
    //         long t3 = System.nanoTime();


    //         double t_heapArr = (t3-t2);
    //         if(t_heapArr < min_t_heapArr){
    //             min_t_heapArr = t_heapArr;
    //         }
    //     }

      
    //     System.out.println( number[i] + " \t\t" + (long)(min_t_heapll/1000) + " us." + " \t\t" + (long)(min_t_heapArr/1000) + " us."); 
    // }
    
    // System.out.printf("--------------------------------------------------------------------------------------\n");

    }
}
