package DSA;

public class DSA_439_Minimum_cost_to_fill_given_weight_in_a_bag {
    public static int minCost(int cost[], int n){
        int dp[] = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++)
        {
            int min_cost = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++)
                if(j < cost.length && cost[j]!=-1) {
                    min_cost = Math.min(min_cost, cost[j] + dp[i - j - 1]);
                }
            dp[i] = min_cost;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int cost[] = {10,-1,-1,-1,-1};
        int W = cost.length;
        System.out.print(minCost(cost, W));
    }

}
