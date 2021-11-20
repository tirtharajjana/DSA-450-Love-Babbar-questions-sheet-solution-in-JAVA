package DSA;

public class DSA_150_intersection_point_of_two_Linked_Lists {
    static Node head1,head2;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }

    int getCount(Node head){
        Node curr=head;
        int c=0;
        while (curr != null){
            c++;
            curr=curr.next;
        }
        return c;
    }

    int getNode(Node head1,Node head2){
        int c1=getCount(head1);
        int c2=getCount(head2);

        if(c1>c2){
            return _getIntesectionNode((c1-c2),head1,head2);
        }
        else{
            return _getIntesectionNode((c2-c1),head2,head1);
        }
    }

    int _getIntesectionNode(int d, Node node1, Node node2){
        Node curr1=node1;
        Node curr2=node2;

        for (int i = 0; i < d; i++) {
            if(curr1 == null){
                return -1;
            }
            curr1=curr1.next;
        }
        while (curr1 != null && curr2!= null ){
            if(curr1.data == curr2.data){
                return curr1.data;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        DSA_150_intersection_point_of_two_Linked_Lists list = new DSA_150_intersection_point_of_two_Linked_Lists();

        // creating first linked list
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);

        // creating second linked list
        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);

        System.out.println("The node of intersection is " + list.getNode(head1,head2));
    }
}
