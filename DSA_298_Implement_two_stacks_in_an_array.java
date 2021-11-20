package DSA;

public class DSA_298_Implement_two_stacks_in_an_array {
    int size;
    int top1,top2;
    int arr[];

    DSA_298_Implement_two_stacks_in_an_array(int n){
        arr=new int[n];
        size=n;
        top1=-1;
        top2=size;
    }

    void push1(int n){
        if(top1<top2-1){
            top1++;
            arr[top1]=n;
        }
        else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    void push2(int n){
        if(top1 < top2-1){
            top2--;
            arr[top2]=n;
        }else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    int pop1(){
        if(top1 > -1){
            int d=arr[top1];
            top1--;
            return d;
        }
        else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }

    int pop2(){
        if(top2 < size){
            int d=arr[top2];
            top2++;
            return d;
        }else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }


    public static void main(String[] args) {
        DSA_298_Implement_two_stacks_in_an_array ts = new DSA_298_Implement_two_stacks_in_an_array(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from"
                + " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from"
                + " stack2 is " + ts.pop2());
    }
}
