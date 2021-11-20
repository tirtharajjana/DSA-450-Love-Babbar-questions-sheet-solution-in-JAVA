package DSA;

public class DSA_158_Reverse_a_Doubly_Linked_List {
    static Node head;

    static class Node {

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

        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    void reverse(){
        Node temp=null;
        Node curr=head;

        while (curr != null){
            temp=curr.prev;
            curr.prev=curr.next;
            curr.next=temp;
            curr=curr.prev;
        }

        if(temp!=null){
            head=temp.prev;
        }
    }

    public static void main(String[] args) {
        DSA_158_Reverse_a_Doubly_Linked_List list = new DSA_158_Reverse_a_Doubly_Linked_List();

        /* Let us create a sorted linked list to test the
         functions Created linked list will be 10->8->4->2
       */
        list.push(2);
        list.push(4);
        list.push(8);
        list.push(10);

        System.out.println("Original linked list ");
        list.printList(head);

        list.reverse();
        System.out.println("");
        System.out.println("The reversed Linked List is ");
        list.printList(head);
    }
}
