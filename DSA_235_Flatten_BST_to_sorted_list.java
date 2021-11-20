package DSA;

public class DSA_235_Flatten_BST_to_sorted_list {
    static class Node {

        int data;
        Node left, right;

    }
    static Node newNode(int item)
    {
        Node temp = new Node();
        temp.data = item;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    static Node prev;

    static Node insert(Node node, int key)
    {
        /* If the tree is empty, return a new node */
        if (node == null) return newNode(key);

        /* Otherwise, recur down the tree */
        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);

        /* return the (unchanged) node pointer */
        return node;
    }

    static void print(Node parent)
    {
        Node curr = parent;
        while (curr != null) {
            System.out.printf(curr.data + " ");
            curr = curr.right;
        }
    }

    static void inorder(Node curr){
        if(curr == null)
            return;
        inorder(curr.left);
        prev.left=null;
        prev.right=curr;
        prev=curr;
        inorder(curr.right);
    }
    static Node flatten(Node parent){
        Node dummy=newNode(-1);

        prev=dummy;
        inorder(parent);

        prev.left=null;
        prev.right=null;
        Node ret=dummy.right;

        return ret;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 8);
        root = insert(root, 5);
        root = insert(root, 2);
        root = insert(root, 3);
        root = insert(root, 7);
        root = insert(root, 11);
        root = insert(root, 4);

        print(flatten(root));
    }
}
