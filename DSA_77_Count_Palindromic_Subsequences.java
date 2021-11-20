package DSA;

public class DSA_77_Count_Palindromic_Subsequences {
//    static String str="abcb";
    static String str="tirtharaj";
    static int n=str.length();
    static int[][] dp =new int[n][n];

    static int countPS(int i, int j){
        if(i>j)
            return 0;
        if(dp[i][j]!= -1)
            return dp[i][j];

        if (i == j){
            return dp[i][j] =1;
        }

        else if(str.charAt(i) == str.charAt(j)){
            return dp[i][j]=countPS(i+1,j)+countPS(i,j-1)+1;
        }
        else {
            return dp[i][j]=countPS(i+1,j)+countPS(i,j-1)-countPS(i+1,j-1);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                dp[i][j] = -1;

        n = str.length();
        System.out.println("Total palindromic subsequence"
                + "are : " + countPS(0, n - 1));
    }
}


