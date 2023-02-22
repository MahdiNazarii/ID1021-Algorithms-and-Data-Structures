import java.util.*;
public class linkedNode {
    int data;
    linkedNode nextNode;

    public int getData(){
        return this.data;
    }

    public linkedNode getNextNode(){
        return nextNode;
    }
    

    public void setData(int value){
        this.data = value;
    }

    public void setNextNode(linkedNode node){
        this.nextNode = node; 
    }

    public static class linkedList{
        linkedNode head;
        int size;

        // public void addNode(int value){
        //     linkedNode newNode = new linkedNode();
        //     newNode.setData(value);
        //     if(head != null){
        //         newNode.nextNode = head;
        //     }
        //     head = newNode;
        // }

        public void addNode(linkedNode node){
           // System.out.println("Income node " + node.data);
            if(head == null){
                head = node;
            }
            else{
                node.nextNode = head;
                head = node; 
                //System.out.println("Added node " + node.data);   
            }
        }

        // public void removeNode(linkedNode node){
        //     linkedNode newNode = node;
        //     if(newNode.nextNode != null){
        //             newNode.data = newNode.nextNode.data;
        //             newNode.nextNode = newNode.nextNode.nextNode;
        //         }
        //         else{
        //             linkedNode last = head;
        //             linkedNode previousToLast = null;
        //             while(last.nextNode != null){
        //                 previousToLast = last;
        //                 last = last.nextNode;
        //             }
        //             previousToLast.nextNode = null;   
        //         }

        // }
        public void removeNode(int value){
           if(head != null){
            linkedNode currNode = head;
            if(head.data == value){
                head = head.nextNode;
            }
            else{
                linkedNode prevNode = null;
                while(currNode != null && currNode.data != value){
                    prevNode = currNode;
                    currNode = currNode.nextNode;
                }
                if(currNode != null){
                    prevNode.nextNode = currNode.nextNode;
                }
            }
        }
        }

         // a function which can show the nodes in a linked list
        public void display() {
            linkedNode nxt = head;
            while (nxt != null) {
                System.out.println(nxt.data);
                nxt = nxt.nextNode;
            }
            System.exit(-1);        
        }
    }

    public static void main (String[] args){
        // int k = 2;
        // int[] sequence = new int[k];
        // linkedList ll = new linkedList();
        // linkedNode [] arrayRef = new linkedNode[k];
        // Random rnd = new Random();

        //     for (int j = 0; j < sequence.length; j++) {
        //             arrayRef[j].setData(rnd.nextInt(k)); 
        //         }
            
        //     for(int t=0; t<10; t++){
        //         linkedNode newNode = new linkedNode();
        //         newNode.setData(t);
        //         ll.addNode(newNode);
        //     }
        //     ll.display();

        // linkedList ll = new linkedList();
        // linkedNode n1 = new linkedNode();
        // n1.setData(5);
        // ll.addNode(n1);
        // linkedNode n2 = new linkedNode();
        // n2.setData(10);
        // ll.addNode(n2);
        // linkedNode n3 = new linkedNode();
        // n3.setData(15);
        // ll.addNode(n3);
        // linkedNode n4 = new linkedNode();
        // n4.setData(20);
        // ll.addNode(n4);
       
        // //System.out.println(n1.data);
        // ll.removeNode(10);
        // //System.out.println(n1.data);
        // // ll.removeNode(n1);
        // //System.out.println("HEAD: " + ll.head.getData());
        // ll.addNode(n2);
        // ll.removeNode(15);
        // ll.addNode(n3);
        // ll.removeNode(5);
        // ll.addNode(n1);
        // ll.removeNode(5);
        // ll.addNode(n1);
        // ll.removeNode(15);
        // ll.addNode(n3);
        // ll.display();

    }
}
