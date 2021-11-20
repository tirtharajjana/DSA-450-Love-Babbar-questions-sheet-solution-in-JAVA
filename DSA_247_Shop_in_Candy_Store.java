package DSA;
import java.io.*;
import java.util.Arrays;
import java.lang.Math;

public class DSA_247_Shop_in_Candy_Store {
    static void find(int[] arr, int n, int k)
    {

        // Sort the array
        Arrays.sort(arr);
        int b = (int)Math.ceil(n / k * 1.0);
        int min_sum = 0, max_sum = 0;

        for(int i = 0; i < b; i++)
            min_sum += arr[i];
        for(int i = 2; i < arr.length; i++)
            max_sum += arr[i];

        // Print the minimum cost
        System.out.println("minimum " + min_sum);

        // Print the maximum cost
        System.out.println("maximum " + max_sum);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 4 };
        int n = arr.length;
        int k = 2;

        // Function call
        find(arr, n, k);
    }
}
