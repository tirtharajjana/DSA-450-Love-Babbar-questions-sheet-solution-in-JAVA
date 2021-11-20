package DSA;
import java.io.*;
import java.util.*;
import java.util.LinkedList;
public class DSA_382_Strongly_Connected_Components {
    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency List

    //Constructor
    DSA_382_Strongly_Connected_Components(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w)  { adj[v].add(w); }

    // A recursive function to print DFS starting from v
    void DFSUtil(int v,boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        int n;

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i =adj[v].iterator();
        while (i.hasNext())
        {
            n = i.next();
            if (!visited[n])
                DFSUtil(n,visited);
        }
    }

    DSA_382_Strongly_Connected_Components getTranspose(){
        DSA_382_Strongly_Connected_Components g=new DSA_382_Strongly_Connected_Components(V);
        for (int v = 0; v < V; v++) {
            Iterator<Integer> i=adj[v].listIterator();
            while (i.hasNext()){
                g.adj[i.next()].add(v);
            }
        }
        return g;
    }

    void fillOrder(int v, boolean visited[], Stack stack){
        visited[v]=true;
        Iterator<Integer> i=adj[v].listIterator();
        while (i.hasNext()){
            int n=i.next();
            if(!visited[n]){
                fillOrder(n,visited,stack);
            }
        }

        stack.push(new Integer(v));
    }

    void printSCCs(){
        Stack stack=new Stack();
        boolean visited[]=new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i]=false;
        }
        for (int i = 0; i < V; i++) {
            if(visited[i] == false)
                fillOrder(i,visited,stack);
        }

        DSA_382_Strongly_Connected_Components gr=getTranspose();

        for (int i = 0; i < V; i++) {
            visited[i]=false;
        }

        while (!stack.isEmpty()){
            int v = (int)stack.pop();

            // Print Strongly connected component of the popped vertex
            if (visited[v] == false)
            {
                gr.DFSUtil(v, visited);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        DSA_382_Strongly_Connected_Components g = new DSA_382_Strongly_Connected_Components(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);

        System.out.println("Following are strongly connected components "+
                "in given graph ");
        g.printSCCs();
    }
}
