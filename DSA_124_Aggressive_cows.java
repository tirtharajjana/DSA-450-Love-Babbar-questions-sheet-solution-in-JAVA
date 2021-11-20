package DSA;

import java.util.Arrays;

public class DSA_124_Aggressive_cows {
    public static void main(String[] args) {
        int n=5,c=3;
        int a[]={1, 2, 8, 4, 9};
        Arrays.sort(a);

        int low=0,high=a[n-1],mid,best=0;

        while (low<=high){
            mid=(low+high+1)/2;
            int cnt=1,left=0;

            for (int i = 1; i < n && cnt<c; i++) {
                if(a[i] - a[left] >= mid){
                    left=i;
                    cnt++;
                }
            }
            if(cnt >= c){
                best=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        System.out.println(best);
    }
}
