package DSA;

public class DSA_209_Kth_ancestor_of_a_node_in_binary_tree {
    static class Node
    {
        int data;
        Node left, right;
    };

    static Node temp = null;
    static int k;

    static Node newNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    static Node kthAncestorDFS(Node root, int node ){
        if(root == null)
            return  null;

        if(root.data == node ||  (temp = kthAncestorDFS(root.left,node)) != null || (temp = kthAncestorDFS(root.right,node)) != null ){
            if(k>0)
                k--;
            else if(k == 0){
                System.out.print("Kth ancestor is: "+root.data);
                return null;
            }
            return root;
        }
        return null;
    }

    public static void main(String[] args) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);

        k = 2;
        int node = 5;

        // print kth ancestor of given node
        Node parent = kthAncestorDFS(root,node);

        // check if parent is not null, it means
        // there is no Kth ancestor of the node
        if (parent != null)
            System.out.println("-1");
    }
}
