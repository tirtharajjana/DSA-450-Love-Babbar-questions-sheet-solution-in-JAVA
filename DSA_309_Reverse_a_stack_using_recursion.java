package DSA;

import java.util.Stack;

public class DSA_309_Reverse_a_stack_using_recursion {
    static Stack<Character> s=new Stack<>();

    static void insert_at_bottom(char x){
            if(s.isEmpty()){
                s.push(x);
            }
            else{
                char p=s.pop();
                insert_at_bottom(x);
                s.push(p);
            }
    }

    static void reverse(){
        if(s.size() > 0){
            char peek=s.pop();
            reverse();
            insert_at_bottom(peek);
        }
    }

    public static void main(String[] args) {
        s.push('1');
        s.push('2');
        s.push('3');
        s.push('4');

        System.out.println("Original Stack");

        System.out.println(s);

        // function to reverse
        // the stack
        reverse();

        System.out.println("Reversed Stack");

        System.out.println(s);
    }
}
