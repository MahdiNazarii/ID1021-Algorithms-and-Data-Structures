public class LinkedList {
    Node head;
    Node end;

    public static class Node{
        int data;
        Node next;
        
        public Node(int value, Node tail){
            this.data = value;
            this.next = tail;
        }
    }

    public LinkedList(){
        this.head = null;
        this.end = null;
    }


    public void addNode(Node node){
         if(head == null){
             head = node;
             end = node;
         }
         else{
             node.next = head;
             head = node; 
         }
     }


     
     
     public static LinkedList LLGenerator(int[] array){
         LinkedList ll = new LinkedList();
         for(int i = array.length-1; i>=0; i--){
             Node newNode = new Node(array[i], null);
             ll.addNode(newNode);
            }
            return ll;
        }
     
        
    public void display() {
        Node nxt = head;
        while (nxt != null) {
            System.out.print(nxt.data + " -> ");
            nxt = nxt.next;
        }
        System.out.println();
        return;        
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////
    // Quck sort with a linked list where we swap the data of the nodes
    public void QuickSort(Node head, Node end){
        if(head == end || head == null || end == null){
            return;
        }
        Node newPivot = partition(head, end);
        QuickSort(head, newPivot);
        QuickSort(newPivot.next, end);
        
    }
    
    public Node partition(Node head, Node end){
        Node pivot = head;
        Node curr = head.next;
        Node prev = head;
        
        while(curr != end.next){
            if(curr.data < pivot.data){
                swap(curr, prev.next);
                prev = prev.next;
            }
            curr = curr.next;
        }
        swap(prev, pivot);
        return prev;
    }


    public void swap(Node a, Node b){
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }
    
    

    
    // public void append(LinkedList a, LinkedList b){
    //     if(a.end != null){
    //         a.end.next = b.head;
    //     }
    //     else{
    //         a.head = b.head;
    //         b.head = null;
    //     }
    // }



    // public void Sort(LinkedList ll){
    //     if(ll.head == ll.end || ll.head == null || ll.end == null){
    //         return;
    //     }

        
    //     Node pivot = head;
    //     LinkedList small = new LinkedList();
    //     LinkedList large = new LinkedList();
    //     Node curr = head.next;
    //     // System.out.println(end.data);

    //     ll.head.next = null;
    //     while(curr != ll.end.next){
    //         if(curr.data < pivot.data){
    //             Node tmp = curr;
    //             curr = curr.next;
    //             tmp.next = null;
    //             small.addNode(tmp);
    //         }
    //         else{
    //             Node tmp = curr;
    //             curr = curr.next;
    //             tmp.next = null;
    //             large.addNode(tmp);  
    //         }
    //         curr = curr.next;    
    //     }
    //     Sort(small);
    //     Sort(large);
    //     large.addNode(pivot);
    //     append(small, large);
    //     ll.head = small.head;
    //     ll.end = small.end;
    // }

   // public LinkedList partition(LinkedList ll, Node head, Node pivot){

   // }



    
}
