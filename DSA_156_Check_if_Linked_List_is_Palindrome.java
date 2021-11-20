package DSA;

public class DSA_156_Check_if_Linked_List_is_Palindrome {
    static Node head, head1;

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

        static Node reverse(){
        Node prev=null;
        Node next=null,curr=head;

        while(curr!= null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    static boolean isPalindrome(){
        while (head!= null){
            if(head.data != head1.data)
                return false;
            head1=head1.next;
            head=head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        head = newNode(1);
        head.next = newNode(9);
        head.next.next = newNode(9);
        head.next.next.next = newNode(1);

        head1=reverse();

        System.out.println(isPalindrome());

    }
}
