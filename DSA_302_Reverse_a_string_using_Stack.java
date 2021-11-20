package DSA;

import java.util.Stack;

public class DSA_302_Reverse_a_string_using_Stack {
    static String reverse(String S){
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            s.push(S.charAt(i));
        }
        String r="";
        while (!s.isEmpty()){
            r=r+s.pop();
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(reverse("Tirtharaj"));
    }
}
