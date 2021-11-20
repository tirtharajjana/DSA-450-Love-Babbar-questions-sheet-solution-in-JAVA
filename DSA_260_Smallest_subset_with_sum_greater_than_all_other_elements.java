package DSA;
import java.io.*;
import java.util.*;
public class DSA_260_Smallest_subset_with_sum_greater_than_all_other_elements {
    static int minElements(int arr[], int n){
        int halfSum = 0;
        for (int i = 0; i < n; i++)
            halfSum = halfSum + arr[i];
        halfSum = halfSum / 2;


        // Sort the array in ascending order and
        // start traversing array from the ascending
        // sort in descending order.
        Arrays.sort(arr);

        int res = 0, curr_sum = 0;
        for (int i = n-1; i >= 0; i--) {

            curr_sum += arr[i];
            res++;

            // Current sum greater than sum
            if (curr_sum > halfSum)
                return res;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {3, 1, 7, 1};
        int n = arr.length;
        System.out.println(minElements(arr, n));
    }
}
