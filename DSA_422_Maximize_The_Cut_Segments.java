package DSA;

public class DSA_422_Maximize_The_Cut_Segments {
    static int findMaximum(int l, int p, int q, int r){
        int dp[]=new int[l+1];
        for (int i = 0; i < l+1; i++) {
            dp[i]=-1;
        }
        dp[0]=0;
        for (int i = 0; i <=l ; i++) {
            if(dp[i] == -1)
                continue;
            if(i+p <= l)
                dp[i+p]=Math.max(dp[i + p], dp[i] + 1);
            if (i + q <= l)
                dp[i + q] = Math.max(dp[i + q], dp[i] + 1);
            if (i + r <= l)
                dp[i + r] = Math.max(dp[i + r], dp[i] + 1);
        }
        if (dp[l] == -1) {
            dp[l] = 0;
        }
        // return value corresponding
        // to length l
        return dp[l];
    }

    public static void main(String[] args) {
        int l = 11, p = 2, q = 3, r = 5;

        // Calling Function
        int ans = findMaximum(l, p, q, r);
        System.out.println(ans);
    }
}
