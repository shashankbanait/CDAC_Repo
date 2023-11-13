// package Lab Task;

import java.util.*;

public class QuestionTwo {
    private int V;
    private LinkedList<Integer> adjList[];

    QuestionTwo(int v) {
        V = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjList[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adjList[v - 1].add(w - 1);
        adjList[w - 1].add(v - 1);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print((v + 1) + " ");

        for (Integer n : adjList[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v - 1, visited);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s - 1] = true;
        queue.add(s - 1);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print((s + 1) + " ");

            for (Integer n : adjList[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        QuestionTwo graph = new QuestionTwo(N);

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }

        int source = sc.nextInt();

        System.out.print("DFS Order: ");
        graph.DFS(source);
        System.out.println();

        System.out.print("BFS Order: ");
        graph.BFS(source);
    }
}
