package DSA;

import java.util.Arrays;

public class DSA_30_Chocolate_Distribution_Problem {
    static int  findMinDiff(int a[],int n,int m){
        Arrays.sort(a);
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(i+m-1 <n){

                if((a[i+m-1] - a[i])<min){
                    min=(a[i+m-1] - a[i]);
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int a[]={3, 4, 1, 9, 56, 7, 9, 12};
        System.out.println(findMinDiff(a,a.length,5));
    }
}
