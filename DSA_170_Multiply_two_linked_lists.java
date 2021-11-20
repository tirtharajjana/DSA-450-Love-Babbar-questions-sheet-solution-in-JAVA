package DSA;

public class DSA_170_Multiply_two_linked_lists {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }

    static long multiplyTwoLists(Node first, Node second){
        int num1=0,num2=0;

        while (first!= null || second != null){
            if(first!= null){
                num1=(num1*10)+first.data;
                first=first.next;
            }
            if(second!= null){
                num2=(num2*10)+second.data;
                second=second.next;
            }
        }

        return num1*num2;
    }
    public static void main(String args[])
    {
        // create first list 9->4->6
        Node first = new Node(9);
        first.next = new Node(4);
        first.next.next = new Node(6);
        ;

        // create second list 8->4
        Node second = new Node(8);
        second.next = new Node(4);


        // Multiply the two lists and see result
        System.out.print("Result is: ");
        System.out.println(multiplyTwoLists(first, second));
    }
}
