package DSA;

import java.util.Stack;

public class DSA_314_Expression_contains_redundant_bracket_or_not {
    static boolean checkRedundancy(String s) {
        Stack<Character> st= new Stack<>();
        char[] str=s.toCharArray();
        for (char ch:str) {
            if(ch == ')'){
                char top=st.pop();

                boolean f=true;
                while (top != '(')
                {
                    if(top == '+' ||top == '-'||top == '*' ||top == '/'  )
                        f=false;
                    top=st.pop();
                }
                if(f == true){
                    return true;
                }
            }
            else {
                st.push(ch);
            }
        }
        return false;
    }
    static void findRedundant(String str) {
        boolean ans = checkRedundancy(str);
        if (ans == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        String str = "((a+b))";
        findRedundant(str);

        str = "(a+(b)/c)";
        findRedundant(str);

        str = "(a+b*(c-d))";
        findRedundant(str);
    }
}
