package DSA;

import java.util.Arrays;
import java.util.HashMap;

public class DSA_118_Minimum_number_of_swaps_required_to_sort_an_array {
    public static int minSwaps(int[] nums){
        int len=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();

        for (int i = 0; i < len; i++) {
            mp.put(nums[i],i );
        }

        Arrays.sort(nums);

        boolean[] visited=new boolean[len];
        Arrays.fill(visited,false);

        int ans=0;

        for (int i = 0; i < len; i++) {
            if(visited[i] || mp.get(nums[i])== i){
                continue;
            }

            int j=i,cycle_size=0;

            while (!visited[j]){
                visited[j]=true;
                j=mp.get(nums[j]);
                cycle_size++;
            }
            if(cycle_size > 0) {
                ans += (cycle_size - 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []a = {1, 5, 4, 3, 2};
        DSA_118_Minimum_number_of_swaps_required_to_sort_an_array g = new DSA_118_Minimum_number_of_swaps_required_to_sort_an_array();
        System.out.println(g.minSwaps(a));
    }
}
