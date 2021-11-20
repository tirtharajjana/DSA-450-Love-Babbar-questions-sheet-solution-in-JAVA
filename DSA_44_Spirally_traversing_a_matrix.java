package DSA;

public class DSA_44_Spirally_traversing_a_matrix{
    static void spiralPrint(int m, int n, int a[][]){
        int k=0,l=0;

        while (k<m && l<n){
            for (int i = l; i < n; i++) {
                System.out.printf(a[k][i]+" ");
            }
            k++;

            for (int i = k; i < m; i++) {
                System.out.printf(a[i][n-1]+" ");
            }
            n--;

            if(k<m){
                for (int i = n-1; i >= l; i--) {
                    System.out.printf(a[m-1][i]+" ");
                }
                m--;
            }

            if(l<n){
                for (int i = m-1; i >= k; i--) {
                    System.out.printf(a[i][l]+" ");
                }
                l++;
            }
        }
    }

    public static void main(String[] args) {
        int R = 3;
        int C = 6;
//        int a[][] = { { 1, 2, 3, 4, 5, 6 },
//                { 7, 8, 9, 10, 11, 12 },
//                { 13, 14, 15, 16, 17, 18 } };
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 14,15,16,17,18,7},
                { 13,12,11,10,9,8} };

        // Function Call
        spiralPrint(R, C, a);
    }
}
