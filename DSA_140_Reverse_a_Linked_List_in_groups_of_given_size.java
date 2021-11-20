package DSA;

public class DSA_140_Reverse_a_Linked_List_in_groups_of_given_size {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next = null;
        }
    }

    Node reverse(Node head,int k){
        if(head.next == null){
            return null;
        }
        Node current = head;
        Node prev=null;
        Node next=null;

        int count=0;

        while(count<k && current !=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }

        if (next != null) {
            head.next=reverse(next,k);
        }

        return prev;
    }

    public void push(int d){
        Node new_node=new Node(d);
        new_node.next=head;
        head=new_node;
    }
    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        DSA_140_Reverse_a_Linked_List_in_groups_of_given_size llist = new DSA_140_Reverse_a_Linked_List_in_groups_of_given_size();

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        llist.push(9);
        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.println("Given Linked List");
        llist.printList();

        llist.head = llist.reverse(llist.head, 3);

        System.out.println("Reversed list");
        llist.printList();
    }

}
