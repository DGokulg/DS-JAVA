import java.util.*;
class Graph{
    static int vertices;
    static List<Integer>[] adj;

    public Graph(int vertices){
        this.vertices = vertices;
        adj = new ArrayList[vertices];

        for(int i =0; i< vertices; i++){
            adj[i] = new ArrayList<>();
        }
    }

    public static void addEdge(int from , int to){
        adj[from].add(to);
        adj[to].add(from);
    }

    public static void BFS(int start){
        boolean[] visited = new boolean[vertices];
        bfsUtill(start,visited);
    }

    public static void bfsUtill(int start, boolean[] visited){
        visited[start] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        
        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.print(current + " ");

            for(Integer i : adj[current]){
                if(!visited[i]){
                    queue.add(i);
                }
            }
        }
    }
}

public class Bfs {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        System.out.print("BFS : ");
        g.BFS(0);
    }
}
