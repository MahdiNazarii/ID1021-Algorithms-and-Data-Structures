public class Queue<T> {
    Node head;
    Node end;
    
    public static class Node {
        public BinaryTree.Node item;
        public Node tail;

        public Node(BinaryTree.Node item, Node list) {
            this.item = item;
            this.tail = list;
        }

    }

    public Queue(BinaryTree.Node item) {
        head = new Node(item, null);
        end = head;
    }
    
    // public void add(Integer item) {
    //     Node newNode = new Node(item, null);
    //     Node tempNode = this.head;
    //     if(tempNode == null){
    //         head = newNode;
    //     }
    //     else{
    //         while(tempNode.tail !=null){
    //             tempNode = tempNode.tail;
    //         }
    //         tempNode.tail = newNode;
    //     }
    // }

    // an optimized version of add 
    public void add(BinaryTree.Node item) {
        Node newNode = new Node(item, null);
        this.end.tail = newNode;
        this.end = newNode;  
    }

    // a method to remove an element from the head of the queue
    public BinaryTree.Node remove() {
        BinaryTree.Node data = head.item;
        Node next = head.tail;
        head.tail = null;
        head = next;

        return data;
    }

    // A method to print the values of the elements in the queue
    public void display() {
        Node nxt = this.head;
        while(nxt != null){
            while (nxt.tail != null) {
                System.out.print(nxt.item.value + "\t");
                nxt = nxt.tail;
            }
            System.out.print(nxt.item.value + "\n");
            return;      
        }
        System.out.println(" ");
    }
}