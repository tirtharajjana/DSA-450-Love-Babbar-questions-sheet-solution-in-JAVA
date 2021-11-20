package DSA;

public class DSA_221_Construct_BST_from_given_preorder_traversal {
    static class Node {

        int data;
        Node left, right;

        Node(int d)
        {
            data = d;
            left = right = null;
        }
    }

    static class Index {

        int index = 0;
    }

    Index index = new Index();
    Node constructTree(int pre[], int size)
    {
        int preIndex = 0;
        return constructTreeUtil(pre, index, pre[0],
                Integer.MIN_VALUE,
                Integer.MAX_VALUE, size);
    }
    void printInorder(Node node)
    {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    Node constructTreeUtil(int pre[], Index preIndex, int key, int min, int max, int size){
        if(preIndex.index >= size)
            return null;
        Node root=null;

        if(key >min && key<max){
            root=new Node(key);
            preIndex.index+=1;

            if(preIndex.index<size){
                root.left=constructTreeUtil(pre, preIndex, pre[preIndex.index], min, key, size);
                root.right=constructTreeUtil(pre,preIndex,pre[preIndex.index],key,max,size );
            }
        }
        return root;
    }

    public static void main(String[] args) {
        DSA_221_Construct_BST_from_given_preorder_traversal tree = new DSA_221_Construct_BST_from_given_preorder_traversal();
        int pre[] = new int[] { 10, 5, 1, 7, 40, 50 };
        int size = pre.length;

        // Function call
        Node root = tree.constructTree(pre, size);
        System.out.println(
                "Inorder traversal of the constructed tree is ");
        tree.printInorder(root);
    }
}
