package DSA;

public class DSA_196_Construct_Tree_from_Inorder_and_Preorder {
    static class Node {
        char data;
        Node left, right;

        Node(char item)
        {
            data = item;
            left = right = null;
        }
    }
    Node root;
    static int preIndex = 0;

    Node buildTree(char in[], char pre[], int inStrt, int inEnd){
        if(inStrt>inEnd)
            return null;

        Node tNode=new Node(pre[preIndex++]);
        if(inStrt == inEnd)
            return tNode;

        int inIndex= search(in,inStrt,inEnd,tNode.data);

        tNode.left=buildTree(in,pre,inStrt,inIndex-1);
        tNode.right=buildTree(in,pre,inIndex+1,inEnd);

        return tNode;
    }
    int search(char arr[], int strt, int end, char value)
    {
        int i;
        for (i = strt; i <= end; i++) {
            if (arr[i] == value)
                return i;
        }
        return i;
    }

    void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.data + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    public static void main(String[] args) {
        DSA_196_Construct_Tree_from_Inorder_and_Preorder tree = new DSA_196_Construct_Tree_from_Inorder_and_Preorder();
        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };
        int len = in.length;
        Node root = tree.buildTree(in, pre, 0, len - 1);

        // building the tree by printing inorder traversal
        System.out.println("Inorder traversal of constructed tree is : ");
        tree.printInorder(root);
    }
}
