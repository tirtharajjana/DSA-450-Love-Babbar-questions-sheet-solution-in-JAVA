package DSA;

public class DSA_225_Kth_largest_element_in_BST {
     static class Node {

        int data;
        Node left, right;

        Node(int d)
        {
            data = d;
            left = right = null;
        }
    }

    Node root;

    // Constructor
    DSA_225_Kth_largest_element_in_BST()
    {
        root = null;
    }

    // function to insert nodes
    public void insert(int data)
    {
        this.root = this.insertRec(this.root, data);
    }

    /* A utility function to insert a new node
    with given key in BST */
    Node insertRec(Node node, int data)
    {
        /* If the tree is empty, return a new node */
        if (node == null) {
            this.root = new Node(data);
            return this.root;
        }

        if (data == node.data) {
            return node;
        }

        if (data < node.data) {
            node.left = this.insertRec(node.left, data);
        } else {
            node.right = this.insertRec(node.right, data);
        }
        return node;
    }

    // class that stores the value of count
    public class count {
        int c = 0;
    }

    void kthLargestUtil(Node node, int k, count C){
        if(node == null || C.c>=k){
            return;
        }

        this.kthLargestUtil(node.right,k,C);
        C.c++;
        if(C.c == k){
            System.out.println(k + "th largest element is " + node.data);
            return;
        }

        this.kthLargestUtil(node.left,k,C);
    }
    void kthLargest(int k)
    {
        count c = new count(); // object of class count
        this.kthLargestUtil(this.root, k, c);
    }

    public static void main(String[] args) {
        DSA_225_Kth_largest_element_in_BST tree = new DSA_225_Kth_largest_element_in_BST();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        for (int i = 1; i <= 7; i++) {
            tree.kthLargest(i);
        }
    }

}
