package DSA;

public class DSA_430_Longest_subsequence_such_that_difference_between_adjacents_is_one {
    static int longestSubseqWithDiffOne(int arr[], int n){
        int dp[] = new int[n];
        for (int i = 0; i < n; i++)
            dp[i] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if((arr[i] == arr[j]+1) || (arr[i] == arr[j]-1)){
                    dp[i]= Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int result = 1;
        for (int i = 0; i < n; i++)
            if (result < dp[i])
                result = dp[i];
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 2 };
        int n = arr.length;
        System.out.println(longestSubseqWithDiffOne(
                arr, n));
    }
}
