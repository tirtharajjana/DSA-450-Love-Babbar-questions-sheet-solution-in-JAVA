package DSA;

public class DSA_162_Rotate_DLL_by_N_nodes {
    static Node head;
    static class Node
    {
        int data;
        Node next, prev;
        Node(int d)
        {
            data = d;
            next = prev = null;
        }
    }

    void push(int new_data)
    {

        Node new_node = new Node(new_data);

        new_node.prev = null;

        new_node.next = head;

        if (head != null)
        {
            head.prev = new_node;
        }

        head = new_node;
    }

    void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    void rotate(int n){
        Node tail=head;
        while(tail.next != null){
            tail=tail.next;
        }

        while (n>0){
            Node t=head.next;
            head.next=null;
            head.prev=tail;
            tail.next=head;
            tail=tail.next;
            t.prev=null;
            head=t;
            n--;
        }
    }

    public static void main(String[] args) {
        DSA_162_Rotate_DLL_by_N_nodes list = new DSA_162_Rotate_DLL_by_N_nodes();


        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.println("Original Doubly linked list:");
        list.printList(head);

        list.rotate(3);
        System.out.println("");
        System.out.println("Doubly Linked List after rotate:");
        list.printList(head);
    }
}
