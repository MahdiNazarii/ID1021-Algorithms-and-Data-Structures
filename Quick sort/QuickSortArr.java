

public class QuickSortArr{

    public static void swap(int[] array, int indexA, int indexB){
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    public static void sort(int[] array, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return;
        }
        int pivot = array[lowIndex];
        int rightPointer = partition(array, lowIndex, highIndex, pivot);
        sort(array, lowIndex, rightPointer-1);
        sort(array, rightPointer+1, highIndex);
    }

   
    public static int partition(int[] array, int lowIndex, int highIndex, int pivot){
            int leftPointer = lowIndex;
            int rightPointer = highIndex;
    
            while (leftPointer < highIndex && rightPointer > lowIndex){
                
                while(array[leftPointer] <= pivot && leftPointer < highIndex){
                    leftPointer++;
                }
                while(array[rightPointer] > pivot && rightPointer > lowIndex){
                    rightPointer--;
                }
                if(leftPointer > rightPointer){
                    break;
                }
                swap(array, leftPointer, rightPointer);
            }
           
            swap(array, rightPointer, lowIndex);
    
            return rightPointer;
        }
}