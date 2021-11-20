package DSA;
import java.util.*;
public class DSA_369_Minimum_time_taken_by_each_job_to_be_completed_given_by_a_Directed_Acyclic_Graph {
    static final int maxN = 100000;

    // Adjacency List to store the graph
    @SuppressWarnings("unchecked")
    static Vector<Integer> []graph = new Vector[maxN];

    // Array to store the in-degree of node
    static int []indegree = new int[maxN];

    // Array to store the time in which
// the job i can be done
    static int []job = new int[maxN];

    // Function to add directed edge
// between two vertices
    static void addEdge(int u, int v)
    {

        // Insert edge from u to v
        graph[u].add(v);

        // Increasing the indegree
        // of vertex v
        indegree[v]++;
    }

    static void printOrder(int n, int m){
        Queue<Integer> q=new LinkedList<>();
        for (int i = 1; i <= n ; i++) {
            if(indegree[i] ==0 ){
                q.add(i);
                job[i]=1;
            }
        }

        while (!q.isEmpty()){
            int cur=q.poll();
            for(int adj:graph[cur]){
                indegree[adj]--;
                if(indegree[adj] == 0){
                    job[adj]=1+job[cur];
                    q.add(adj);
                }
            }
        }
        for(int i = 1; i <= n; i++)
            System.out.print(job[i] + " ");
        System.out.print("\n");
    }
    public static void main(String[] args)
    {

        // Given Nodes N and edges M
        int n, m;
        n = 10;
        m = 13;

        for(int i = 0; i < graph.length; i++)
            graph[i] = new Vector<Integer>();

        // Given directed edges of graph
        addEdge(1, 3);
        addEdge(1, 4);
        addEdge(1, 5);
        addEdge(2, 3);
        addEdge(2, 8);
        addEdge(2, 9);
        addEdge(3, 6);
        addEdge(4, 6);
        addEdge(4, 8);
        addEdge(5, 8);
        addEdge(6, 7);
        addEdge(7, 8);
        addEdge(8, 10);

        // Function call
        printOrder(n, m);
    }


}
