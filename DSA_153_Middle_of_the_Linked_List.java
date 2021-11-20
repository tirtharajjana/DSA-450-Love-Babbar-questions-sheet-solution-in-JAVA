package DSA;

public class DSA_153_Middle_of_the_Linked_List {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    Node head;

    void addNode(int data){
        if(head == null){
            head=new Node(data);
            return;
        }
        Node curr=head;
        while (curr.next != null)
            curr=curr.next;

        Node newNode=new Node(data);
        curr.next=newNode;
    }

    void printList(Node n)
    {
        while (n != null) {
            System.out.print(n.data);
            System.out.print(" ");
            n = n.next;
        }
    }

    static int middleNode(Node head){
        Node slow=head,fast= head;
        while (fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        DSA_153_Middle_of_the_Linked_List list
                = new DSA_153_Middle_of_the_Linked_List();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);
        list.addNode(9);
        list.addNode(10);
        list.addNode(11);
        list.addNode(12);
        list.addNode(13);
        System.out.println(middleNode(list.head));
    }
}
