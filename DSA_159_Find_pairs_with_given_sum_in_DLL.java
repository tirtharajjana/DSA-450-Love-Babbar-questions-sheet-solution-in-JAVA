package DSA;

public class DSA_159_Find_pairs_with_given_sum_in_DLL {
    static class Node
    {
        int data;
        Node next, prev;
    };


    static Node insert(Node head, int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.next = temp.prev = null;
        if (head == null)
            (head) = temp;
        else
        {
            temp.next = head;
            (head).prev = temp;
            (head) = temp;
        }
        return temp;
    }

    static void pairSum( Node head, int x){
        boolean found=false;
        Node first =head, second=head;

        while (second.next != null){
            second=second.next;
        }

        while ( first != second && second.next!= first){
            if(first.data+second.data == x){
                System.out.println( "(" + first.data +
                        ", "+ second.data + ")" );
                found=true;
                first=first.next;
                second=second.prev;
            }
            else {
                if ((first.data + second.data) < x)
                    first=first.next;
                else
                    second=second.prev;
            }
        }
        if (!found)
            System.out.println("No pair found!!!");

    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(head, 9);
        head = insert(head, 8);
        head = insert(head, 6);
        head = insert(head, 5);
        head = insert(head, 4);
        head = insert(head, 2);
        head = insert(head, 1);
        int x = 7;

        pairSum(head, x);
    }
}
