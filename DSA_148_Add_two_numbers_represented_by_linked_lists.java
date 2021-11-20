package DSA;

public class DSA_148_Add_two_numbers_represented_by_linked_lists {
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

    static Node addTwoLists(Node first,Node second){
        first=reverse(first);
        second=reverse(second);

        Node sum=null;
        int carry=0;

        while(first != null || second != null || carry >0){
            int newVal=carry;
            if(first!=null) newVal+= first.data;;
            if (second != null) newVal+= second.data;

            carry=newVal/10;
            newVal=newVal%10;

            Node newNode= newNode(newVal);

            newNode.next=sum;
            sum=newNode;

            if(first!=null) first = first.next;
            if(second!=null) second = second.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Node head1 = newNode(9);
        head1.next = newNode(9);
        head1.next.next = newNode(9);
        head1.next.next.next = newNode(9);

        Node head2 = newNode(1);
//        head2.next = newNode(9);
//        head2.next.next = newNode(9);
//        head2.next.next.next = newNode(9);

        System.out.print("Resultant List is ");
        Node res=addTwoLists(head1,head2);
        printLL(res);
    }
}
