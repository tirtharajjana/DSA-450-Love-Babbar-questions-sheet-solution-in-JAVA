package DSA;

public class DSA_384_Detect_a_negative_cycle_in_a_Graph {
    static class Edge {
        int src, dest, weight;
    }

    // a structure to represent a connected, directed and
    // weighted graph
    static class Graph {

        // V-> Number of vertices, E-> Number of edges
        int V, E;

        // graph is represented as an array of edges.
        Edge edge[];

    }

    // Creates a graph with V vertices and E edges
    static Graph createGraph(int V, int E) {
        Graph graph = new Graph();
        graph.V = V;
        graph.E = E;
        graph.edge = new Edge[graph.E];

        for (int i = 0; i < graph.E; i++) {
            graph.edge[i] = new Edge();
        }

        return graph;
    }

    static boolean isNegCycleBellmanFord(Graph graph, int src){
        int V= graph.V;
        int E= graph.E;

        int[] dist=new int[V];


        for (int i = 0; i < V; i++) {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src] = 0;

        for (int i = 0; i < V-1; i++) {
            for (int j = 0; j < E; j++) {
                int u= graph.edge[j].src;
                int v=graph.edge[j].dest;
                int w=graph.edge[j].weight;
                if(dist[u] != Integer.MAX_VALUE && dist[u] + w<dist[v]){
                    dist[v]=dist[v]+w;
                }
            }
        }

        for (int i = 0; i < E; i++) {
            int u= graph.edge[i].src;
            int v=graph.edge[i].dest;
            int w=graph.edge[i].weight;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + w  < dist[v])
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5, E = 8;
        Graph graph = createGraph(V, E);

        // add edge 0-1 (or A-B in above figure)
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = -1;

        // add edge 0-2 (or A-C in above figure)
        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 4;

        // add edge 1-2 (or B-C in above figure)
        graph.edge[2].src = 1;
        graph.edge[2].dest = 2;
        graph.edge[2].weight = 3;

        // add edge 1-3 (or B-D in above figure)
        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 2;

        // add edge 1-4 (or A-E in above figure)
        graph.edge[4].src = 1;
        graph.edge[4].dest = 4;
        graph.edge[4].weight = 2;

        // add edge 3-2 (or D-C in above figure)
        graph.edge[5].src = 3;
        graph.edge[5].dest = 2;
        graph.edge[5].weight = 5;

        // add edge 3-1 (or D-B in above figure)
        graph.edge[6].src = 3;
        graph.edge[6].dest = 1;
        graph.edge[6].weight = 1;

        // add edge 4-3 (or E-D in above figure)
        graph.edge[7].src = 4;
        graph.edge[7].dest = 3;
        graph.edge[7].weight = -3;

        if (isNegCycleBellmanFord(graph, 0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
