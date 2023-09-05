// Java program to print BFS traversal from a given source
// vertex. BFS(int s) traverses vertices reachable from s.

import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency
// list representation

class Graph {

    // No. of vertices
    private int V;

    // Adjacency Lists
    private LinkedList<Integer> adj[];

    // Constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);

        System.out.print(adj[w]);
        System.out.print(adj[v]);
        System.out.println();
    }

}
    
public class second {
     // Driver code
        public static void main(String args[]) {
            Graph g = new Graph(4);
            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 3);

            // System.out.println(
            //         "Following is Breadth First Traversal "
            //                 + "(starting from vertex 2)");

            // g.BFS(2);
        }
}

// This code is contributed by Aakash Hasija
