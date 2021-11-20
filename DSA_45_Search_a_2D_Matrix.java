package DSA;

public class DSA_45_Search_a_2D_Matrix {
    static void findRow(int[][] a, int n, int m, int k){
        int l=0,r=m-1,mid;
        while (l<=r){
            mid=(l+r)/2;
            if(a[mid][0] == k){
                System.out.println("Element found at "+mid+", "+0);
                return;
            }
            if (a[mid][m-1] == k){
                System.out.println("Element found at "+mid+", "+(m-1));
                return;
            }
            if(a[mid][0]<k && a[mid][m-1] > k){
                binarySearch(a, n, m, k, mid);
                return;
            }
            if(a[mid][0]>k){
                r=mid-1;
            }
            if(a[mid][m-1] <k )
                l=mid+1;

        }
    }

    static void binarySearch(int[][] a, int n, int m, int k, int x){
        int l=0,r=m-1,mid;

        while (l<=r){
            mid=(l+r)/2;
            if(a[x][mid] == k){
                System.out.println("Found at (" + x + "," + mid + ")");
                return;
            }
            if(a[x][mid] < k)
                r=mid-1;
            else
                l=mid+1;
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int n = 4; // no. of rows
        int m = 5; // no. of columns

        int a[][] = { { 0, 6, 8, 9, 11 },
                { 20, 22, 28, 29, 31 },
                { 36, 38, 50, 61, 63 },
                { 64, 66, 100, 122, 128 } };

        int k = 31; // element to search

        findRow(a, n, m, k);
    }
}
