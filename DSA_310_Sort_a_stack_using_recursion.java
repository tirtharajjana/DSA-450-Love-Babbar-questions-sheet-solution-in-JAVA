package DSA;

import java.util.ListIterator;
import java.util.Stack;

public class DSA_310_Sort_a_stack_using_recursion {
    static void sortedInsert(Stack<Integer> s, int x){
        if(s.isEmpty() || x >s.peek()){
            s.push(x);
        }
        else {
            int pop =s.pop();
            sortedInsert(s,x);
            s.push(pop);
        }
    }

    static void sortStack(Stack<Integer> s){
        if(!s.isEmpty()){
            int pop=s.pop();
            sortStack(s);
            sortedInsert(s,pop);
        }
    }

    static void printStack(Stack<Integer> s)
    {
        ListIterator<Integer> lt = s.listIterator();

        while (lt.hasNext())
            lt.next();

        while (lt.hasPrevious())
            System.out.print(lt.previous() + " ");
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        System.out.println(
                "Stack elements before sorting: ");
        printStack(s);

        sortStack(s);

        System.out.println(
                " \n\nStack elements after sorting:");
        printStack(s);
    }

}
