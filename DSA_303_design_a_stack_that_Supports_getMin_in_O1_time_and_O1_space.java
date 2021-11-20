package DSA;

import java.util.Stack;

public class DSA_303_design_a_stack_that_Supports_getMin_in_O1_time_and_O1_space {
    public void push(int a, Stack<Integer> s){
        s.push(a);
    }
    public int pop(Stack<Integer> s){
        int a=-1;
        DSA_303_design_a_stack_that_Supports_getMin_in_O1_time_and_O1_space g=new  DSA_303_design_a_stack_that_Supports_getMin_in_O1_time_and_O1_space();
        if(!g.isFull(s,100)) {
             a = s.pop();
            return a;
        }
        return a;
    }
    public int min(Stack<Integer> s){
        DSA_303_design_a_stack_that_Supports_getMin_in_O1_time_and_O1_space g=new  DSA_303_design_a_stack_that_Supports_getMin_in_O1_time_and_O1_space();
        int m=g.pop(s);
        while (!g.isEmpty(s)){
            int n=g.pop(s);
            if(n<m)
                m=n;
        }
        return m;
    }
    public boolean isFull(Stack<Integer>s, int n){
        if(s.size()==n)
            return true;
        return false;
    }
    public boolean isEmpty(Stack<Integer>s){
        if(s.size()==0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        DSA_303_design_a_stack_that_Supports_getMin_in_O1_time_and_O1_space g = new DSA_303_design_a_stack_that_Supports_getMin_in_O1_time_and_O1_space();

        Stack<Integer> s=new Stack<>();


        g.push(1,s);
        g.push(2,s);
        g.push(3,s);
        g.push(4,s);
        g.push(5,s);
        System.out.println(g.min(s));
        g.pop(s);
        System.out.println(g.min(s));

        g.pop(s);
        System.out.println(g.min(s));

    }

}////////////////////////////////////////////////////////not working/////////////////////////////////////////////////////////
