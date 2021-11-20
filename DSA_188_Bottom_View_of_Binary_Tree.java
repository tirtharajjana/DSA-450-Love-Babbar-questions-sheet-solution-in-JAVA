package DSA;

import java.util.TreeMap;

public class DSA_188_Bottom_View_of_Binary_Tree {
    static class Node
    {

        int data;

        int hd;

        Node left, right;

        public Node(int key)
        {
            data = key;
            hd = Integer.MAX_VALUE;
            left = right = null;
        }
    }



        static void printBottomViewUtil(Node root, int curr, int hd,
                                        TreeMap<Integer, int[]> m)
        {

            // Base case
            if (root == null)
                return;

            // If node for a particular
            // horizontal distance is not
            // present, add to the map.
            if (!m.containsKey(hd))
            {
                m.put(hd, new int[]{ root.data, curr });
            }

            // Compare height for already
            // present node at similar horizontal
            // distance
            else
            {
                int[] p = m.get(hd);
                if (p[1] <= curr)
                {
                    p[1] = curr;
                    p[0] = root.data;
                }
                m.put(hd, p);
            }

            // Recur for left subtree
            printBottomViewUtil(root.left, curr + 1,
                    hd - 1, m);

            // Recur for right subtree
            printBottomViewUtil(root.right, curr + 1,
                    hd + 1, m);
        }

        static void printBottomView(Node root)
        {

            // Map to store Horizontal Distance,
            // Height and Data.
            TreeMap<Integer, int[]> m = new TreeMap<>();

            printBottomViewUtil(root, 0, 0, m);

            // Prints the values stored by printBottomViewUtil()
            for(int val[] : m.values())
            {
                System.out.print(val[0] + " ");
            }
        }

        public static void main(String[] args) {
            Node root = new Node(20);
            root.left = new Node(8);
            root.right = new Node(22);
            root.left.left = new Node(5);
            root.left.right = new Node(3);
            root.right.left = new Node(4);
            root.right.right = new Node(25);
            root.left.right.left = new Node(10);
            root.left.right.right = new Node(14);

            System.out.println(
                    "Bottom view of the given binary tree:");

            printBottomView(root);
        }
}
