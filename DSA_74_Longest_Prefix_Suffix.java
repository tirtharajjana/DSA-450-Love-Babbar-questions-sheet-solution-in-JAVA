package DSA;

public class DSA_74_Longest_Prefix_Suffix {
    static int longestPrefixSuffix(String s){
        int n=s.length();
        int lps[] =new int[n];
        lps[0]=0;
        int len=0;
        int i=1;

        while (i<n){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                lps[i]=len;

                i++;
            }
            else {
                if(len!=0){
                    len=lps[len-1];
                }
                else {
                    lps[i]=0;
                    i++;
                }
            }
        }
        int res = lps[n-1];
        return (res > n/2)? n/2 : res;
    }

    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(longestPrefixSuffix(s));
    }
}
