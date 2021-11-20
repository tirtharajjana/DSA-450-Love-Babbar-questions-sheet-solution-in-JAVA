package DSA;
import java.util.*;

public class DSA_246_Buy_Maximum_Stocks_if_i_stocks_can_be_bought_on_i_th_day {
    static class Pair {
        int first, second;
        Pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }

    // For Sorting using Pair.first value
    static class SortPair implements Comparator<Pair> {
        public int compare(Pair a, Pair b)
        {
            return a.first - b.first;
        }
    }
    static int buyMaximumProducts(int[] price, int K, int n)
    {
        Pair[] arr = new Pair[n];

        // Making pair of product cost and number of day..
        for (int i = 0; i < n; i++)
            arr[i] = new Pair(price[i], i + 1);

        // Sorting the pair array.
        Arrays.sort(arr, new SortPair());
        // Calculating the maximum number of stock
        // count.
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(arr[i].second,
                    K / arr[i].first);
            K -= arr[i].first
                    * Math.min(arr[i].second,
                    K / arr[i].first);
        }
        return ans;
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] price = { 10, 7, 19 };
        int K = 45;

        // int []price = { 7, 10, 4 };
        // int K = 100;
        System.out.println(
                buyMaximumProducts(price, K, price.length));
    }
}
