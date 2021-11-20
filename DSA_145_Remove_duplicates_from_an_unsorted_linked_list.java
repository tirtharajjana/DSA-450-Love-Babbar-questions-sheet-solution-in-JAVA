package DSA;

import java.util.HashSet;

public class DSA_145_Remove_duplicates_from_an_unsorted_linked_list {
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

    static void removeDuplicate(Node head){
        HashSet<Integer> h=new HashSet<>();

        Node curr=head;
        Node prev=null;

        while (curr !=null){
            if (h.contains(curr.data)) {
                prev.next=curr.next;
            }
            else{
                h.add(curr.data);
                prev=curr;
            }
            curr=curr.next;
        }

    }

    public static void main(String[] args) {
        Node head = newNode(20);
        head.next = newNode(50);
        head.next.next = newNode(20);
        head.next.next.next = newNode(70);
        head.next.next.next.next = newNode(20);

        removeDuplicate(head);
        printLL(head);
    }
}
