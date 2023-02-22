
public class heapArray {
    private int[] array;
    int index;


    public heapArray(){
        array = new int[100000];
        index = 0;
    }


    public void insert(int item){
       array[index++]=item;
       bubbla(array);
    }


    public int remove(){
        int removedElement = array[0];
        sink(array);
        return removedElement;
    }


    public void bubbla(int[]array){
       int child = index - 1;
       int parent = (child-1)/2;

       while(array[child] < array[parent] && parent > -1){
        int temp = array[child];
        array[child] = array[parent];
        array[parent] = temp;

        child = parent;
        parent = (child-1)/2;
       }
    }


    public void sink(int[] array){
        array[0] = array[--index];
        int parent = 0;
        int leftChild = 1;
        int rightChild = 2;
        int promotedChild = leftChild;
        if(array[leftChild] > array[rightChild]){
            promotedChild = rightChild;
        } 
        while(array[parent] > array[promotedChild] && promotedChild < index){
            int temp = array[promotedChild];
            array[promotedChild] = array[parent];
            array[parent] = temp;

            parent = promotedChild;
            promotedChild = 2*parent+1;
            if(array[2*parent+1] > array[2*parent +2]){
                promotedChild = (2*parent) + 2;
            }
        }
    }

    

    public void display(){
        System.out.print("[");
        for(int i=0; i< index; i++){
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("]");
        return;
    }

    public static void main(String[] args){
        heapArray heap = new heapArray();
        heap.insert(10);
        heap.insert(15);
        heap.insert(7);
        heap.insert(20);
        heap.insert(30);
        heap.insert(4);

        heap.display();
        heap.remove();
        heap.display();
    }
    
}
