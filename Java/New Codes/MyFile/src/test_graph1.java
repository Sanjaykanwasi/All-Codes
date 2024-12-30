
//USING ADJACENCY LIST = Array of Arraylist

import java.util.*;

public class test_graph1 {
    
    static class Edge{
        int src;
        int des;

        Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }
    
    public static void creategraph(ArrayList<Edge> graph[]){

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }
    public static void main(String[] args) {
       int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v]; 

        creategraph(graph);

        //Printing Neighbours of a vertex or node
        
        System.out.print("Neighbours of 2: ");
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(e.des + " ");
        }

        System.out.println();
        System.out.print("Neighbours of 3: ");
        for(int i=0; i<graph[3].size(); i++){
            Edge e = graph[3].get(i);
            System.out.print(e.des + " ");
        }
    }
}
