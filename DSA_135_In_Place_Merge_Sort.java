package DSA;

import java.util.Arrays;

public class DSA_135_In_Place_Merge_Sort {
    private static int nextGap(int gap)
    {
        if (gap <= 1)
            return 0;
        return (int)Math.ceil(gap / 2.0);
    }

    // Function for swapping
    private static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void inPlaceMerge(int[] nums, int start, int end){
        int gap=end-start+1;
        for(gap=nextGap(gap);gap>0;gap=nextGap(gap)){
            for (int i = start; i+gap <= end; i++) {
                int j=i+gap;
                if(nums[i] > nums[j]){
                    swap(nums,i,j);
                }
            }
        }
    }

    private static void mergeSort(int[] nums, int s, int e){
        if(s == e){
            return;
        }
        int mid=(s+e)/2;
        mergeSort(nums,s,mid);
        mergeSort(nums,mid+1,e);
        inPlaceMerge(nums, s, e);

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 12, 11, 13, 5, 6, 7 };
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
