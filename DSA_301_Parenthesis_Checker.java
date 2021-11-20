package DSA;

import java.util.Stack;

public class DSA_301_Parenthesis_Checker {
    static boolean cmp(char b, char c)
    {
        if(b=='{' && c=='}')
            return true;
        else if(b=='[' && c==']')
            return true;
        else if(b=='(' && c==')')
            return true;
        return false;
    }

    static boolean areBracketsBalanced(String expr){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<expr.length();i++){
            if(expr.charAt(i) == '['||expr.charAt(i) == '{' || expr.charAt(i) == '(' ){
                stack.push(expr.charAt(i));
            }
            else if(expr.charAt(i) == ']'||expr.charAt(i) == '}' || expr.charAt(i) == ')'){
                if(stack.empty() || !cmp(stack.peek(),expr.charAt(i))){
                    return false;
                }
                else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty() == true){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String expr = "([}])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
