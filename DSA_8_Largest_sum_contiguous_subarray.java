package DSA;

public class DSA_8_Largest_sum_contiguous_subarray {
    static int maxSubarraySum(int a[],int n){
        int max_so_far = Integer.MIN_VALUE;
        int  max_ending_here=0;
        for(int i=0;i<n;i++){
            max_ending_here+=a[i];
            if(max_ending_here>max_so_far){
                max_so_far=max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here=0;
            }
        }
        return max_so_far;


    }
    public static void main(String[] args) {
//        int a[]={1,-2,3,4,-10,15};
//        int a[]={-2, -3, 4, -1, -2, 1, 5, -3};
        int a[]={-11,-2,-3,-2,-5};
        System.out.println(maxSubarraySum(a,5));
    }
}
