package DSA;

public class DSA_151_Merge_Sort_for_Linked_Lists {
    Node head=null;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
        }
    }

    void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    Node sortedMerge(Node a, Node b)
    {
        Node result = null;

        if (a == null)
            return b;
        if (b == null)
            return a;


        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
    Node mergeSort(Node h){
        if(h == null || h.next ==null){
            return h;
        }
        Node middle=getMiddle(h);
        Node nextOfMiddle=middle.next;

        middle.next=null;

        Node left=mergeSort(h);
        Node right=mergeSort(nextOfMiddle);

        Node sortedList=sortedMerge(left,right);

        return sortedList;
    }

    public static Node getMiddle(Node head){
        if(head ==null)
            return head;
        Node slow=head,fast=head;

        while (fast.next !=null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    void printList(Node headref)
    {
        while (headref != null) {
            System.out.print(headref.data + " ");
            headref = headref.next;
        }
    }


    public static void main(String[] args) {
        DSA_151_Merge_Sort_for_Linked_Lists li = new DSA_151_Merge_Sort_for_Linked_Lists();

        li.push(15);
        li.push(10);
        li.push(5);
        li.push(20);
        li.push(3);
        li.push(2);


        li.head = li.mergeSort(li.head);
        System.out.print("\n Sorted Linked List is: \n");
        li.printList(li.head);
    }
}
