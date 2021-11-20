package DSA;

public class DSA_34_Check_if_all_elements_of_the_array_are_palindrome_or_not {
    static boolean isPalin(int n){
        int s=n;
        int t=0;
        while(n!=0){
            t=(t*10)+(n%10);
            n/=10;
        }
        if(t == s)
            return true;
        else
            return false;
    }
    static int PalinArray(int a[],int n){
        for (int i = 0; i < n; i++) {
            if(!isPalin(a[i]))
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        int a[]={111, 222, 333, 444, 555};
//        int a[]={121, 131, 20};
        System.out.println(PalinArray(a,a.length));
    }
}
