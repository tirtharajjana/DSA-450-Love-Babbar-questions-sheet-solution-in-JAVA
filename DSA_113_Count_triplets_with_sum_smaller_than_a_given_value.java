package DSA;

import java.util.Arrays;

public class DSA_113_Count_triplets_with_sum_smaller_than_a_given_value {
    static int arr[] = new int[]{5, 1, 3, 4, 7};

    static int countTriplets(int n, int sum){
        Arrays.sort(arr);
        int ans=0;

        for (int i = 0; i < n-2; i++) {
            int j=i+1,k=n-1;
            while (j<k){
                if(arr[i]+arr[j]+arr[k] >= sum){
                    k--;
                }
                else {
                    ans+=(k-j);
                    j++;
                }

            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int sum = 12;
        System.out.println(countTriplets(arr.length, sum));
    }
}
