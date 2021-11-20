package DSA;

public class DSA_147_Add_1_to_a_number_represented_as_linked_list {
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

    static Node reverse(Node head){
        Node next=null,curr=head,prev=null;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    static Node addOneUtil(Node head){
        Node res=head;
        Node temp=null,prev=null;

        int carry=1,sum;

        while(head != null){
            sum=carry+ head.data;
            carry = (sum >= 10) ? 1 : 0;
            sum%=10;
            head.data=sum;
            temp = head;
            head = head.next;
        }
        if (carry > 0)
            temp.next = newNode(carry);
        return res;
    }

    static Node addOne(Node head){
        head=reverse(head);

        head = addOneUtil(head);

        return reverse(head);
    }

    public static void main(String[] args) {
        Node head = newNode(1);
        head.next = newNode(9);
        head.next.next = newNode(9);
        head.next.next.next = newNode(9);

        System.out.print("List is ");
        printLL(head);

        head = addOne(head);
        System.out.println();
        System.out.print("Resultant list is ");
        printLL(head);
    }
}
