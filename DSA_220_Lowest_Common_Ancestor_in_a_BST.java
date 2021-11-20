package DSA;

public class DSA_220_Lowest_Common_Ancestor_in_a_BST {
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

    Node lca(Node node, int n1, int n2){
        if(node == null)
            return null;

        if(node.data > n1 && node.data > n2)
            return lca(node.left, n1, n2);

        if (node.data < n1 && node.data < n2)
            return lca(node.right, n1, n2);

        return node;
    }

    public static void main(String[] args) {
        DSA_220_Lowest_Common_Ancestor_in_a_BST tree = new DSA_220_Lowest_Common_Ancestor_in_a_BST();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        int n1 = 10, n2 = 14;
        Node t = tree.lca(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

        n1 = 14;
        n2 = 8;
        t = tree.lca(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

        n1 = 10;
        n2 = 22;
        t = tree.lca(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

    }

}
