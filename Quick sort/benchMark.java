import java.util.Random;

public class benchMark {
    public static void main (String[] args){
        Random rnd = new Random();
        int[] number = {100, 1000, 10000, 20000, 30000, 50000, 80000, 100000, 120000, 200000};
        
        System.out.printf("------------------------------------------------------------------------------------- \n");
        System.out.printf("%-15s %-23s %-10s \n", "NUMBER" , "QS Array" , "QS Linked List");
        System.out.printf("--------------------------------------------------------------------------------------\n");
        
        for(int i=0; i<number.length; i++){
            
            int [] arr = new int[number[i]];
            for(int j=0; j<arr.length; j++){
                arr[j] = rnd.nextInt(10000);
            }
            
            LinkedList ll = LinkedList.LLGenerator(arr);

            long t2 = System.nanoTime();
            ll.QuickSort(ll.head, ll.end);
            long totalTimeLL = (System.nanoTime() - t2); 

            boolean valid = true;
            while(ll.head.next != null){
                if(ll.head.data > ll.head.next.data)
                    valid = false;
                
                ll.head = ll.head.next;
            }

            long t0 = System.nanoTime();
            QuickSortArr.sort(arr, 0, arr.length-1);
            long totalTimeArr = (System.nanoTime() - t0); 
            
            System.out.println("Is Linked List Ordered: "+ valid);
            System.out.println(number[i] + " \t\t" +(totalTimeArr)/1000 + " us." + " \t\t" +(totalTimeLL)/1000 + " us." );
        }
        System.out.printf("--------------------------------------------------------------------------------------\n");
    }
}
