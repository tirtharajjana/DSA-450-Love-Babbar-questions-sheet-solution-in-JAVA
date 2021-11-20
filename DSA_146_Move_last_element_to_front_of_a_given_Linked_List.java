package DSA;

public class DSA_146_Move_last_element_to_front_of_a_given_Linked_List {
    Node head;
    static class Node{
        int data;
        Node next;
    }
    static Node newNode(int d){
        Node temp=new Node();
        temp.data=d;
        temp.next=null;
        return temp;
    }
    static void printLL(Node head){
        while(head!= null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println();
    }
    static Node moveToFront(Node head){
        Node t=head;
        Node prev=null;
        while (t.next != null){
            prev=t;
            t=t.next;
        }
        prev.next=null;
        t.next=head;
        return t;

    }
    public static void main(String[] args) {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(5);

        head=moveToFront(head);
        printLL(head);
    }
}
