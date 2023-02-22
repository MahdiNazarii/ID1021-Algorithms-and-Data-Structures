public class demo {
    public static void main(String[] args){
        
        
        
        // BinaryTree tree = new BinaryTree();
        
        // tree.add(5,105);
        // tree.add(2,102);
        // tree.add(7,107);
        // tree.add(1,101);
        // tree.add(8,108);
        // tree.add(6,106);
        // tree.add(3,103);
        // tree.add(10, 110);
        
        // //System.out.println(tree.lookup(3));
        // for (int i : tree){
        //     System.out.println("next value " + i);
        
        // }
        
        // Queue q = new Queue(new BinaryTree.Node(5,105));
        // q.add(new BinaryTree.Node(2,102));
        // q.add(new BinaryTree.Node(7,107));
        // q.add(new BinaryTree.Node(1,101));
        // q.add(new BinaryTree.Node(8,108));
        // q.add(new BinaryTree.Node(6,106));
        // q.add(new BinaryTree.Node(3,103));
        // q.display();
        // System.out.println("REMOVED FROM THE QUEUE: "+ q.remove().value);
        // q.display();
        // System.out.println("REMOVED FROM THE QUEUE: "+ q.remove().value);
        // q.display();
        // System.out.println("REMOVED FROM THE QUEUE: "+ q.remove().value);
        // q.display();
        // System.out.println("REMOVED FROM THE QUEUE: "+ q.remove().value);
        // q.display();
        // System.out.println("REMOVED FROM THE QUEUE: "+ q.remove());
        // q.display();
        // System.out.println("REMOVED FROM THE QUEUE: "+ q.remove());
        // q.display();
        // System.out.println("REMOVED FROM THE QUEUE: "+ q.remove());
        // q.display();
        // q.add(new BinaryTree.Node(9,109));
        // q.display();


        QueueArray qa = new QueueArray();
        qa.insert(5);
        qa.insert(15);
        qa.insert(25);
        qa.insert(35);
        qa.insert(45);
        qa.insert(55);
        qa.insert(65);
        qa.insert(75);
        qa.insert(85);
        qa.insert(95);
        //qa.delete();
        qa.insert(105);
        qa.insert(115);
        qa.display();
        qa.delete();
        qa.delete();
        qa.delete();
        qa.delete();
        qa.delete();
        qa.delete();
        qa.delete();
        qa.delete();
        qa.delete();
        qa.delete();
        qa.delete();
        qa.delete();
        qa.display();
        System.out.println("The Array capacity:" + qa.N);
        qa.insert(5);
        qa.insert(15);
        qa.insert(25);
        qa.insert(35);
        qa.insert(45);
        qa.insert(55);
        qa.insert(65);
        qa.insert(75);
        System.out.println("The Array capacity:" + qa.N);
        qa.display();
        
        
        // System.out.println("The front is:" + qa.front);
        // System.out.println("\nThe rear is:" + qa.rear);
        // System.out.println("The Array Size:" + qa.size);
        // System.out.println("arr[0]: " + qa.arr[0]);
        // System.out.println("arr[9]: " + qa.arr[9]);
        // System.out.println("The Array capacity:" + qa.N);
        // System.out.println("The Array Size:" + qa.size);
        // System.out.println("rear: " + qa.rear);
        // qa.delete();
        // System.out.println("\nThe rear is:" + qa.rear);
        // System.out.println("The front is:" + qa.front);
        // qa.display();

        // qa.delete();
        // System.out.println("\nThe rear is:" + qa.rear);
        // System.out.println("The front is:" + qa.front);
        // qa.display();

        // qa.delete();
        // System.out.println("\nThe rear is:" + qa.rear);
        // System.out.println("The front is:" + qa.front);
        // qa.display();

        // qa.delete();
        // System.out.println("\nThe rear is:" + qa.rear);
        // System.out.println("The front is:" + qa.front);
        // qa.display();

        // qa.delete();
        // System.out.println("\nThe rear is:" + qa.rear);
        // System.out.println("The front is:" + qa.front);
        // qa.display();

        // qa.delete();
        // System.out.println("\nThe rear is:" + qa.rear);
        // System.out.println("The front is:" + qa.front);
        // qa.display();


    }
    
}
