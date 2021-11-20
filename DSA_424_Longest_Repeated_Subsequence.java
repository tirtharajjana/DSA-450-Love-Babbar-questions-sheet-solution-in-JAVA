package DSA;

import java.util.Arrays;

public class DSA_424_Longest_Repeated_Subsequence {
    static int dp[][] = new int[1000][1000];

    static int findLongestRepeatingSubSeq(char X[], int m, int n){
        if(dp[m][n] == -1){
            return dp[m][n];
        }
        if(m == 0|| n == 0){
            return dp[m][n]=0;
        }
        if(X[m-1] == X[n-1] && m!= n){
            return dp[m][n] = findLongestRepeatingSubSeq(X, m - 1, n - 1) + 1;
        }
        return dp[m][n] = Math.max(findLongestRepeatingSubSeq(X, m, n - 1), findLongestRepeatingSubSeq(X, m - 1, n));
    }

    public static void main(String[] args) {
        String str = "aabb";
        int m = str.length();
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println("The length of the largest subsequence that"
                + " repeats itself is : "
                + findLongestRepeatingSubSeq(str.toCharArray(), m, m));

    }
}
