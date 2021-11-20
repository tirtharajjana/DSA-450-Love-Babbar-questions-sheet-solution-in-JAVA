package DSA;

public class DSA_218_Check_for_BST {
    static class Node
    {
        int data;
        Node left, right;

        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    Node root;


    boolean isBST()  {
        return isBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    boolean isBSTUtil(Node node, int min, int max){
        if(node == null)
            return true;
        if(node.data < min || node.data > max)
            return false;
        return (isBSTUtil(node.left,min, node.data-1) && isBSTUtil(node.right, node.data+1, max));
    }

    public static void main(String[] args) {
        DSA_218_Check_for_BST tree = new DSA_218_Check_for_BST();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);

        if (tree.isBST())
            System.out.println("IS BST");
        else
            System.out.println("Not a BST");
    }

    

}
