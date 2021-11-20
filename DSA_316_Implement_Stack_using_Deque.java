package DSA;

public class DSA_316_Implement_Stack_using_Deque {
    static class DQueNode{
        int value;
        DQueNode prev;
        DQueNode next;
    }

    static class deque{
        private DQueNode head;
        private DQueNode tail;

        public deque(){
            head=tail=null;
        }

        boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }

        int size(){
            if(!isEmpty()){
                DQueNode temp=head;
                int len=0;
                while(temp != null){
                    len++;
                    temp=temp.next;
                }
                return len;

            }
            return 0;
        }

        void insert_last(int element){
            DQueNode temp=new DQueNode();
            temp.value=element;

            if(head == null){
                head=tail=temp;
                temp.prev=temp.next=null;
            }else{
                tail.next=temp;
                temp.next=null;
                temp.prev=tail;
                tail=temp;
            }

        }
        void remove_last()
        {
            if (!isEmpty())
            {
                DQueNode temp = tail;
                tail = tail.prev;
                tail.next = null;

                return;
            }
            System.out.print("List is Empty");
        }

        void display()
        {

            // If list is not empty
            if (!isEmpty())
            {
                DQueNode temp = head;

                while (temp != null)
                {
                    System.out.print(temp.value + " ");
                    temp = temp.next;
                }

                return;
            }
            System.out.print("List is Empty");
        }
    }

    static class Stack
    {
        deque d = new deque();

        // push to push element at top of stack
        // using insert at last function of deque
        public void push(int element)
        {
            d.insert_last(element);
        }

        // Returns size
        public int size()
        {
            return d.size();
        }

        // pop to remove element at top of stack
        // using remove at last function of deque
        public void pop()
        {
            d.remove_last();
        }

        // Display
        public void display()
        {
            d.display();
        }
    }

    public static void main(String[] args)
    {

        // Object of Stack
        Stack stk = new Stack();

        // push 7 and 8 at top of stack
        stk.push(7);
        stk.push(8);
        System.out.print("Stack: ");
        stk.display();

        // For new line
        System.out.println();

        // pop an element
        stk.pop();
        System.out.print("Stack: ");
        stk.display();

        // For new line
        System.out.println();

        System.out.println("Size of stack is " +
                stk.size());

    }

}
