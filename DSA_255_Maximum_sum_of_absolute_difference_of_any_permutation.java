package DSA;
import java.io.*;
import java.util.*;
public class DSA_255_Maximum_sum_of_absolute_difference_of_any_permutation {
    static int MaxSumDifference(Integer []a, int n){
        List<Integer> finalSequence = new ArrayList<Integer>();

        Arrays.sort(a);

        for (int i = 0; i < n/2; i++) {
            finalSequence.add(a[i]);
            finalSequence.add(a[n-1-i]);
        }

        if(n%2 != 0){
            finalSequence.add(a[n/2]);
        }

        int max=0;

        for (int i = 0; i < n-1; i++) {
            max=max+Math.abs(finalSequence.get(i)-finalSequence.get(i+1));
        }

        max=max+Math.abs(finalSequence.get(0)-finalSequence.get(n-1));

        return max;
    }

    public static void main(String[] args) {
        Integer []a = { 1, 2, 4, 8 };
        int n = a.length;

        System.out.print(MaxSumDifference(a, n));
    }
}
