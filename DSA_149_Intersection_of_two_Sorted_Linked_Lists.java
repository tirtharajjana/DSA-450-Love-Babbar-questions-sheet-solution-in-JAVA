package DSA;

public class DSA_149_Intersection_of_two_Sorted_Linked_Lists {
    static Node a=null,b=null,dummy=null,tail=null;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }

    void printList(Node start) {
        Node p = start;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    void push(int data){
        Node temp=new Node(data);
        if(dummy == null){
            dummy=temp;
            tail=temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
    }

    void sortedIntersect(){
        Node p=a, q=b;
        while (p!=null & q!=null){
            if(p.data == q.data)
            {

                push(p.data);
                p = p.next;
                q = q.next;
            }
            else if(p.data < q.data)
                p = p.next;
            else
                q= q.next;
        }
    }

    public static void main(String[] args) {
        DSA_149_Intersection_of_two_Sorted_Linked_Lists list = new DSA_149_Intersection_of_two_Sorted_Linked_Lists();

        // creating first linked list
        list.a = new Node(1);
        list.a.next = new Node(2);
        list.a.next.next = new Node(3);
        list.a.next.next.next = new Node(4);
        list.a.next.next.next.next = new Node(6);

        // creating second linked list
        list.b = new Node(2);
        list.b.next = new Node(4);
        list.b.next.next = new Node(6);
        list.b.next.next.next = new Node(8);

        // function call for intersection
        list.sortedIntersect();

        // print required intersection
        System.out.println("Linked list containing common items of a & b");
        list.printList(dummy);
    }
}
