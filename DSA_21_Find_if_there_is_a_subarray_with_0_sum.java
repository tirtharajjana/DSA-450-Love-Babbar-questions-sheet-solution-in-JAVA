package DSA;

import java.util.HashSet;
import java.util.Set;

public class DSA_21_Find_if_there_is_a_subarray_with_0_sum {
    static boolean findsum(int a[],int n){
        Set<Integer> hs = new HashSet<Integer>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum == 0 || a[i] == 0 || hs.contains(sum))
                return true;
            hs.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={4, 2, -3, 1, 6};
        System.out.println(findsum(a,5));
    }
}
