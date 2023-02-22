class PQLinkedList{
    Node head;
    Node end;
    
    private class Node {
        int item;
        Node tail;

        private Node(int item, Node list) {
            this.item = item;
            this.tail = list;
        }

    }

    // an optimized version of add 
    public void add(int item) {
        if(head == null){
            head = new Node(item, null);
            end = head;
        }
        else{
            Node newNode = new Node(item, null);
            this.end.tail = newNode;
            this.end = newNode;  
        }
    }


    public int remove() {
       Node minValue = head;
       Node curr = this.head;
       Node prev = null;

       while(curr.tail != null){
        if(curr.tail.item < minValue.item){
            minValue = curr.tail;
            prev = curr;
        }
        curr = curr.tail;
       }
       if(minValue == head){
        head = head.tail;
       }
       else{
        prev.tail = minValue.tail;
        minValue.tail = null;
       }

        return minValue.item;
    }


    public void addOrdered(int item){
        Node newNode = new Node(item, null);
        if(head == null){
            head = newNode;   
        }
        else{
            if(newNode.item < head.item){
                newNode.tail = head;
                head = newNode;
            }
            else{
                Node curr = head;
                while(curr.tail != null){
                    if(newNode.item < curr.tail.item){
                        newNode.tail = curr.tail;
                        curr.tail = newNode;
                        return;
                    }
                    curr = curr.tail;
                }
                curr.tail = newNode;
            }
        }
    } 


    public int removeOrdered(){
        Node removedNode = head;
        head = head.tail;
        return removedNode.item;
    }

    
    public void display() {
        Node nxt = this.head;
        while(nxt != null){
            while (nxt.tail != null) {
                System.out.print(nxt.item + "\t");
                nxt = nxt.tail;
            }
            System.out.print(nxt.item + "\n");
            return;      
        }
        System.out.println(" ");
    }
}