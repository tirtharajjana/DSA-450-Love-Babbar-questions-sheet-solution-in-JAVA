package DSA;

public class DSA_47_Row_with_max_1s {
    static int rowWithMax1s(int mat[][],int n,int m){
        int l=0,r=m-1;
        int max=-1;

        while (l<n && r>=0){
            if(mat[l][r] == 1){
                max=l;
                r--;
            }
            else
                l++;
        }
        return max;
    }

    public static void main(String[] args) {
        int mat[][] = { { 0, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 0, 0, 0, 0 } };
        System.out.println("Index of row with maximum 1s is "+ rowWithMax1s(mat,4,4));
    }
}
