package DSA;

public class DSA_185_Print_Left_View_of_a_Binary_Tree {
    static class Node {
        int data;
        Node left, right;

        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    Node root;
    static int max_level = 0;

    // recursive function to print left view
    void leftViewUtil(Node node, int level){
        if(node == null)
            return;

        if(max_level < level){
            System.out.print(" " + node.data);
            max_level=level;
        }

        leftViewUtil(node.left,level+1);
        leftViewUtil(node.right,level+1);
    }
    void leftView()
    {
        leftViewUtil(root, 1);
    }

    public static void main(String[] args) {
        DSA_185_Print_Left_View_of_a_Binary_Tree tree = new DSA_185_Print_Left_View_of_a_Binary_Tree();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);

        tree.leftView();
    }
}
