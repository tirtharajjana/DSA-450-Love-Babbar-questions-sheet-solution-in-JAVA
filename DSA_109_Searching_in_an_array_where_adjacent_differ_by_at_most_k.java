package DSA;

public class DSA_109_Searching_in_an_array_where_adjacent_differ_by_at_most_k {
    static int search(int arr[], int n, int x, int k){
        int i=0;
        while(i<n){
            if(arr[i] == x)
                return i;

            i+=Math.max(1,Math.abs((arr[i] - x)/k));
        }
        System.out.println("number is " +
                "not present!");
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 7, 7, 6 };
        int x = 6;
        int k = 2;
        int n = arr.length;

        System.out.println("Element " + x +
                " is present at index "
                + search(arr, n, x, k));
    }

}