package DSA;

public class DSA_157_Deletion_from_a_Circular_Linked_List {
    static Node head;
    static class Node{
        int data;
        Node next;
    }
    static Node newNode(int d) {
        Node temp = new Node();
        temp.data = d;
        temp.next = null;
        return temp;
    }
   static void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
    }

    static Node deleteNode(Node head, int key){
        if(head == null){
            return null;
        }

        Node curr=head,prev=null;

        while(curr.data != key){
            if(curr.next == head){
                System.out.println("Not found");
                break;
            }
            prev=curr;
            curr=curr.next;
        }

        if(curr == head && curr.next == head)
        {
            head=null;
            return head;
        }

        if(curr == head){
            prev=head;
            while (prev.next!= head){
                prev=prev.next;
            }
            head=curr.next;
            prev.next=curr.next;
        }
        else if(curr.next == head){
            prev.next=head;
        }
        else{
            prev.next=curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        head = newNode(1);
        head.next = newNode(9);
        head.next.next = newNode(7);
        head.next.next.next = newNode(1);
        head.next.next.next.next=head;

        System.out.printf("List Before Deletion: ");
        printList(head);
        System.out.println();
        head = deleteNode(head, 7);

        System.out.printf("List After Deletion: ");
        printList(head);
    }
}
