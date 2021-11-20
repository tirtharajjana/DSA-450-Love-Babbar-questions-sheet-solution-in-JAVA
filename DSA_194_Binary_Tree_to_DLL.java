package DSA;

public class DSA_194_Binary_Tree_to_DLL {
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
    Node head;
    static Node prev = null;

    void BinaryTree2DoubleLinkedList(Node root){
        if(root  == null){
            return;
        }

        BinaryTree2DoubleLinkedList(root.left);

        if(prev == null){
            head=root;
        }
        else {
            root.left=prev;
            prev.right=root;
        }
        prev=root;

        BinaryTree2DoubleLinkedList(root.right);
    }
    void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }

    public static void main(String[] args) {
        DSA_194_Binary_Tree_to_DLL tree = new DSA_194_Binary_Tree_to_DLL();
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);

        // convert to DLL
        tree.BinaryTree2DoubleLinkedList(tree.root);

        // Print the converted List
        tree.printList(tree.head);
    }
}
