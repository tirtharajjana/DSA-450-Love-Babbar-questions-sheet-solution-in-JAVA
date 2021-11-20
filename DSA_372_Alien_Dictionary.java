package DSA;
import java.util.*;
public class DSA_372_Alien_Dictionary {
    private final LinkedList<Integer>[] adjacencyList;

     DSA_372_Alien_Dictionary(int nVertices)
    {
        adjacencyList = new LinkedList[nVertices];
        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++)
        {
            adjacencyList[vertexIndex] = new LinkedList<>();
        }
    }
    void addEdge(int startVertex, int endVertex)
    {
        adjacencyList[startVertex].add(endVertex);
    }

    private int getNoOfVertices()
    {
        return adjacencyList.length;
    }

    private void topologicalSortUtil(int currentVertex, boolean[] visited, Stack<Integer> stack){
        visited[currentVertex] = true;

        for (int adjacentVertex : adjacencyList[currentVertex])
        {
            if (!visited[adjacentVertex])
            {
                topologicalSortUtil(adjacentVertex, visited, stack);
            }
        }

        stack.push(currentVertex);
    }

    void topologicalSort()
    {
        Stack<Integer> stack = new Stack<>();

        boolean[] visited = new boolean[getNoOfVertices()];
        for (int i = 0; i < getNoOfVertices(); i++)
        {
            visited[i] = false;
        }

        for (int i = 0; i < getNoOfVertices(); i++)
        {
            if (!visited[i])
            {
                topologicalSortUtil(i, visited, stack);
            }
        }

        while (!stack.isEmpty())
        {
            System.out.print((char)('a' + stack.pop()) + " ");
        }
    }
    private static void printOrder(String[] words, int alpha)
    {
        // Create a graph with 'aplha' edges
        DSA_372_Alien_Dictionary graph = new DSA_372_Alien_Dictionary(alpha);

        for (int i = 0; i < words.length - 1; i++)
        {
            // Take the current two words and find the first mismatching
            // character
            String word1 = words[i];
            String word2 = words[i+1];
            for (int j = 0; j < Math.min(word1.length(), word2.length()); j++)
            {
                // If we find a mismatching character, then add an edge
                // from character of word1 to that of word2
                if (word1.charAt(j) != word2.charAt(j))
                {
                    graph.addEdge(word1.charAt(j) - 'a', word2.charAt(j)- 'a');
                    break;
                }
            }
        }

        // Print topological sort of the above created graph
        graph.topologicalSort();
    }

    public static void main(String[] args)
    {
        String[] words = {"caa", "aaa", "aab"};
        printOrder(words, 3);
    }

}
