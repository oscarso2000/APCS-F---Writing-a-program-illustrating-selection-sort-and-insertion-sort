
/**
 * Write a description of class Sort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sort
{
    public static void main (String[] args) {
       int [] array = {4,1,8,14,99,53,46,78,3,10,7,82,44}; 
       printArray(array);
       selectionSort(array);
       int [] array2 = {4,1,8,14,99,53,46,78,3,10,7,82,44}; 
       printArray(array2);
       insertionSort(array2);
    }
    public static void insertionSort(int[] array){
        long startTime = System.nanoTime();
        int counter=0;
        for (int k=1;k<array.length;k++){
            int i=k-1, temp = array[k];
            while(i>=0 && array[i]>temp){
                array[i+1]=array[i];
                i--;
            }
            array[i+1]=temp;
            counter++;
            printArray(array);
        }
        System.out.printf("Sorted %d times \n",counter);
        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns"); 
    }
    public static void selectionSort(int[] array){
        long startTime = System.nanoTime();
        int counter =0,counter2=0;
        for (int j=0;j<array.length;j++){
            int c=j,min=array[j];
            for (int i=j+1;i<array.length;i++){
                if (array[i]<min){
                    min=array[i];
                    c=i;
                    counter2++;
                }
            }
            array[c]=array[j];
            array[j]=min;
            if (counter2 != 0){
                counter++;
            }
            printArray(array);
        }
        System.out.printf("Sorted %d times. \n",counter);
        long endTime = System.nanoTime();
        System.out.println("Took "+(endTime - startTime) + " ns"); 
    }
    public static void printArray(int[] array){ //printing array
        for(int i = 0;i<array.length;i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.printf("\n");
    }
}
