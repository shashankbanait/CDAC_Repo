public class linearSearch{
    public static void Search(int arr[], int size, int key){
        for(int i=0; i<size; i++){
            if(arr[i]==key){
                System.out.println("Index of the key is: "+ i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {11, 66, 22, 77, 88};
        Search(arr, 5, 22);
    }
}