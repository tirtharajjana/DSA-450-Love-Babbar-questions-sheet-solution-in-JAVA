package DSA;

import java.util.Stack;

public class DSA_308_Inserting_at_the_end_of_stack {
    static Stack<Character>s =new Stack<>();
    static void insert_at_bottom(char x){
        if(s.isEmpty()){
            s.push(x);

        }
        else{
            char c=s.pop();
            insert_at_bottom(x);
            s.push(c);
        }
    }

     static void printStack(){
        while (!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
    public static void main(String[] args) {
        s.push('a');
        s.push('r');
        s.push('a');
        s.push('h');
        s.push('t');
        s.push('r');
        s.push('i');
        s.push('T');


        insert_at_bottom('j');
        printStack();
    }
}
