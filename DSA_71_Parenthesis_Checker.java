package DSA;

import java.util.Stack;

public class DSA_71_Parenthesis_Checker {
    static boolean check(char a,char b){
        if(a == '(' && b == ')'){
            return true;
        }
        else if (a == '{' && b == '}'){
            return true;
        }
        else if (a == '[' && b == ']'){
            return true;
        }
        return false;

    }
    static boolean areBracketsBalanced(String expr){
        Stack<Character> s=new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch=expr.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[' ){
                s.push(ch);
            }else {
                char poped=s.peek();
                if(check(poped,ch) == true)
                    s.pop();
                else
                    return false;
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "([{}])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
