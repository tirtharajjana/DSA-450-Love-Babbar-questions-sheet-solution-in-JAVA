package DSA;

public class DSA_229_Count_BST_nodes_that_lie_in_a_given_range {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }


    Node root;


    DSA_229_Count_BST_nodes_that_lie_in_a_given_range() {
        root = null;
    }


    int getCount(Node node, int low, int high){
        if(node  == null)
            return 0;
        else if(node.data >= low && node.data<= high)
            return 1+ this.getCount(node.left, low, high)+this.getCount(node.right, low, high);
        else {
            if(node.data < low)
                return this.getCount(node.right,low,high);
            return this.getCount(node.left,low,high);
        }
    }

    public static void main(String[] args) {
        DSA_229_Count_BST_nodes_that_lie_in_a_given_range tree = new DSA_229_Count_BST_nodes_that_lie_in_a_given_range();

        tree.root = new Node(10);
        tree.root.left     = new Node(5);
        tree.root.right     = new Node(50);
        tree.root.left.left = new Node(1);
        tree.root.right.left = new Node(40);
        tree.root.right.right = new Node(100);
        /* Let us constructed BST shown in above example
          10
        /    \
      5       50
     /       /  \
    1       40   100   */
        int l=5;
        int h=45;
        System.out.println("Count of nodes between [" + l + ", "
                + h+ "] is " + tree.getCount(tree.root,
                l, h));
    }
}
