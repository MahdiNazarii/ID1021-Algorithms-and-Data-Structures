public class QueueArray {
    int front;
    int end;
    int size = 0;
    int N = 10;
    Node[] arr = new Node[N]; // to initialize an array with size of 10 

    // a nested class of node
    public static class Node {
        public Integer item;
        public Node tail;

        public Node(Integer item, Node list) {
            this.item = item;
            this.tail = list;
        }

    }


    // to construct a Queue based on an array
    public QueueArray(){
        front = -1;
        end = -1;
    }

    // The array is empty when front and end has the initialized values -1
    public boolean isEmpty(){
        return (front == -1 && end == -1);
    }

    // the array is full when (end + 1) mod 10 is equal to front. No place to insert an element
    public boolean isFull(){
        return ((end +1) % N == front);
    }

    // A function to insert an element at the end of the queue
    public void insert(int value){
        if(isFull()){
            System.out.println("The Queue Have Been Increased!");
            increase();
        }

        if(isEmpty()){
            front = end = 0;
        }
        else {
            end = (end + 1) % N;
        }
        arr[end] = new Node(value, null);
        size++;
    }


    // a function to remove an element from the begining(front) of the array
    public void delete(){
        if(isEmpty()){
            System.out.println("The Queue Is Empty!");
            return;
        }
        else if(front == end){
            front = end = -1;
            size--;
        }
        else{
            front = (front + 1) % N;
            size--;
           decrease();
        }
        return;
    }


    // To increase the dynamic array
    public void increase(){
            Node[] newArr = new  Node[N*2];
            int j=0;
        if(end > front){
            for(int i=0; i <= (end - front); i++){
                newArr[j++] = arr[i + front];
            }
        }
        else if(front > end) {
            for(int i =front; i<N; i++){
                newArr[j++] = arr[i];
            }
            for(int t=0; t<=end; t++){
                newArr[j++] = arr[t];
            }

        }
            front = 0; 
            end = N-1; 
            arr = newArr; 
            N = N*2; 
            return;
    }
    

    // A function which will decrease the dynamic array and will free the space
    public void decrease(){
        if(size < (N/4) && N>5){
            Node[] newArr = new  Node[N/2];
            int j = 0;
            if(end >= front){
                for(int i=0; i<=(end-front); i++){
                    newArr[j++] = arr[i+front];
                }
            }
            else if(front > end){
                for(int t=0; t<N; t++){
                    newArr[j++] = arr[t];
                }
                for(int i=0; i<= end; i++){
                    newArr[j++] = arr[i];
                }
            }
            front = 0;
            end =--size;
            arr = newArr;
            N = N/2;
            return;
        }
        return;
    }


    // a function to print the elements in the queue
    public void display(){
        while(front != -1 && end != -1){
            if(end > front){
                for(int i = front; i - front < (end - front) + 1; i++){
                    System.out.print(arr[i].item + "\t");
                }
                System.out.print("\n");
            }
            else if(end == front){
                System.out.print(arr[front].item + "\t");
                System.out.print("\n");
            }
            else{
                for(int i =front; i<N; i++){
                    System.out.print(arr[i].item + "\t");
                }
                for(int j=0; j<end + 1; j++){
                    System.out.print(arr[j].item + "\t");
                }
                System.out.print("\n");
            }
            return;
        }
        System.out.println(" ");
        return;
    }
    
}
