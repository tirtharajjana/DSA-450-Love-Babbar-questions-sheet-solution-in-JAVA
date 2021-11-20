package DSA;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class DSA_364_Clone_Graph {
    static class GraphNode
    {
        int val;

        Vector<GraphNode> neighbours;
        public GraphNode(int val)
        {
            this.val = val;
            neighbours = new Vector<GraphNode>();
        }
    }
    public GraphNode cloneGraph(GraphNode source){
        Queue<GraphNode>q=new LinkedList<GraphNode>();
        q.add(source);
        HashMap<GraphNode,GraphNode> hm=new HashMap<GraphNode, GraphNode>();
        hm.put(source,new GraphNode(source.val));
        while (!q.isEmpty()){
            GraphNode u=q.poll();
            GraphNode cloneNodeU=hm.get(u);
            if(u.neighbours != null){
                Vector<GraphNode> v = u.neighbours;
                for (GraphNode graphNode : v)
                {
                    // Get the corresponding cloned node
                    // If the node is not cloned then we will
                    // simply get a null
                    GraphNode cloneNodeG = hm.get(graphNode);

                    // Check if this node has already been created
                    if (cloneNodeG == null)
                    {
                        q.add(graphNode);

                        // If not then create a new Node and
                        // put into the HashMap
                        cloneNodeG = new GraphNode(graphNode.val);
                        hm.put(graphNode,cloneNodeG);
                    }

                    // add the 'cloneNodeG' to neighbour
                    // vector of the cloneNodeG
                    cloneNodeU.neighbours.add(cloneNodeG);
                }
            }
        }
        return hm.get(source);
    }

    public GraphNode buildGraph(){
        GraphNode node1=new GraphNode(1);
        GraphNode node2=new GraphNode(2);
        GraphNode node3=new GraphNode(3);
        GraphNode node4=new GraphNode(4);

        Vector<GraphNode> v=new Vector<GraphNode>();
        v.add(node2);
        v.add(node4);
        node1.neighbours=v;
        v=new Vector<GraphNode>();
        v.add(node1);
        v.add(node3);
        node2.neighbours=v;
        v = new Vector<GraphNode>();
        v.add(node2);
        v.add(node4);
        node3.neighbours = v;
        v = new Vector<GraphNode>();
        v.add(node3);
        v.add(node1);
        node4.neighbours = v;
        return node1;

    }
    public void bfs(GraphNode source){
        Queue<GraphNode> q=new LinkedList<GraphNode>();
        q.add(source);
        HashMap<GraphNode,Boolean> visit=new HashMap<GraphNode, Boolean>();
        visit.put(source,true);
        while (!q.isEmpty()){
            GraphNode u=q.poll();
            System.out.println("Value of Node " + u.val);
            System.out.println("Address of Node " + u);
            if(u.neighbours != null){
                Vector<GraphNode> v = u.neighbours;
                for (GraphNode g : v)
                {
                    if (visit.get(g) == null)
                    {
                        q.add(g);
                        visit.put(g,true);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DSA_364_Clone_Graph graph = new DSA_364_Clone_Graph();
        GraphNode source = graph.buildGraph();
        System.out.println("BFS traversal of a graph before cloning");
        graph.bfs(source);
        GraphNode newSource = graph.cloneGraph(source);
        System.out.println("BFS traversal of a graph after cloning");
        graph.bfs(newSource);
    }
}
