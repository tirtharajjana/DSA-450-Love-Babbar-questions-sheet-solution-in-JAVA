package DSA;
import java.io.*;
import java.util.*;
public class DSA_338_Maximum_of_all_subarrays_of_size_k {
    static ArrayList<Integer> findKMaxElement(int[] arr, int k, int n){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> res = new ArrayList<>();
        int i=0;
        for ( ; i < k; i++) {
            queue.add(arr[i]);
        }
        res.add(queue.peek());
        queue.remove(arr[0]);
        for (; i < n; i++) {
            queue.add(arr[i]);
            res.add(queue.peek());
            queue.remove(arr[i-k+1]);
        }
        return res;
    }
    public static void main(String[] args)
    {
        int arr[] = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
        int k = 4, n = arr.length;

        List<Integer> res = findKMaxElement(arr, k, n);
        for (int x : res)
            System.out.print(x + " ");
    }
}
