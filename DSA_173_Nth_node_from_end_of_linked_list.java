package DSA;

public class DSA_173_Nth_node_from_end_of_linked_list {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    int getNthFromLast(Node head, int n){
        Node curr=head,nth = head;
        while(n!= 0)
        {
            if(curr == null)
                return -1;
            else
                curr=curr.next;
            n--;
        }
        while (curr != null){
            curr=curr.next;
            nth=nth.next;
        }

        if(nth == null)
            return -1;
        else
            return nth.data;
    }

    public static void main(String[] args) {
        DSA_173_Nth_node_from_end_of_linked_list llist = new DSA_173_Nth_node_from_end_of_linked_list();
        llist.push(9);
        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.println(llist.getNthFromLast(llist.head, 2));

    }

}
