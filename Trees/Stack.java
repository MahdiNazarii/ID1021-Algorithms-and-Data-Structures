public class Stack<T>{
    int pointer;
    int capacity;
    BinaryTree.Node [] stack;

    public Stack(){
        capacity = 4;
        stack = new  BinaryTree.Node[capacity];
        pointer = -1;
    }

    
    public void push( BinaryTree.Node item){
        if(isFull()){
            increase();
        }
        stack[++pointer] = item;
    }


    public  BinaryTree.Node pop(){
        
        if(isEmpty()){
            System.out.println("The stack is Empty!");
            
            pointer++;
            return null;
        }
        decrease();
        return stack[pointer--];
    }
            
        
    public  BinaryTree.Node peek(){
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
            BinaryTree.Node[] newStack = new  BinaryTree.Node[capacity*2];
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
            BinaryTree.Node[] newStack = new  BinaryTree.Node[capacity/2];
            for(int i=0; i<capacity/2; i++){
                newStack[i] = stack[i];
            }
           stack = newStack;
           capacity = capacity/2;
        }
    }
}
