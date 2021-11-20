package DSA;

public class DSA_155_Split_a_Circular_Linked_List_into_two_halves {

    static Node head, head1, head2;

    static class Node {

        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
    }

    void splitList(){
        Node slow=head;
        Node fast=head;

        if(head == null)
            return;

        while (fast.next != head && fast.next.next != head){
            fast =fast.next.next;
            slow=slow.next;
        }

        if(fast.next.next == head)
            fast= fast.next;

        head1=head;

        if(head.next!=head){
            head2=slow.next;
        }

        fast.next=slow.next;

        slow.next=head;
    }


    public static void main(String[] args) {
        DSA_155_Split_a_Circular_Linked_List_into_two_halves list = new DSA_155_Split_a_Circular_Linked_List_into_two_halves();

        //Created linked list will be 12->56->2->11
        list.head = new Node(12);
        list.head.next = new Node(56);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(11);
        list.head.next.next.next.next = list.head;

        System.out.println("Original Circular Linked list ");
        list.printList(head);

        // Split the list
        list.splitList();
        System.out.println("");
        System.out.println("First Circular List ");
        list.printList(head1);
        System.out.println("");
        System.out.println("Second Circular List ");
        list.printList(head2);
    }
}
