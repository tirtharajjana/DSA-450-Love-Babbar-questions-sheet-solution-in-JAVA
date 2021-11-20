package DSA;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class DSA_178_Reverse_Level_Order_Traversal {
    static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right;
        }
    }

    Node root;
    void reverseLevelOrder(Node node){
        Stack<Node> s=new Stack<>();
        Queue<Node> q=new LinkedList<>();

        q.add(node);

        while (!q.isEmpty()){
            Node polled=q.poll();
            s.push(polled);

            if(polled.right != null){
                q.add(polled.right);
            }

            if(polled.left != null){
                q.add(polled.left);
            }
        }

        while (!s.isEmpty()){
            System.out.print(s.pop().data + " ");
        }
    }

    public static void main(String[] args) {
        DSA_178_Reverse_Level_Order_Traversal tree = new DSA_178_Reverse_Level_Order_Traversal();

        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Level Order traversal of binary tree is :");
        tree.reverseLevelOrder(tree.root);
    }

}
