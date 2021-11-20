package DSA;

public class DSA_457_Maximum_profit_by_buying_and_selling_a_share_at_most_twice {
    public static void main(String[] args) {
        int price[] = { 2, 30, 15, 10, 8, 25, 80 };
        int n = 7;
        int profit = 0;

        for (int i = 1; i < n; i++) {
            int sub = price[i] - price[i - 1];
            if (sub > 0)
                profit += sub;
        }

        System.out.print("Maximum Profit=" + profit);
    }
}
