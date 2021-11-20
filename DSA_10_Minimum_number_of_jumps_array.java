package DSA;

public class DSA_10_Minimum_number_of_jumps_array {

    static int minJumps(int a[],int n){
        int c=0;
        for(int i=0;i<n-1;){
            i+=a[i];//1 4 13
            c++;//1 2 3
        }

        return c;
    }
    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
//        int arr[] = {1, 4, 3, 2, 6, 7};
        System.out.println(minJumps(arr,11));
    }
}
