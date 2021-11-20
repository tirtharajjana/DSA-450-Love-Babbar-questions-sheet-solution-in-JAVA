package DSA;

public class DSA_190_Check_for_Balanced_Tree {
    static class Node {

        int data;
        Node left, right;

        Node(int d)
        {
            data = d;
            left = right = null;
        }
    }

    static class Height {
        int height = 0;
    }
    Node root;


    boolean isBalanced(Node root, Height height){
        if(root==null){
            height.height=0;
            return true;
        }
        Height lheight = new Height(), rheight = new Height();
        boolean l=isBalanced(root.left,lheight);
        boolean r=isBalanced(root.right,rheight);
        int lh= lheight.height,rh= rheight.height;

        height.height= (lh>rh ? lh:rh)+1;
        if (Math.abs(lh - rh) >= 2)
            return false;
        else
            return l && r;
    }

    public static void main(String[] args) {
        Height height = new Height();

        /* Constructed binary tree is
                   1
                 /   \
                2      3
              /  \    /
            4     5  6
            /
           7         */
        DSA_190_Check_for_Balanced_Tree tree = new DSA_190_Check_for_Balanced_Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.left.left = new Node(7);

        if (tree.isBalanced(tree.root, height))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }

}
