package DSA;

public class DSA_171_Delete_nodes_having_greater_value_on_right {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }

    static void delete(){
        Node temp=head;
        Node prev=null;
        while (temp.next != null){

            if(temp.data < temp.next.data){
                if(temp == head){
                    head=head.next;
                    temp=temp.next;
                }
                else {
                    prev.next=temp.next;
                    temp=temp.next;
                }
            }
            else {
                prev=temp;
                temp=temp.next;
            }

        }
    }
    static void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        head=new Node(12);
        head.next=new Node(15);
        head.next.next=new Node(10);
        head.next.next.next=new Node(11);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=new Node(2);
        head.next.next.next.next.next.next.next=new Node(3);

        delete();
        printList();
    }
}
