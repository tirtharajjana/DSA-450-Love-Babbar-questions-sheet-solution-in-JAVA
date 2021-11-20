package DSA;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class DSA_323_Reverse_First_K_elements_of_Queue {
    static Queue<Integer> queue;
    static void Print()
    {
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }

    static void reverseQueueFirstKElements(int k){

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.peek());
            queue.remove();
        }
        while (!stack.empty()){
            queue.add(stack.pop());
        }
        for (int i = 0; i < queue.size()-k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
    }

    public static void main(String[] args) {
        queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        int k = 5;
        reverseQueueFirstKElements(k);
        Print();
    }
}
