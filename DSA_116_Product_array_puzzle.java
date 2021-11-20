package DSA;

public class DSA_116_Product_array_puzzle {
    void productArray(int arr[], int n){
        int prod[]=new int[n];
        int total_prod=1;

        for (int i = 0; i < n; i++) {
            total_prod*=arr[i];
        }

        for (int i = 0; i < n; i++) {
            prod[i]=(total_prod/arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.printf( prod[i]+" ");
        }
    }

    public static void main(String[] args) {
        DSA_116_Product_array_puzzle pa = new DSA_116_Product_array_puzzle();
        int arr[] = { 10, 3, 5, 6, 2 };
        int n = arr.length;
        System.out.println("The product array is : ");
        pa.productArray(arr, n);
    }

}
