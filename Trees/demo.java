import java.util.*;
public class demo{
     public static void main (String[] args){
   

        //root.print();



        BinaryTree tree = new BinaryTree();
        
        tree.add(5,105);
        tree.add(2,102);
        tree.add(7,107);
        tree.add(1,101);
        tree.add(8,108);
        tree.add(6,106);
        tree.add(3,103);
        tree.add(10, 110);

        //System.out.println(tree.lookup(3));
        for (int i : tree){
            System.out.println("next value " + i);
            //tree.add(4, 200);
        }



        // Benchmark of lookup
    //     Random rnd = new Random();
    //     int [] number = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600};
    //     int value;
    //     int loop = 10000;

    //     long totalTime_LU = 0;
    //     System.out.printf("-----------------------------------------------------------\n");
    //     System.out.printf("%-15s %-15s %-15s %-10s \n", "NUMBER" , "UNSORTED" , "SORTED" , "BINARY");
    //     System.out.printf("-----------------------------------------------------------\n");

    //     for(int j=0; j<number.length; j++){

    //         for(int i=0; i<loop; i++){
    //             Integer key = rnd.nextInt(number[j]);

    //             BinaryTree treeLU = new BinaryTree();
    //             for(int t=0; t<number.length; t++ ){
    //                 treeLU.add(i, rnd.nextInt(number.length));
    //             }


    //             // start to calculate the time
    //             long t4 = System.nanoTime();

    //             //call the method lookup
    //             value = treeLU.lookup(key);

    //             // stop calculating of the time
    //             long t5 = System.nanoTime();

    //             // sum up the time for every iteration 
    //             totalTime_LU += (t5 - t4);

    //         }
            
    //         System.out.println( number[j] + " \t\t" + (totalTime_LU/loop) + " ns.");
    //     }
    //     System.out.printf("-----------------------------------------------------------\n");
    }
}

