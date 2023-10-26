// Q4. Write a java program to Create a priority queue to insert elements with different priorities.

import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Collection;

public class QuestionFour {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(1);
        
        System.out.println(numbers);
    }
}