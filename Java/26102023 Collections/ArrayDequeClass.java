import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {
        ArrayDeque<String> arrDeque = new ArrayDeque<>();

        arrDeque.add("Apple");
        arrDeque.add("Banana");
        arrDeque.add("Onion");
        arrDeque.offerFirst("Grapes");
        arrDeque.offerLast("Gazar");

        System.out.println("Elements in the ArrayDeque: " + arrDeque);

        String firstElement = arrDeque.getFirst();
        String lastElement = arrDeque.getLast();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        arrDeque.removeFirst();
        arrDeque.removeLast();

        System.out.println("ArrayDeque after removing first and last elements: " + arrDeque);

        boolean isEmpty = arrDeque.isEmpty();
        System.out.println("Is the ArrayDeque empty? " + isEmpty);

        int size = arrDeque.size();
        System.out.println("Size of the ArrayDeque: " + size);

        System.out.println("Iterating through the ArrayDeque:");
        for (String element : arrDeque) {
            System.out.println(element);
        }
    }
}
