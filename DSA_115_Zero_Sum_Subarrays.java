package DSA;

import java.util.HashMap;

public class DSA_115_Zero_Sum_Subarrays {
    static int findSubArrays(int[] arr, int n){
        int sum=0,counter=0;
        HashMap<Integer,Integer> mp=new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum+=arr[i];

            if (sum == 0)
                counter++;
            if(mp.containsKey(sum))
                counter+=mp.get(sum);

            if(mp.containsKey(sum)){
                int k=mp.get(sum);
                k++;
                mp.put(sum,k);
            }
            else {
                mp.put(sum,1);
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,5,5,0,0};
        int n = arr.length;

        int out = findSubArrays(arr, n);

        // if we did not find any subarray with 0 sum,
        // then subarray does not exists
        if (out == 0)
            System.out.println("No subarray exists");
        else
            System.out.println(out);
    }
}
