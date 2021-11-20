package DSA;

public class DSA_217_Find_inorder_successor_and_inorder_predecessor_in_a_BST {
    static class Node
    {
        int key;
        Node left, right;

        public Node()
        {}

        public Node(int key)
        {
            this.key = key;
            this.left = this.right = null;
        }
    };

    static Node pre = new Node(), suc = new Node();
    static Node insert(Node node, int key)
    {
        if (node == null)
            return new Node(key);
        if (key < node.key)
            node.left = insert(node.left, key);
        else
            node.right = insert(node.right, key);

        return node;
    }

    static void findPreSuc(Node root, int key){
        if(root == null){
            return;
        }
        if(root.key == key){
            if(root.left != null){
                Node temp=root.left;
                while (temp.right!= null)
                    temp=temp.right;
                pre=temp;
            }

            if(root.right != null){
                Node temp=root.right;
                while (temp.left!= null)
                    temp=temp.left;
                suc=temp;
            }
        }

        if(root.key > key){
            suc=root;
            findPreSuc(root.left,key);
        }
        else{
            pre = root;
            findPreSuc(root.right, key);
        }
    }

    public static void main(String[] args) {
        int key = 65;

        /*
         * Let us create following BST
         *          50
         *         /  \
         *        30   70
         *       /  \ /  \
         *      20 40 60  80
         */

        Node root = new Node();
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 20);
        insert(root, 40);
        insert(root, 70);
        insert(root, 60);
        insert(root, 80);

        findPreSuc(root, key);
        if (pre != null)
            System.out.println("Predecessor is " + pre.key);
        else
            System.out.println("No Predecessor");

        if (suc != null)
            System.out.println("Successor is " + suc.key);
        else
            System.out.println("No Successor");
    }

}
