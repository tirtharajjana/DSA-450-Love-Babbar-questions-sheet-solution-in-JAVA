package DSA;

public class DSA_230_Replace_every_element_with_the_least_greater_element_on_its_right {
    class Node
    {
        int data;
        Node left, right;

        Node(int d)
        {
            data = d;
            left = right = null;
        }
    }

    // Root of BST
    static Node root;
    static Node succ;

    // Constructor
    DSA_230_Replace_every_element_with_the_least_greater_element_on_its_right()
    {
        root = null;
        succ = null;
    }

    // A utility function to insert a new node with
// given data in BST and find its successor
    Node insert(Node node, int data)
    {

        // If the tree is empty, return a new node
        if (node == null)
        {
            node = new Node(data);
        }

        // If key is smaller than root's key,
        // go to left subtree and set successor
        // as current node
        if (data < node.data)
        {
            succ = node;
            node.left = insert(node.left, data);
        }

        // Go to right subtree
        else if (data > node.data)
            node.right = insert(node.right, data);

        return node;
    }

    // Function to replace every element with the
// least greater element on its right
    static void replace(int arr[], int n){
        DSA_230_Replace_every_element_with_the_least_greater_element_on_its_right tree=new DSA_230_Replace_every_element_with_the_least_greater_element_on_its_right();
        for(int i=n-1;i>=0;i--){
            succ =null;

            root=tree.insert(root,arr[i]);
            if(succ!= null){
                arr[i]=succ.data;
            }
            else{
                arr[i]=-1;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 8, 58, 71, 18, 31,
                32, 63, 92, 43, 3,
                91, 93, 25, 80, 28 };
        int n = arr.length;

        replace(arr, n);

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
