package DSA;

import java.util.Arrays;

public class DSA_9_Minimize_the_Heights_in_aaray {

    static int getMinDiff(int a[],int n,int k){
        Arrays.sort(a);
        int ans=a[n-1]-a[0];

        int small=a[0]+k;
        int big=a[n-1]-k;

        if(small>big){
            int temp=small;
            small=big;
            big=temp;
        }

        for(int i=1;i<n;i++){
            int subs=a[i]-k;
            int add=a[i]+k;

            if(subs>=small || add<=big){
                continue;
            }

            if(big-subs<=add-small)
                small=subs;
            else
                big=add;


        }
        return Math.min(ans,big-small);
    }

    public static void main(String[] args) {
        int a[]={1, 5, 8, 10};
        System.out.println(getMinDiff(a,4,2));
    }
}
