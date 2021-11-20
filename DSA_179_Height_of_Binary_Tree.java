package DSA;

public class DSA_179_Height_of_Binary_Tree {
    static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    Node root;

    int maxDepth(Node node){
        if(node == null){
            return 0;
        }
        return 1+Math.max(maxDepth(node.left),maxDepth(node.right));
    }

    public static void main(String[] args) {
        DSA_179_Height_of_Binary_Tree tree = new DSA_179_Height_of_Binary_Tree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is : " + tree.maxDepth(tree.root));
    }

}
