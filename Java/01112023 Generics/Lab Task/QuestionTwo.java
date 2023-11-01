import java.util.Arrays;

public class QuestionTwo {

    public static <T> void exchangeElements(T[] array, int firstIndex, int secondIndex) {
        if (firstIndex < 0 || firstIndex >= array.length || secondIndex < 0 || secondIndex >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index for array");
        }

        T temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static void main(String[] args) {
        // Example Usage
        Integer[] integerArray = {1, 2, 3, 4, 5};

        System.out.println("Before exchanging: " + Arrays.toString(integerArray));

        exchangeElements(integerArray, 1, 3); // Exchanging elements at index 1 and 3

        System.out.println("After exchanging: " + Arrays.toString(integerArray));
    }
}
