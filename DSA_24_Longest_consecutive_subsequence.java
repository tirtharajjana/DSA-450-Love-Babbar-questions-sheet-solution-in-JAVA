package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class DSA_24_Longest_consecutive_subsequence {
    static int findLongestConseqSubseq(int a[],int n){
        Arrays.sort(a);
        ArrayList<Integer> arr=new ArrayList<>();

        int count=0, ans=0;
        arr.add(10);
        for(int i=1;i<n;i++){
            if(a[i] != a[i-1]){
                arr.add(a[i]);
            }
        }

        for(int i=0;i<arr.size();i++){
            if(i>0 && arr.get(i) == arr.get(i-1) + 1){
                count++;
            }
            else
                count=1;

            ans=Math.max(ans,count);
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={1, 9, 3, 10, 4, 20, 2};
        System.out.println(findLongestConseqSubseq(a,7));;
    }
}
