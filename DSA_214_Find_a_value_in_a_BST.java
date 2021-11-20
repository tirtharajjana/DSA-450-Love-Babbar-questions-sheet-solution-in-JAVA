package DSA;

public class DSA_214_Find_a_value_in_a_BST {
    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    DSA_214_Find_a_value_in_a_BST()
    {
        root = null;
    }

    void insert(int key){
        root=insertRec(root,key);
    }

    Node insertRec(Node root, int key){
        if(root == null){
            root=new Node(key);
            return root;
        }
        if(root.key > key){
            root.left=insertRec(root.left, key);
        }
        else{
            root.right=insertRec(root.right, key);
        }
        return  root;
    }
     Node search(Node root, int key){
        if(root == null || root.key == key)
            return root;

        if(root.key > key)
            return search(root.left, key);
        return search(root.right,key);
     }

    public static void main(String[] args) {
        DSA_214_Find_a_value_in_a_BST tree = new DSA_214_Find_a_value_in_a_BST();

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

//        Node res=tree.search(tree.root, 20);
        Node res=tree.search(tree.root, 10);
        if(res == null)
            System.out.println("No key found");
        else
            System.out.println("key found :"+res.key);

    }
}
