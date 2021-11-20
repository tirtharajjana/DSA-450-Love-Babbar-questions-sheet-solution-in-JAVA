package DSA;

import java.util.Arrays;

public class DSA_440_Minimum_removals_from_array_to_make_max__min__K {
    static int removals(int arr[], int n, int k)
    {
        // sort the array
        Arrays.sort(arr);

        // fill all stated with -1
        // when only one element
        int dp[] = new int[n];
        Arrays.fill(dp, -1);

        // as dp[0] = 0 (base case) so min
        // no of elements to be removed are
        // n-1 elements
        int ans = n - 1;
        dp[0] = 0;

        // Iterate from 1 to n - 1
        for (int i = 1; i < n; i++) {
            dp[i] = i;
            int j = dp[i - 1];
            while (j != i && arr[i] - arr[j] > k) {
                j++;
            }
            dp[i] = Integer.min(dp[i], j);
            ans = Integer.min(ans, (n - (i - j + 1)));
        }
        return ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        int a[] = { 1, 3, 4, 9, 10, 11, 12, 17, 20 };
        int n = a.length;
        int k = 4;
        System.out.print(removals(a, n, k));
    }
}
