import java.util.Collections;

public class SelectionSort {

    public static int[] Selection(int arr[], int size){
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j<size; j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {34, 12, 52, 33, 10};
        Selection(arr, 5);
        for(int element : arr){
            System.out.println(element);
        }
    }
}
