package DSA;

public class DSA_33_Minimum_swaps_required_to_bring_all_elements_less_than_or_equal_to_k_together {
    static int minSwap(int a[],int n,int k){
        int count=0;
        for (int i = 0; i < n; i++) {
            if(a[i]<=k)
                count++;
        }
        int bad=0;
        for (int i = 0; i < count; i++) {
            if(a[i]>k)
                bad++;
        }
        int ans=bad;
        for(int i=0,j=count;j<n;++i,++j){
            if(a[i]>k){
                --bad;
            }
            if(a[j]>k)
                ++bad;
            ans=Math.min(bad,ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 3};
        int n = arr.length;
        int k = 3;
        System.out.print(minSwap(arr, n, k) + "\n");

        int arr1[] = {2, 7, 9, 5, 8, 7, 4};
        n = arr1.length;
        k = 5;
        System.out.print(minSwap(arr1, n, k));
    }
}
