package DSA;
import java.util.*;
public class DSA_121_Kth_smallest_number_again {
    static class Interval
    {
        int s;
        int e;
        Interval(int a,int b)
        {
            s = a;
            e = b;
        }
    };
    static class Sortby implements Comparator<Interval>
    {
        // Comparison function for sorting
        public int compare(Interval a, Interval b)
        {
            return a.s - b.s;
        }
    }
    static int kthSmallestNum(Vector<Interval> merged, int k){
        int n=merged.size();
        for (int j = 0; j < n; j++) {
            if (k <= Math.abs(merged.get(j).e -
                    merged.get(j).s + 1))
                return (merged.get(j).s + k - 1);

            k = k - Math.abs(merged.get(j).e -
                    merged.get(j).s + 1);
        }
        if (k != 0)
            return -1;
        return 0;
    }


    static Vector<Interval> mergeIntervals(Vector<Interval> merged, Interval arr[], int n){
        Arrays.sort(arr,new Sortby());
        merged.add(arr[0]);
        for (int i = 1; i < n; i++) {
            Interval prev=merged.get(merged.size()-1);
            Interval curr=arr[i];
            if((curr.s >= prev.s &&  curr.s <= prev.e) && (curr.e > prev.e))
                merged.get(merged.size()-1).e= curr.e;
            else
                merged.add(curr);
        }
        return merged;
    }

    public static void main(String[] args) {
        Interval arr[] = {new Interval(2, 6), new Interval(4, 7)};
        int n = arr.length;
        int query[] = {5, 8};
        int q = query.length;

        // Merge all intervals into merged.get())
        Vector<Interval> merged = new Vector<Interval>();
        merged=mergeIntervals(merged, arr, n);

        // Processing all queries on merged
        // intervals
        for (int i = 0; i < q; i++)
            System.out.println( kthSmallestNum(merged, query[i]));
    }
}
