package DSA;
import java.util.Arrays;
public class DSA_437_Maximum_difference_of_zeros_and_ones_in_binary_string {
    static final int MAX=100;
    static boolean allones(String s, int n)
    {
        int co = 0;
        for (int i = 0; i < s.length(); i++)
            if(s.charAt(i) == '1')
                co +=1;

        return (co == n);
    }
    static int findlength(int arr[], String s, int n, int ind, int st, int dp[][]){
        if(ind>= n)
            return 0;
        if(st == 0){
            return dp[ind][st] = Math.max(arr[ind] + findlength(arr, s, n, ind + 1, 1, dp), findlength(arr, s, n, ind + 1, 0, dp));
        }
        else{
            return dp[ind][st] = Math.max(arr[ind] + findlength(arr, s, n, ind + 1, 1, dp), 0);
        }
    }

    static int maxLen(String s, int n)
    {

        if (allones(s, n))
            return -1;
        int arr[] = new int[MAX];
        for (int i = 0; i < n; i++)
            arr[i] = (s.charAt(i) == '0' ? 1 : -1);

        int dp[][] = new int[MAX][3];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return findlength(arr, s, n, 0, 0, dp);
    }

    public static void main(String[] args) {
        String s = "11000010001";
        int n = 11;
        System.out.println(maxLen(s, n));
    }
}
