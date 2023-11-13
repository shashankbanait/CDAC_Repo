import java.util.Stack;

public class GraphDFS {
    static final int V=5;
    public void dfs(int arr[][], int source){
        Stack<Integer> s = new Stack<>();
        boolean isVisited[] = new boolean[V];

        s.push(source);
        isVisited[source]=true;

        while(s.empty()){
            int node = s.pop();
            System.out.println("Visited node: "+node);

            for(int index=0; index<V; index++){
                if(arr[node][index]==1 && isVisited[index]==false){
                    s.push(index);
                    isVisited[index]=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
            {0,1,1,1,0},
            {1,0,0,1,1},
            {1,0,0,1,0},
            {1,1,1,0,1},
            {0,1,0,1,0}
        };

        GraphDFS obj = new GraphDFS();
        obj.dfs(arr,0);
    }

}
