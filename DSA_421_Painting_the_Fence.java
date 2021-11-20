package DSA;

public class DSA_421_Painting_the_Fence {
    static long countWays(int n, int k){
        long total=k;
        int mod=1000000007;
        int same=0,diff=k;
        for (int i = 2; i <= n; i++) {
            same = diff;
            diff = (int)total * (k - 1);
            diff = diff % mod;
            total = (same + diff) % mod;
        }
        return total;
    }

    public static void main(String[] args) {
        int n = 3, k = 2;
        System.out.println(countWays(n, k));
    }
}
