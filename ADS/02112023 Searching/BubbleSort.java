// public class BubbleSort {
    
//     public static void main(String[] args) {
//         int arr[] = {53, 21, 35, 11, 66};
//         for(int i=0; i<arr.length; i++){
//             for(int j=0; j<arr.length - 1 - i; j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         for (int i : arr) {
//             System.out.println(i);
//         }
//     }
    
// }

// other way to do this

public class BubbleSort {
    public static int[] swap(int arr[], int i, int j){
        int temp = arr[i]; 
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public static int[] myBubble(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length - 1 - i; j++){
                if(arr[j]>arr[j+1])
                    swap(arr, j, j+1);
            }
        }
        return arr;
    }
    
    
    public static void main(String[] args) {
        int arr[] = {53, 21, 35, 11, 66};
        myBubble(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
}
