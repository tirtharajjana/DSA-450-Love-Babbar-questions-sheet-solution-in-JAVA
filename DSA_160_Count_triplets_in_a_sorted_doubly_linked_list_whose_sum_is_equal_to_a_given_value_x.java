package DSA;

import java.util.HashMap;

public class DSA_160_Count_triplets_in_a_sorted_doubly_linked_list_whose_sum_is_equal_to_a_given_value_x {
    static class Node {
        int data;
        Node next, prev;
        Node(int val)
        {
            data = val;
            prev = null;
            next = null;
        }
    };

    static int countTriplets(Node head, int x){
        Node ptr,ptr1,ptr2;
        int count=0;

        HashMap<Integer,Node> hm=new HashMap<Integer,Node>();

        for(ptr=head;ptr!= null ;ptr=ptr.next)
            hm.put(ptr.data,ptr);

        for(ptr1=head;ptr1!= null;ptr1=ptr1.next)
            for(ptr2=ptr1.next;ptr2!= null;ptr2=ptr2.next){
                int sum=ptr1.data+ ptr2.data;

                if(hm.containsKey(x-sum) && hm.get(x-sum) != ptr1 &&hm.get(x-sum) != ptr2 ){
                    count++;
                }
            }

        return count/3;
    }

    static Node insert(Node head, int val)
    {
        // allocate node
        Node temp = new Node(val);

        if (head == null)
            head = temp;

        else
        {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }

        return head;
    }

    public static void main(String[] args) {
        Node head = null;

        // insert values in sorted order
        head = insert(head, 9);
        head = insert(head, 8);
        head = insert(head, 6);
        head = insert(head, 5);
        head = insert(head, 4);
        head = insert(head, 2);
        head = insert(head, 1);

        int x = 17;

        System.out.print("Count = "
                + countTriplets(head, x));
    }
}
