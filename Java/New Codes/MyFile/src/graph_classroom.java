import java.util.ArrayList;

public class graph_classroom {
   
   //Strucuture of edge
     static class Edge {
        int src;
        int des;
        int wt;

        Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.wt = w;
        }
   }
   
   //Graph creation
   public static void creategraph(ArrayList<Edge> graph[]) {
    for(int i = 0; i<graph.length; i++){
        graph[i] = new ArrayList<Edge>();
    }

    graph[0].add(new Edge(0,2,2));

    graph[1].add(new Edge(1,2,10));
    graph[1].add(new Edge(1,3,0));

    graph[2].add(new Edge(2,0,2));
    graph[2].add(new Edge(2,1,10));
    graph[2].add(new Edge(2,3,-1));

    graph[3].add(new Edge(3,1,0));
    graph[3].add(new Edge(3,2,-1));
   }
   
   
    public static void main(String[] args) {
        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];
        creategraph(graph);

        //Printing 2's Neighbours
        for(int i =0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.des + " ," + e.wt);
        }
    }
}
