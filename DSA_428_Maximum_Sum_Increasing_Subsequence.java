package DSA;

public class DSA_428_Maximum_Sum_Increasing_Subsequence {
    static int maxSumIS(int arr[], int n) {
        int max = 0;
        int msis[] = new int[n];

        for (int i = 0; i < n; i++) {
            msis[i]=arr[i];
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i]> arr[j] && msis[i]<msis[j]+arr[i])
                    msis[i] = msis[j] + arr[i];
            }
        }
        for (int i = 0; i < n; i++)
            if (max < msis[i])
                max = msis[i];

        return max;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 101, 2, 3, 100, 4, 5};
        int n = arr.length;
        System.out.println("Sum of maximum sum "+
                "increasing subsequence is "+
                maxSumIS(arr, n));
    }
}
