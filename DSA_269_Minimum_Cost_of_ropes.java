package DSA;
import java.util.*;
public class DSA_269_Minimum_Cost_of_ropes {
    static int minCost(int arr[], int n){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int sum=0;
        while (pq.size() > 1){
            int f=pq.poll();
            int s=pq.poll();
            sum+=(f+s);
            pq.add(f+s);
        }
        return sum;
    }
    public static void main(String args[])
    {
        int len[] = { 4, 3, 2, 6 };
        int size = len.length;
        System.out.println("Total cost for connecting"
                + " ropes is " + minCost(len, size));
    }
}
