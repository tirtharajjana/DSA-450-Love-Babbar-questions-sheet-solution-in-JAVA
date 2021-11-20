package DSA;

public class DSA_51_Rotate_a_matrix_by_90_degree_in_clockwise_direction_without_using_any_extra_space {
    static void rotate(int[][] a){
        int n=a.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                int t=a[i][j];
                a[i][j]=a[i][n-1-j];
                a[i][n-1-j]=t;
            }
        }
    }

    static void printMatrix(int arr[][])
    {
        int n=arr.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print( arr[i][j] + " ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        printMatrix(arr);
        System.out.println();
        rotate(arr);
        printMatrix(arr);
    }
}
