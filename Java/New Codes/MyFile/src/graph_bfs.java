import java.util.*;
public class graph_bfs {

     static class Edge{
        int src;
        int des;


        Edge(int s, int d){
            this.src = s;
            this.des = d;
        
        }
    }
    
    //BFS Traversal 

     public static void bfs(ArrayList<Edge> graph[], int v){

        Queue <Integer> q = new LinkedList<>();
        boolean visted[]  = new boolean[v];
        q.add(0);

        while(!q.isEmpty()){
            int current = q.remove();
            if(visted[current] == false){
                System.out.print(current + " ");
                visted[current] = true;

                for(int i=0; i<graph[current].size(); i++){
                    Edge e = graph[current].get(i);
                    q.add(e.des);
                }
            }
        }
     }    
    
    //Building Graph
    public static void creategraph(ArrayList<Edge> graph[]){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1 ));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

    }

    public static void main(String[] args) {
         int v = 7;
        /* 
            1 --- 3
           /      |  \  
          0       |    5 -- 6 
           \      |  /
            2 --- 4        
        
        */
         ArrayList<Edge> graph[] = new ArrayList[v]; 
        creategraph(graph);
        bfs(graph, v);
        
    }
}
