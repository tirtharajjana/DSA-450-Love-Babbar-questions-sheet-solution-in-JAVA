package DSA;
import java.io.*;
import java.util.*;
public class DSA_360_Detect_cycle_in_an_undirected_graph {
    private int V;

    // Adjacency List Represntation
    private LinkedList<Integer> adj[];

    // Constructor
    DSA_360_Detect_cycle_in_an_undirected_graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge
    // into the graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
        adj[w].add(v);
    }

    // A recursive function that
    // uses visited[] and parent to detect
    // cycle in subgraph reachable
    // from vertex v.
    Boolean isCyclicUtil(int v, Boolean visited[], int parent){
        visited[v]=true;
        Integer i;
        Iterator<Integer> it=adj[v].iterator();
        while (it.hasNext()){
            i=it.next();
            if(!visited[i]){
                if(isCyclicUtil(i,visited,v));
            }
            else if(i!= parent){
                return true;
            }
        }
        return false;
    }
    Boolean isCyclic()
    {

        // Mark all the vertices as
        // not visited and not part of
        // recursion stack
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // Call the recursive helper
        // function to detect cycle in
        // different DFS trees
        for (int u = 0; u < V; u++)
        {

            // Don't recur for u if already visited
            if (!visited[u])
                if (isCyclicUtil(u, visited, -1))
                    return true;
        }

        return false;
    }
    public static void main(String args[])
    {

        // Create a graph given
        // in the above diagram
        DSA_360_Detect_cycle_in_an_undirected_graph g1 = new DSA_360_Detect_cycle_in_an_undirected_graph(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 1);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        if (g1.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");

        DSA_360_Detect_cycle_in_an_undirected_graph g2 = new DSA_360_Detect_cycle_in_an_undirected_graph(3);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        if (g2.isCyclic())
            System.out.println("Graph contains cycle");
        else
            System.out.println("Graph doesn't contains cycle");
    }
}
