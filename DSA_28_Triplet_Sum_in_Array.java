package DSA;

import java.util.Arrays;

public class DSA_28_Triplet_Sum_in_Array {
    static boolean find3Numbers(int a[], int n, int X){
        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            int s=i+1;
            int e=n-1;

            while (s < e){
                int sum =a[i]+a[s]+a[e];
                if(sum == X )
                    return true;
                else if(sum < X)
                    s++;
                else
                    e--;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={1, 4, 45, 6, 10, 8};
        System.out.println(find3Numbers(a,6,13));
    }
}
