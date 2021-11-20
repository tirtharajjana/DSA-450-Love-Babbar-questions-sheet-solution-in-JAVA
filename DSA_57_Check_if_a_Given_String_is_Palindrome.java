package DSA;

public class DSA_57_Check_if_a_Given_String_is_Palindrome {
    static int isPlaindrome(String s){

        int l=s.length();
        for (int i = 0; i < l/2; i++) {
            if(s.charAt(i) != s.charAt(l-1-i))
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        String s="abbccbba";
        System.out.println(isPlaindrome(s));
    }
}
