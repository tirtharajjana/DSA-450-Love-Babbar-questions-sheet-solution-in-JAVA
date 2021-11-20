package DSA;
import java.util.Arrays;
public class DSA_257_Minimum_sum_of_absolute_difference_of_pairs_of_two_arrays {
    static long findMinSum(long a[], long b[], long n){
        Arrays.sort(a);
        Arrays.sort(b);
        long sum=0;
        for (int i = 0; i < n; i++) {
            sum+=Math.abs(a[i]-b[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
//        long a[] = {4, 1, 8, 7};
//        long b[] = {2, 3, 6, 5};
        long a[] = {1,2,3};
        long b[] = {3,2,1};
        int n = a.length;
        System.out.println(findMinSum(a, b, n));
    }
}
