package DSA;

public class DSA_181_Create_a_mirror_tree_from_the_given_binary_tree {
    static class Node
    {
        int val;
        Node left;
        Node right;
    }

    public static Node createNode(int val)
    {
        Node newNode = new Node();
        newNode.val = val;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    public static void inOrder(Node root)
    {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    public static Node mirrorTree(Node root){
        if(root == null)
            return null;

        Node left=mirrorTree(root.left);
        Node right=mirrorTree(root.right);

        root.left=right;
        root.right=left;

        return root;
    }

    public static void main(String[] args) {
        Node tree = createNode(5);
        tree.left = createNode(3);
        tree.right = createNode(6);
        tree.left.left = createNode(2);
        tree.left.right = createNode(4);
        System.out.print("Inorder of original tree: ");
        inOrder(tree);

        // Function call
        mirrorTree(tree);

        System.out.print("\nInorder of mirror tree: ");
        inOrder(tree);
    }
}
