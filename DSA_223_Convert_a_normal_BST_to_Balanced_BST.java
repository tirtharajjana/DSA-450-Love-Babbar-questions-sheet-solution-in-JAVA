package DSA;

import java.util.Vector;

public class DSA_223_Convert_a_normal_BST_to_Balanced_BST {
    static class Node
    {
        int data;
        Node left, right;

        public Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }

    Node root;
    void storeBSTNodes(Node root, Vector<Node> nodes){
        if(root == null)
            return;
        storeBSTNodes(root.left,nodes);
        nodes.add(root);
        storeBSTNodes(root.right,nodes);
    }
    Node buildTreeUtil(Vector<Node> nodes, int start, int end){
        if(start>end)
            return null;
        int mid=(start+end)/2;
        Node node=nodes.get(mid);
        node.left=buildTreeUtil(nodes,start,mid-1);
        node.right=buildTreeUtil(nodes,mid+1,end);

        return node;
    }

    Node buildTree(Node root){
        Vector<Node> nodes=new Vector<>();
        storeBSTNodes(root,nodes);
        int n=nodes.size();
        return buildTreeUtil(nodes,0,n-1);
    }
    void preOrder(Node node)
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        DSA_223_Convert_a_normal_BST_to_Balanced_BST tree = new DSA_223_Convert_a_normal_BST_to_Balanced_BST();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(7);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.left.left = new Node(5);

        tree.root = tree.buildTree(tree.root);
        System.out.println("Preorder traversal of balanced BST is :");
        tree.preOrder(tree.root);
    }
}
