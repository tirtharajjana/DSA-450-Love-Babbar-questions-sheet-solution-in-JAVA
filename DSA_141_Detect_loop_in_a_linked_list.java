package DSA;

import java.util.HashSet;

public class DSA_141_Detect_loop_in_a_linked_list {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next = null;
        }
    }

    static boolean detectLoop(Node h) {
        HashSet<Node> s = new HashSet<Node>();
        while(h!=  null) {
            if(s.contains(h)) {
                return true;
            }
            s.add(h);
            h=h.next;
        }
        return false;
    }

    public void push(int d){
        Node new_node=new Node(d);
        new_node.next=head;
        head=new_node;
    }

    public static void main(String[] args) {
        DSA_141_Detect_loop_in_a_linked_list llist = new DSA_141_Detect_loop_in_a_linked_list();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }

}
