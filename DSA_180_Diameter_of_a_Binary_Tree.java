package DSA;

public class DSA_180_Diameter_of_a_Binary_Tree {
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
    static int dia=0;

    static int util(Node root) {
        if(root == null){
            return 0;
        }

        int l=util(root.left);
        int r=util(root.right);

        if((l+r+1) > dia){
            dia=l+r+1;
        }
        return 1 + Math.max(l, r);
    }
    static int diameter(Node root) {
        util(root);
        return dia;
    }

    public static void main(String args[])
    {
        // creating a binary tree and entering the nodes
        DSA_180_Diameter_of_a_Binary_Tree tree = new DSA_180_Diameter_of_a_Binary_Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        // Function Call
        System.out.println("The diameter of given binary tree is : " + tree.diameter(tree.root));
    }
}
