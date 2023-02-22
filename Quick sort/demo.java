import java.util.*;
public class demo {

    public static void print(int[] array){
        for(int i =0; i<array.length; i++){
            System.out.print(array[i] + "\t ");
        }
        System.out.println();
        return;
    }


    public static void main (String[] args){
        Random rnd = new Random();
        int [] arr = new int[100];
        for(int i=0; i<arr.length; i++){
            arr[i] = rnd.nextInt(1000);
        }
      
        
    LinkedList ll =  LinkedList.LLGenerator(arr);;

       System.out.println("Before: ");
       ll.display();

       boolean valid = true;
       while(ll.head.next != null){
           if(ll.head.data > ll.head.next.data)
               valid = false;
           
           ll.head = ll.head.next;
       }

       System.out.println("Is Linked List Ordered: "+ valid);

    //    long t0 = System.nanoTime();
        ll.QuickSort(ll.head, ll.end);
    //    long tLL = (System.nanoTime() - t0);
    boolean valid2 = true;
    while(ll.head.next != null){
        if(ll.head.data > ll.head.next.data)
            valid2 = false;
        
        ll.head = ll.head.next;
    }

    System.out.println("Is Linked List Ordered: "+ valid2);
    //    System.out.println("\n\nAfter: ");
    //    ll.display();
       


        // Quick sort in array
        // System.out.println("Innan: ");
        // print(arr);

        // long t2 = System.nanoTime();
        // QuickSortArr.sort(arr, 0, arr.length-1);
        // long tArr =(System.nanoTime() - t2);

        // System.out.println("\nAfter: ");
        // print(arr);

        //System.out.println(arr.length + " \t\t" +(tLL)/1000 + " us." + " \t\t" +(tArr)/1000 + " us." ); 
    }
    
}
