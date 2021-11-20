package DSA;

import java.util.Stack;

public class DSA_304_Next_Greater_Element {
    static int arr[] = { 11, 13, 21, 3 };
    static void printNGE(){
        Stack<Integer> s=new Stack<>();
        int nge[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            if(!s.isEmpty()){
                while (!s.isEmpty() && s.peek()<=arr[i]){
                    s.pop();
                }
            }

            nge[i]=s.isEmpty()?-1:s.peek();
            s.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(nge[i]+" ");

    }

    public static void main(String[] args) {
        printNGE();
    }
}
