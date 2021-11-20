package DSA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DSA_322_Queue_Reversal_using_recursion {
    static Queue<Integer> queue;
    static void Print()
    {
        while (!queue.isEmpty()) {
            System.out.print( queue.peek() + ", ");
            queue.remove();
        }
    }

    static void reversequeue(){
        Stack<Integer> s=new Stack<>();
        while (!queue.isEmpty()){
            s.push(queue.peek());
            queue.remove();
        }
        while (!s.empty()){
            queue.add(s.pop());
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

        reversequeue();
        Print();
    }
}
