// Q2.Write a java program to Implement Queue data structure using LinkedList and Queue collection.
// package Lab Task;

import java.util.LinkedList;
import java.util.Queue;

public class QuestionTwo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.add(8);
        q.add(7);
        q.add(6);

        System.out.println(q);
        
    }
}
