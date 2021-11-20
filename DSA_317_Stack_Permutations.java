package DSA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DSA_317_Stack_Permutations {
    static boolean checkStackPermutation(int ip[], int op[], int n){
        Queue<Integer> input=new LinkedList<>();
        for(int i=0;i<ip.length;i++){
            input.add(ip[i]);
        }

        Queue<Integer> output=new LinkedList<>();
        for(int i=0;i<op.length;i++){
            output.add(op[i]);
        }

        Stack<Integer> temp= new Stack<>();
        while (!input.isEmpty()){
            int ele=input.poll();

            if(ele == output.peek()){
                output.poll();

                while(!temp.isEmpty()){
                    if(temp.peek() == output.peek()){
                        temp.pop();
                        output.poll();
                    }
                    else
                        break;
                }
            }
            else {
                temp.push(ele);
            }
        }
        return (input.isEmpty() && temp.empty());
    }

    public static void main(String[] args) {
        int input[] = { 1, 2, 3 };

        // Output Queue
        int output[] = { 2, 1, 3 };
        int n = 3;
        if (checkStackPermutation(input, output, n))
            System.out.println("Yes");
        else
            System.out.println("Not Possible");
    }
}
