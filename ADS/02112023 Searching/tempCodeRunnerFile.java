class Search {
    public int search(int arr[], int key, int size) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return 1;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {11, 33, 37, 39, 76, 79, 88, 89};
        Search s = new Search();
        if (s.search(arr, 37, 8) == 1) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}
