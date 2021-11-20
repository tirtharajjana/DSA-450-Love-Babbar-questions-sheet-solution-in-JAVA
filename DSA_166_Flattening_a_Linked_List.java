package DSA;

public class DSA_166_Flattening_a_Linked_List {
    Node head;
    class Node{
        int data;
        Node right,down;
        Node(int d){
            this.data=d;
            right=null;
            down=null;
        }
    }

    Node push(Node head,int data){
        Node new_node=new Node(data);
        new_node.down=head;
        head=new_node;
        return head;
    }

    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.down;
        }
        System.out.println();
    }

    Node merge(Node a, Node b){
        if(a == null) return b;
        if(b == null) return a;

        Node res;

        if(a.data < b.data){
            res = a ;
            res.down=merge(a.down,b);
        }
        else{
            res=b;
            res.down=merge(b.down,a);
        }
        res.right=null;

        return res;
    }

    Node flatten(Node root){
        if(root == null || root.down == null){
            return root;
        }

        root.right=flatten(root.right);

        root=merge(root,root.right);

        return root;
    }

    public static void main(String[] args) {
        DSA_166_Flattening_a_Linked_List L = new DSA_166_Flattening_a_Linked_List();

        /* Let us create the following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */

        L.head = L.push(L.head, 30);
        L.head = L.push(L.head, 8);
        L.head = L.push(L.head, 7);
        L.head = L.push(L.head, 5);

        L.head.right = L.push(L.head.right, 20);
        L.head.right = L.push(L.head.right, 10);

        L.head.right.right = L.push(L.head.right.right, 50);
        L.head.right.right = L.push(L.head.right.right, 22);
        L.head.right.right = L.push(L.head.right.right, 19);

        L.head.right.right.right = L.push(L.head.right.right.right, 45);
        L.head.right.right.right = L.push(L.head.right.right.right, 40);
        L.head.right.right.right = L.push(L.head.right.right.right, 35);
        L.head.right.right.right = L.push(L.head.right.right.right, 20);

        // flatten the list
        L.head = L.flatten(L.head);

        L.printList();
    }
}
