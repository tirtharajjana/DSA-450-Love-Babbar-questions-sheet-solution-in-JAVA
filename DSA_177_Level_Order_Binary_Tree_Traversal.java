package DSA;
import java.util.Queue;
import java.util.LinkedList;

 class Node1 {
    int data;
    Node1 left, right;

    public Node1(int item) {
        data = item;
        left = null;
        right = null;
    }
}

public class DSA_177_Level_Order_Binary_Tree_Traversal {
    Node1 root;

    void printLevelOrder(){
        Queue<Node1> queue = new LinkedList<Node1>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            Node1 tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        DSA_177_Level_Order_Binary_Tree_Traversal tree_level = new DSA_177_Level_Order_Binary_Tree_Traversal();
        tree_level.root = new Node1(1);
        tree_level.root.left = new Node1(2);
        tree_level.root.right = new Node1(3);
        tree_level.root.left.left = new Node1(4);
        tree_level.root.left.right = new Node1(5);

        System.out.println("Level order traversal binary tree is - ");
                tree_level.printLevelOrder();
    }

}
