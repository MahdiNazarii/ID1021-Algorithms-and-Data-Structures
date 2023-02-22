import java.util.*;
public class dynamicStack {
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
    
  public double benchMark(int number, int constant){
    Random rnd = new Random();
    long t_tot = 0;
    for(int t=0; t<constant; t++){
        long t0 = System.nanoTime();
        for(int i=0; i<number; i++){
            push(rnd.nextInt(1000) * 2);
        }
        for(int j=0; j<number; j++){
            pop();
        }
        t_tot += System.nanoTime() - t0;
    }
    return ((double)(t_tot)/(2*number*100));

  }
    

    public static void main(String[] args){
        dynamicStack st = new dynamicStack();
        Random rnd = new Random();
        /* 
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(2);
        st.push(4);
        st.push(2);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    
        
        System.out.println(st.pop());
        System.out.println(st.pop());
        
        System.out.println(st.size());
        System.out.println(st.capacity);
        int n = 40000;
        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = rnd.nextInt(10000);
        }
        System.out.println(st.benchMark(arr, 100));
        */
        
       System.out.println(st.benchMark(6000, 100) + " nanoseconds!");
        
     }
    
}
