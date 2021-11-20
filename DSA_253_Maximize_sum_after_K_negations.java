package DSA;
import java.util.*;

public class DSA_253_Maximize_sum_after_K_negations {
    static int sol(int arr[], int k){
        Arrays.sort(arr);

        int sum=0,i=0;

        while(k>0){
            if(arr[i]>=0)
                break;
            else
            {
                arr[i]*=(-1);
                k--;
            }
            i++;
        }

        if(k> 0){
            Arrays.sort(arr);
            while(k>0){
                arr[0]*=(-1);
                k--;
            }
        }
        for (int j = 0; j < arr.length; j++)
        {
            sum += arr[j];
        }
        return sum;
    }
    public static void main(String[] args)
    {
//        int arr[] = { -2, 0, 5, -1, 2 };
        int arr[] = { 9, 8, 8, 5 };
        System.out.println(sol(arr, 3));
    }
}
