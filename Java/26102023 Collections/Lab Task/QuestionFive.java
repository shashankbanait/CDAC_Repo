// Q5. Write a java program to perform insertion at first and at last position in Array Dequeue

import java.util.ArrayDeque;

public class QuestionFive {
    public static void main(String[] args) {
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.add("Blue");
        ad.add("Grey");
        ad.add("Voilet");
        System.out.println(ad);
        ad.addFirst("Green");
        System.out.println(ad);
        ad.addLast("Black");
        System.out.println(ad);
    }
}
