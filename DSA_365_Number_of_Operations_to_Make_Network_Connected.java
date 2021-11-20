package DSA;
import java.io.*;
import java.util.*;
public class DSA_365_Number_of_Operations_to_Make_Network_Connected {
    public static void DFS(HashMap<Integer, ArrayList<Integer> > adj, int node, boolean visited[]){
        // If current node is already visited
        if (visited[node])
            return;

        // If current node is not visited
        visited[node] = true;

        // Recurse for neighbouring nodes
        for (int x : adj.get(node)) {

            // If the node is not vistied
            if (visited[x] == false)
                DFS(adj, x, visited);
        }
    }
    public static int makeConnectedUtil(int N, int connections[][], int M){
        boolean visited[]=new boolean[N];
        HashMap<Integer,ArrayList<Integer>> adj=new HashMap<>();
        for (int i = 0; i < N; i++) {
            adj.put(i,new ArrayList<Integer>());
        }
        int edges=0;

        for (int i = 0; i < M; i++) {
            ArrayList<Integer> l1=adj.get(connections[i][0]);
            ArrayList<Integer> l2=adj.get(connections[i][0]);
            l1.add(connections[i][1]);
            l1.add(connections[i][0]);

            edges+=1;
        }
        int components=0;
        for (int i = 0; i < N; i++) {
            if(visited[i] == false){
                components+=1;
                DFS(adj,i,visited);
            }
        }
        if (edges < N - 1)
            return -1;

        // Count redundant edges
        int redundant
                = edges - ((N - 1) - (components - 1));

        // Check if components can be
        // rearranged using redundant edges
        if (redundant >= (components - 1))
            return components - 1;

        return -1;
    }
    public static void makeConnected(int N, int connections[][], int M){
        int minOps = makeConnectedUtil(N, connections, M);
        System.out.println(minOps);
    }

    public static void main(String[] args) {
        int N = 4;

        // Given set of connections
        int connections[][]
                = { { 0, 1 }, { 0, 2 }, { 1, 2 } };
        int M = connections.length;

        // Function call to check if it is
        // possible to connect all computers or not
        makeConnected(N, connections, M);
    }
}
