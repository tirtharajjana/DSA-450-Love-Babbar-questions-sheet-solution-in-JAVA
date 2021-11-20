package DSA;

public class DSA_144_Remove_duplicate_element_from_sorted_Linked_List {
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
    static Node removeDuplicates(Node head){
        Node t=null;
        t=head;
        while(t.next!= null){
            if(t.data == t.next.data){
                t.next=t.next.next;
            }
            else {
                t=t.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = newNode(20);
        head.next = newNode(20);
        head.next.next = newNode(20);
        head.next.next.next = newNode(20);
        head.next.next.next.next = newNode(20);

        head=removeDuplicates(head);
        printLL(head);
    }
}
