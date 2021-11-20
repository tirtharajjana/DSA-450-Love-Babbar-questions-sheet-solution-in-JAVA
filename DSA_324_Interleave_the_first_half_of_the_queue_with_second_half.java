package DSA;

import java.util.Queue;
import java.util.Stack;

public class DSA_324_Interleave_the_first_half_of_the_queue_with_second_half {
    static void interLeaveQueue(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        int half=q.size()/2;

        for (int i = 0; i < half; i++) {
            s.push(q.peek());
            q.poll();
        }
        while (!s.empty()){
            q.add(s.pop());
        }
        for (int i = 0; i < half; i++) {
            q.add(q.peek());
            q.poll();
        }
        for (int i = 0; i < half; i++) {
            s.push(q.peek());
            q.poll();
        }
        while (!s.empty()){
            q.add(s.pop());
            q.add(q.peek());
            q.poll();
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);
        interLeaveQueue(q);
        int length = q.size();
        for (int i = 0; i < length; i++)
        {
            System.out.print(q.peek() + " ");
            q.poll();
        }
    }
}
