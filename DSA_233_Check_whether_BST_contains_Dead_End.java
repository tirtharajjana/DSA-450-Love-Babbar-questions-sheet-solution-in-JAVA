package DSA;

import java.util.HashSet;

public class DSA_233_Check_whether_BST_contains_Dead_End {
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

    /* A utility function to insert a new node with
    given key in BST */
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
    static HashSet<Integer> all_nodes =new HashSet<>();
    static HashSet<Integer> leaf_nodes =new HashSet<>();
    static void storeNodes(Node root ){
        if(root == null)
            return;
        all_nodes.add(root.data);
        if(root.left == null && root.right ==null){
            leaf_nodes.add(root.data);
        }
        storeNodes(root.left);
        storeNodes(root.right);
    }

    static boolean isDeadEnd(Node root){
        if(root == null)
            return false;

        all_nodes.add(0);
        storeNodes(root);

        for(Integer i:leaf_nodes){
            if(all_nodes.contains(i-1) && all_nodes.contains(i+1))
                return true;
        }
        return false;
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

        if(isDeadEnd(root))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
