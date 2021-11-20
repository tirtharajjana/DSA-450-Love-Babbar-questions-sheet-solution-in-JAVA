package DSA;

public class DSA_299_find_middle_element_of_a_stack {
    class DLLNode {
        DLLNode prev;
        DLLNode next;
        int data;
        DLLNode(int d){
            data=d;
        }
    }

    class myStack{
        DLLNode head;
        DLLNode mid;
        int count;
    }

    myStack createMyStack(){
        myStack ms=new myStack();
        ms.count=0;
        return ms;
    }

    void push(myStack ms, int new_data){
        DLLNode newNode=new DLLNode(new_data);
        newNode.prev=null;
        newNode.next=ms.head;
        ms.count+=1;

        if(ms.count == 1){
            ms.mid=newNode;
        }
        else{
            ms.head.prev=newNode;
            if(ms.count %2 != 0){
                ms.mid=ms.mid.prev;
            }
        }
        ms.head=newNode;
    }

    int pop(myStack ms){
        if(ms.count == 0){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            DLLNode head=ms.head;
            int item=head.data;
            ms.head=head.next;

            if(ms.head!= null){
                ms.head.prev=null;
            }

            ms.count-=1;

            if(ms.count %2 == 0){
                ms.mid=ms.mid.next;
            }

            return item;
        }
    }

    int findMiddle(myStack ms){
        if(ms.count == 0){
            System.out.println("Stack underflow");
            return -1;
        }
        return ms.mid.data;
    }

    public static void main(String[] args) {
        DSA_299_find_middle_element_of_a_stack ob = new DSA_299_find_middle_element_of_a_stack();
        myStack ms = ob.createMyStack();
        ob.push(ms, 11);
        ob.push(ms, 22);
        ob.push(ms, 33);
        ob.push(ms, 44);
        ob.push(ms, 55);
        ob.push(ms, 66);
        ob.push(ms, 77);

        System.out.println("Item popped is " + ob.pop(ms));
        System.out.println("Item popped is " + ob.pop(ms));
        System.out.println("Middle Element is "
                + ob.findMiddle(ms));
    }
}
