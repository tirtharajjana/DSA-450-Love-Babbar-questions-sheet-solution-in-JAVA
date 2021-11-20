package DSA;

public class DSA_216_Find_min_and_max_value_in_a_BST {
    static class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    Node insert(Node node, int data){
        if(node == null)
            return new Node(data);
        if(node.data > data)
            node.left=insert(node.left,data);
        else
            node.right=insert(node.right,data);

        return node;
    }

    int minvalue(Node node) {
        if(node.left == null)
            return node.data;
        return minvalue(node.left);
    }
    int maxvalue(Node node){
        if(node.right == null)
            return node.data;
        return maxvalue(node.right);
    }

    public static void main(String[] args) {
        DSA_216_Find_min_and_max_value_in_a_BST tree = new DSA_216_Find_min_and_max_value_in_a_BST();
        Node root = null;
        root = tree.insert(root, 4);
        tree.insert(root, 2);
        tree.insert(root, 1);
        tree.insert(root, 3);
        tree.insert(root, 6);
        tree.insert(root, 5);

        System.out.println("Minimum value of BST is " + tree.minvalue(root));
        System.out.println("Maximum value of BST is " + tree.maxvalue(root));
    }
    
}
