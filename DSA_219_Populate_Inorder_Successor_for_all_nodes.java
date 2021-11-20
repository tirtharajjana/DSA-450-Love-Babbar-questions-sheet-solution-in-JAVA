package DSA;

public class DSA_219_Populate_Inorder_Successor_for_all_nodes {
    static class Node
    {
        int data;
        Node left, right, next;

        Node(int item)
        {
            data = item;
            left = right = next = null;
        }
    }
    Node root;
    static Node next = null;

    /* Set next of p and all descendants of p by traversing them in
       reverse Inorder */
    void populateNext(Node node){
        if(node!= null){
            populateNext(node.right);
            node.next=next;
            next=node;
            populateNext(node.left);
        }
    }

    public static void main(String[] args) {
        DSA_219_Populate_Inorder_Successor_for_all_nodes tree = new DSA_219_Populate_Inorder_Successor_for_all_nodes();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(12);
        tree.root.left.left = new Node(3);

        // Populates nextRight pointer in all nodes
        tree.populateNext(tree.root);

        // Let us see the populated values
        Node ptr = tree.root.left.left;
        while (ptr != null)
        {
            // -1 is printed if there is no successor
            int print = ptr.next != null ? ptr.next.data : -1;
            System.out.println("Next of " + ptr.data + " is: " + print);
            ptr = ptr.next;
        }
    }
}
