package DSA;
import java.io.*;
public class DSA_397_Number_of_Triangles_in_Directed_and_Undirected_Graphs {
    int V = 4;
    int countTriangle(int graph[][], boolean isDirected){
        int count_Triangle = 0;
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                for (int k = 0; k < V; k++) {
                    if (graph[i][j] == 1 &&
                            graph[j][k] == 1 &&
                            graph[k][i] == 1)
                        count_Triangle++;
                }
            }
        }
        if(isDirected == true)
        {
            count_Triangle /= 3;
        }
        else
        {
            count_Triangle /= 6;
        }
        return count_Triangle;
    }

    public static void main(String args[])
    {

        // Create adjacency matrix
        // of an undirected graph
        int graph[][] = {{0, 1, 1, 0},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {0, 1, 1, 0}
        };

        // Create adjacency matrix
        // of a directed graph
        int digraph[][] = { {0, 0, 1, 0},
                {1, 0, 0, 1},
                {0, 1, 0, 0},
                {0, 0, 1, 0}
        };

        DSA_397_Number_of_Triangles_in_Directed_and_Undirected_Graphs obj = new DSA_397_Number_of_Triangles_in_Directed_and_Undirected_Graphs();

        System.out.println("The Number of triangles "+
                "in undirected graph : " +
                obj.countTriangle(graph, false));

        System.out.println("\n\nThe Number of triangles"+
                " in directed graph : "+
                obj.countTriangle(digraph, true));

    }
}
