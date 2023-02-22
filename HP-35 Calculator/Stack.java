public class Stack {
    int pointer;
    int capacity;
    int [] stack;

    Stack (){
        capacity = 40;
        stack = new int[capacity];
        pointer = -1;
    }

    public void push(int item){
        if(pointer < capacity){
            stack[++pointer] = item;
        }
        else{
            System.out.println("Stack is full!");
        }
    }

    public int pop(){
      if(isEmpty()){
        //System.out.println("The stack is Empty!");
        //System.exit(0);
        pointer++;
        return 0;
      }
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

// Benchmark for only push and pop operations
    public long benchMark(int element, int times){
        long t0 = System.nanoTime();
        for(int i=0; i<times; i++){
            for(int j=0; j<element; j++){
                push(1);
            }
            for(int k=0; k<element; k++){
                pop();
            }
        }
        long t1 = System.nanoTime();
        long t_total = (t1 -t0);
        return (t_total/(times*element*2));
    }


    public static void main(String[] args){
        Stack st = new Stack();
        /*st.push(4);
        st.push(2);
        st.push(6);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        */
        System.out.println(st.benchMark(200000, 100));
        
        
     }
}
