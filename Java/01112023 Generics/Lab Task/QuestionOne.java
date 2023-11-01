import java.util.ArrayList;
import java.util.Collection;

public class QuestionOne {

    public static <T> int countElementsWithOddProperty(Collection<T> collection) {
        int count = 0;

        for (T element : collection) {
            if (element instanceof Integer && (Integer) element % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static <T extends Number> boolean isPrime(T number) {
        if (number instanceof Integer) {
            int num = ((Integer) number).intValue();

            if (num <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }

        return false; // For non-integer types, consider not prime
    }

    public static <T> boolean isPalindrome(T obj) {
        String str = obj.toString();

        // Remove non-alphanumeric characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Create a collection of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Count the number of odd integers
        int oddCount = countElementsWithOddProperty(numbers);
        System.out.println("Number of odd integers: " + oddCount);

        // for prime numbers
        Integer intNumber = 17;
        Double doubleNumber = 15.0;

        System.out.println(intNumber + " is prime: " + isPrime(intNumber));
        System.out.println(doubleNumber + " is prime: " + isPrime(doubleNumber));

        // for palindrome
        String palindromeString = "A man, a plan, a canal, Panama";
        String nonPalindromeString = "Hello, World!";

        System.out.println("\"" + palindromeString + "\" is palindrome: " + isPalindrome(palindromeString));
        System.out.println("\"" + nonPalindromeString + "\" is palindrome: " + isPalindrome(nonPalindromeString));
    }
}
