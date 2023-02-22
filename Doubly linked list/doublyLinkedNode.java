import java.util.*;
class doublyLinkedNode{
    int data;
    doublyLinkedNode nextNode;
    doublyLinkedNode previousNode;

    public int getData(){
        return this.data;
    }

    public doublyLinkedNode getNextNode(){
        return nextNode;
    }

    public doublyLinkedNode getPreviousNode(){
        return previousNode;
    }

    public void setData(int value){
        this.data = value;
    }

    public void setNextNode(doublyLinkedNode node){
        this.nextNode = node; 
    }

    public void setPreviousNode (doublyLinkedNode node){
        this.previousNode = node;
    }

    // construct a doubly linked list
    public static class doublyLinkedList {
        doublyLinkedNode head;
        doublyLinkedNode tail;
        int size;

        // public void addNode(doublyLinkedNode node){
        //     if(head == null){
        //         head = node;
        //     }
        //     else{

        //         node.nextNode = head;
        //         head.previousNode = node;
        //         node.previousNode = null;
        //         head = node;
        //     }

        // }
        
        public void addNode(doublyLinkedNode node){
           if(head == null && tail == null){
            tail = node;
           }
           else{
            head.previousNode = node;
           }
           node.nextNode = head;
           head = node;
        }

        // public void addNode(int value){
        //     doublyLinkedNode newNode = new doublyLinkedNode();
        //     newNode.data = value;
        //     newNode.nextNode = head;
        //     if(head != null){
        //         head.setPreviousNode(newNode);
        //     }
        //     head = newNode;
        // }


        //to remove a node from the doubly linked list
        public void removeNode(doublyLinkedNode node){
            if(node.previousNode != null){
                node.previousNode.nextNode = node.nextNode; 
            }
            if(node.nextNode != null){
                if(node.previousNode == null){
                    head = node.nextNode;
                }
                node.nextNode.previousNode = node.previousNode;
                node.nextNode = null;
            } 
        }
        // public void removeNode(int value){
        //    if(head != null){
        //        if(head.data == value){
        //            if(head.nextNode != null){
        //                head.nextNode.previousNode = head.previousNode;
        //                head = head.nextNode;
        //             }
        //             else{
        //                 head.nextNode = null;
        //             }
        //         }
        //         else{
        //             doublyLinkedNode currNode = head;
        //             while(currNode != null && currNode.data != value){
        //                 if(currNode.data == value)
        //                     break;
        //                 currNode = currNode.nextNode;
        //             }
        //             if(currNode == null){
        //                 System.out.println("The node does not exist!!");
        //                 System.exit(-1);
        //             }
        //             if(currNode.nextNode !=null){
        //                 currNode.nextNode.previousNode = currNode.previousNode;
        //             }
        //             currNode.previousNode.nextNode = currNode.nextNode;
        //     }
        //    }
        // }

        // to display the nodes in a doubly linked list
        public void display() {
                doublyLinkedNode nxt = head;
                while (nxt.nextNode != null) {
                    System.out.println(nxt.data);
                    nxt = nxt.nextNode;
                }
                System.out.println(nxt.data);
                System.exit(-1);       
        }
        
    }

    // public static void main(String[] args){
    //     doublyLinkedList dll = new doublyLinkedList();
    //     doublyLinkedNode n1 = new doublyLinkedNode();
    //     n1.setData(5);       
    //     dll.addNode(n1);
    //     doublyLinkedNode n2 = new doublyLinkedNode();
    //     n2.setData(15);       
    //     dll.addNode(n2);
    //     doublyLinkedNode n3 = new doublyLinkedNode();
    //     n3.setData(25);       
    //     dll.addNode(n3);
    //     doublyLinkedNode n4 = new doublyLinkedNode();
    //     n4.setData(35);       
    //     dll.addNode(n4);
       
          
    //     dll.removeNode(n1);
    //     dll.addNode(n1);
    //     dll.removeNode(n4);
    //     dll.addNode(n4);
    //     dll.removeNode(n2);
    //     dll.addNode(n2);
    //     // dll.removeNode(n3);


    //     System.out.println("HEAD; " + dll.head.getData());
    //     dll.display();

    // }

    
}