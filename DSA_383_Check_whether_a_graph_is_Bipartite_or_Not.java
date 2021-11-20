package DSA;
import java.util.*;
public class DSA_383_Check_whether_a_graph_is_Bipartite_or_Not {
    public static int V = 4;

    // This function returns true if graph
    // G[V][V] is Bipartite, else false
    public static boolean isBipartiteUtil(int G[][], int src, int colorArr[]){
        colorArr[src]=1;
        LinkedList<Integer> q=new LinkedList<Integer>();
        q.add(src);
        while (!q.isEmpty()){
            int u=q.getFirst();
            q.pop();
            if(G[u][u] == 1){
                return false;
            }
            for (int v = 0; v < V; v++) {
                if(G[u][v]==1 && colorArr[v]==-1){
                    colorArr[v]=1-colorArr[u];
                    q.push(v);
                }
                else if(G[u][v] == 1 && colorArr[v] == colorArr[u]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isBipartite(int G[][]){
        int colorArr[] = new int[V];
        for (int i = 0; i < V; ++i)
            colorArr[i] = -1;

        // This code is to handle disconnected graoh
        for (int i = 0; i < V; i++)
            if (colorArr[i] == -1)
                if (isBipartiteUtil(G, i, colorArr)
                        == false)
                    return false;

        return true;
    }
    public static void main(String[] args)
    {
        int G[][] = { { 0, 1, 0, 1 },
                { 1, 0, 1, 0 },
                { 0, 1, 0, 1 },
                { 1, 0, 1, 0 } };

        if (isBipartite(G))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
