import java.util.*;

public class graph_Prims {
   
    static class Edge{
        int src;
        int des;
        int weight ;

        Edge(int s, int d, int w){
            this.src = s;
            this.des = d;
            this.weight = w;
        }
    }
   
    //Strucutre of pair
    public static  class Pair implements Comparable<Pair>{
        int node;
        int cost;

        Pair(int n, int c){
            this.node = n;
            this.cost = c;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost - p2.cost; //ascending order main cost dega
        } 
    }


    //Prims Algo
    public static void prim(ArrayList<Edge> graph[], int v){
        PriorityQueue<Pair> pq = new PriorityQueue<>(); //Non MST Set
        boolean visted[] = new boolean[v]; //MST Set
        pq.add(new Pair(0, 0));
        int mstcost =0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(visted[curr.node]==false){
                visted[curr.node] = true;
                mstcost += curr.cost; 

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    if(visted[e.des] ==false){
                        pq.add(new Pair(e.des, e.weight));
                    }
                }
            }
        }
        System.out.println("Min Cost is = " + mstcost);
    }
    
    
    
    
    // Graph Building
        public static void creategraph(ArrayList<Edge> graph[]){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0,10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }
   
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v]; 
        creategraph(graph);
        prim(graph, v);
    }
}