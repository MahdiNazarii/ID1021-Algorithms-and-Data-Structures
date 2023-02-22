import java.util.*;
public class dStack {
    Node head;
    int size;
    
    public dStack(){
         head = null;
         size = 0;
    }

    class Node{
        int data;
        Node ref;
    }
    

   public void push(int value){
        Node newHead = head;
        head = new Node();
        head.data = value;
        head.ref = newHead;
        size++;
    }


   public void pop(){
    if(head == null){
        System.out.println("The stack is empty!");
    }
    head = head.ref;
    size--;
   }


   public void show() {
    Node nxt = head;
    while (nxt.ref != null) {
        System.out.println(nxt.data);
        nxt = nxt.ref;
    }
    System.out.println(nxt.data);
    System.exit(-1);        
}

public static dStack stackGenerater(int size){
    Random rnd = new Random();
    dStack st = new dStack();

    for(int i=0; i<size; i++){
        st.push(rnd.nextInt(10));
    }
    return st;

}


public static class dynamicStack {
    int pointer;
    int capacity;
    int [] stack;

    dynamicStack(){
        capacity = 4;
        stack = new int[capacity];
        pointer = -1;
    }

    public void push(int item){
        if(isFull()){
            increase();
        }
        stack[++pointer] = item;
    }

    public int pop(){
        
        if(isEmpty()){
            System.out.println("The stack is Empty!");
            
            pointer++;
            return (0);
        }
        decrease();
        return stack[pointer--];
    }
            
        
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is Empty!");
        }
        return stack[pointer];
    }

    public boolean isEmpty(){
        return pointer == -1;
    }

    public boolean isFull(){
        return pointer == capacity - 1;
    }

    public int size(){
        int size;
        if (pointer < 0){
            size = capacity;
        }
        else{
            size = capacity - (pointer + 1); 
        }
        return size;
    }

    public void increase(){
        int length = size();
        if(length < capacity/2){
            int[] newStack = new int[capacity*2];
            for(int i=0; i<capacity; i++){
                newStack[i] = stack[i];
            }
            stack = newStack;
            capacity *= 2; 
        }
    }

    public void decrease(){
        int length = size();
        if(capacity != 4 && length > capacity/2){
            int[] newStack = new int[capacity/2];
            for(int i=0; i<capacity/2; i++){
                newStack[i] = stack[i];
            }
           stack = newStack;
           capacity = capacity/2;
        }
    }

    public static dynamicStack stackAlloc(int size){
        Random rnd = new Random();
        dynamicStack newStack = new dynamicStack();
        for(int i=0; i<size; i++){
            newStack.push(rnd.nextInt(10));
        }
        return newStack;
    }
}

    public static void main(String[] args){

        // BENCHMARK dynamic stack VS linked list
        int [] number = {100, 200, 300, 400, 500, 600, 700, 800};
        int loop = 100000;

        System.out.printf("------------------------------------------------------------------------------------- \n");
        System.out.printf("%-15s %-23s %-10s \n", "NUMBER" , "DStack with an Array" , "DStack with a List");
        System.out.printf("--------------------------------------------------------------------------------------\n");

        for(int i=0; i<number.length; i++){
            Double min_DStackArray = Double.POSITIVE_INFINITY;
            Double min_DStackList = Double.POSITIVE_INFINITY;

            for(int j=0; j<loop; j++){
                dynamicStack st = new dynamicStack();
                double t0 = System.nanoTime();
                
                // To allocate a list of n sizes
                st.stackAlloc(number[i]);
               

                double t1 = System.nanoTime();

                double t_append = (t1 - t0);
                
                // find the minimum execution time
                if(t_append < min_DStackArray){
                    min_DStackArray = t_append;
                }
            }

            for(int j=0; j<loop; j++){
                dStack st = new dStack();
                
                double t0 = System.nanoTime();
                
                // To allocate a list of n sizes
                st.stackGenerater(number[i]);
               

                double t1 = System.nanoTime();

                double t_append = (t1 - t0);
                
                // find the minimum execution time
                if(t_append < min_DStackList){
                    min_DStackList = t_append;
                }
            }

            System.out.println( number[i] + " \t\t" + (min_DStackArray) + " ns." + " \t\t" + (min_DStackList) + " ns."); 

        }
        
        System.out.printf("--------------------------------------------------------------------------------------\n");
    }
}
