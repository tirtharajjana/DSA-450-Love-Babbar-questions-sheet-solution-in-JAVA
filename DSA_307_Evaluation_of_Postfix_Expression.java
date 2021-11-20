package DSA;

import java.util.Stack;

public class DSA_307_Evaluation_of_Postfix_Expression {
    static int evaluatePostfix(String exp){
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);

            if(Character.isDigit(c))
                s.push(c-'0');

            else{
                int a=s.pop();
                int b=s.pop();

                switch (c){
                    case '+':
                        s.push(b+a);
                        break;
                        case '-':
                        s.push(b-a);
                        break;
                        case '*':
                        s.push(b*a);
                        break;
                        case '/':
                        s.push(b/a);
                        break;
                }
            }
        }

        return s.pop();
    }

    public static void main(String[] args) {
//        String exp="231*+9-";
        String exp="123+*8-";
        System.out.println("postfix evaluation: "+evaluatePostfix(exp));
    }
}
