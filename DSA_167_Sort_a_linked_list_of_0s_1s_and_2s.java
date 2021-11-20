package DSA;

public class DSA_167_Sort_a_linked_list_of_0s_1s_and_2s {
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }


    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void sortList(){
        int count[]={0,0,0};

        Node ptr =head;

        while (ptr!= null){
            count[ptr.data]++;
            ptr=ptr.next;
        }

        int i=0;
        ptr =head;

        while (ptr!= null){
            if(count[i] == 0)
                i++;
            else{
                ptr.data=i;
                --count[i];
                ptr=ptr.next;
            }
        }
    }

    public static void main(String[] args) {
        DSA_167_Sort_a_linked_list_of_0s_1s_and_2s llist = new DSA_167_Sort_a_linked_list_of_0s_1s_and_2s();

        /* Constructed Linked List is 1->2->3->4->5->6->7->
           8->8->9->null */
        llist.push(0);
        llist.push(1);
        llist.push(0);
        llist.push(2);
        llist.push(1);
        llist.push(1);
        llist.push(2);
        llist.push(1);
        llist.push(2);

        System.out.println("Linked List before sorting");
        llist.printList();

        llist.sortList();

        System.out.println("Linked List after sorting");
        llist.printList();
    }
}
