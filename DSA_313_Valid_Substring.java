package DSA;

import java.util.Stack;

public class DSA_313_Valid_Substring {
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

    static int findMaxLen(String expr){
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(int i=0;i<expr.length();i++){
            if(expr.charAt(i) == '['||expr.charAt(i) == '{' || expr.charAt(i) == '(' ){
                stack.push(expr.charAt(i));
            }
            else if(expr.charAt(i) == ']'||expr.charAt(i) == '}' || expr.charAt(i) == ')'){
                if(stack.empty() || !cmp(stack.peek(),expr.charAt(i))){
                    return count;
                }
                else {
                    count+=2;
                    stack.pop();
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        String exp="(()(";
        String exp="()(())(";
        System.out.println(findMaxLen(exp));
    }

}
