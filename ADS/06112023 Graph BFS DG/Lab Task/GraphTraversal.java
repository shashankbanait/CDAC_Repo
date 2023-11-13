import java.util.*;

public class GraphTraversal {

    private int V;
    private LinkedList<Integer> adj[];

    @SuppressWarnings("unchecked")
    GraphTraversal(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of nodes
        int M = scanner.nextInt(); // Number of edges

        GraphTraversal graph = new GraphTraversal(N);

        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addEdge(u - 1, v - 1); // Adjusting for 0-based indexing
        }

        int source = scanner.nextInt();

        System.out.println("DFS Traversal:");
        graph.DFS(source - 1); // Adjusting for 0-based indexing
        System.out.println();

        System.out.println("BFS Traversal:");
        graph.BFS(source - 1); // Adjusting for 0-based indexing
        System.out.println();
    }
}
