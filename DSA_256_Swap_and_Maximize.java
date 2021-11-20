package DSA;
import java.io.*;
import java.util.Arrays;
public class DSA_256_Swap_and_Maximize {
    static int maxSum(int arr[], int n){
        int sum=0;
        Arrays.sort(arr);
        int i=0,j=n-1;

        while (i<j){
            sum+=Math.abs(arr[i]-arr[j]);
            sum+=Math.abs(arr[i+1]-arr[j]);
            i++;
            j--;
        }
//        if(n%2 != 0)
            sum+=Math.abs(arr[0]-arr[i]);
        return sum;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 8 };
        int n = arr.length;
        System.out.println(maxSum(arr, n));
    }
}
