import java.util.*;
public class benchMark {
    public static void main (String[] args){
        int[] number = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600};
        int loop = 100000;
        int k = 100;

        System.out.printf("------------------------------------------------------------------------------------- \n");
        System.out.printf("%-15s %-23s %-10s \n", "NUMBER" , "Linked List" , "Doubly Linked List");
        System.out.printf("--------------------------------------------------------------------------------------\n");
        
        for(int i=0; i<number.length; i++){
            linkedNode.linkedList ll = new linkedNode.linkedList();
            doublyLinkedNode.doublyLinkedList dll = new doublyLinkedNode.doublyLinkedList();
            double totalTimeLL = 0;
            double totalTimeDLL = 0;
            
            // create a single linked list with values of 0-up to the number[i]
            // save the references in the refArrLL
            linkedNode [] refArrLL = new linkedNode[number[i]];
            for(int t=0; t<number[i]; t++){
                linkedNode newNode = new linkedNode();
                newNode.setData(t);
                ll.addNode(newNode);
                refArrLL[t]= newNode;
            }
            
            // create a doubly linked list with values of 0-up to the number[i]
            // save the references in the refArrDLL
            doublyLinkedNode [] refArrDLL = new doublyLinkedNode[number[i]];
            for(int t=0; t<number[i]; t++){
                doublyLinkedNode newNode = new doublyLinkedNode();
                newNode.setData(t);
                dll.addNode(newNode);
                refArrDLL[t] = newNode;
            }
            
            
            // create a sequence of number randomly from o up to the number[i];
            int[] sequence = new int[k];
            Random rnd = new Random();
            for (int j = 0; j < sequence.length; j++) {
                sequence[j] = rnd.nextInt(number[i]);
            }
            
            
            
            for(int p=0; p<loop; p++){
                
                double t0 = System.nanoTime();
                
                for(int a=0; a<k; a++){
                    
                    ll.removeNode(refArrLL[sequence[a]].data);
                    ll.addNode(refArrLL[sequence[a]]);
                   
                }

                double t1 = System.nanoTime();

                totalTimeLL += (t1-t0); 
            }
            
            
            for(int p=0; p<loop; p++){

                double t0 = System.nanoTime();

                for(int a=0; a<k; a++){
                    dll.removeNode(refArrDLL[sequence[a]]);
                    dll.addNode(refArrDLL[sequence[a]]);
                    //dll.display();
                   
                }

                double t1 = System.nanoTime();

                totalTimeDLL += (t1 - t0);
            }
            System.out.println(number[i] + " \t\t" + (long)(totalTimeLL/(loop*k)) + " ns." + " \t\t" +(long)(totalTimeDLL/(loop*k)) + " ns." );
        }
        System.out.printf("--------------------------------------------------------------------------------------\n");
    }
}
    

