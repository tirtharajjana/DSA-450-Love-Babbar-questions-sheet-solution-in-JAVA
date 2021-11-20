package DSA;

public class DSA_56_Reverse_String {
    public static void main(String[] args) {
        char s[]= {'h','e','l','l','o'};
        int l=0;
        int r=s.length-1;

        while(l<r){
            char t=s[l];
            s[l]=s[r];
            s[r]=t;
            l++;
            r--;
        }

        for (int i = 0; i < s.length; i++) {
            System.out.printf(s[i]+" ");
        }
    }
}
