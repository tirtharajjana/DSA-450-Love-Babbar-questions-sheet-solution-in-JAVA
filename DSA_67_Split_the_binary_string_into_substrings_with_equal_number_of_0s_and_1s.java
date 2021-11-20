package DSA;

public class DSA_67_Split_the_binary_string_into_substrings_with_equal_number_of_0s_and_1s {
    static int maxSubStr(String str, int n){
        int c0=0,c1=0;
        int c=0;

        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == '0'){
                c0++;
            }
            else
                c1++;
            if(c0 == c1)
                c++;
        }
        if (c==0)
            return -1;
        return c;
    }

    public static void main(String[] args) {
        String str = "0100110101";
        int n = str.length();

        System.out.println(maxSubStr(str, n));
    }
}
