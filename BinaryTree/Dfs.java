import java.util.*;
class Graph{
    static int vertices;
    static List<Integer>[] adj;

    public Graph(int vertices){
        this.vertices = vertices;
        adj = new ArrayList[vertices];

        for(int i = 0 ; i<vertices; i++){
            adj[i] =  new ArrayList<>();
        }
    }

    public static void addEdge(int from , int to){
        adj[from].add(to);
        adj[to].add(from);
    }

    public static void DFS(int start){
        boolean[] visited = new boolean[vertices];
        dfsUtill(start,visited);
    }
    public static void dfsUtill(int start ,  boolean[] visited){
         visited[start] = true;
         System.out.print(start + " ");

         for(Integer i : adj[start]){
            if(!visited[i]){
                dfsUtill(i, visited);
            }
         }
    }
}

class Dfs{
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        System.out.print("DFS : ");
        g.DFS(0);
        System.out.println();
        System.out.println();
        for(List i : g.adj){
           System.out.println(i);
        }
    }
}