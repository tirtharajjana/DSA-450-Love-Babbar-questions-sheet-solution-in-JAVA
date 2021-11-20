package DSA;

public class DSA_101_Find_first_and_last_positions_of_an_element_in_a_sorted_array {
    static int first(int arr[], int x, int n){
        int low=0,high=n-1,res=-1;

        while (low<=high){
            int mid=(low+high)/2;
            if(x<arr[mid]){
                high=mid-1;
            }
            else if(x>arr[mid]){
                low=mid+1;
            }
            else {
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }

    static int last(int arr[], int x, int n){
        int low=0,high=n-1,res=-1;

        while (low<=high){
            int mid=(low+high)/2;
            if(x<arr[mid]){
                high=mid-1;
            }
            else if(x>arr[mid]){
                low=mid+1;
            }
            else {
                res=mid;
                low=mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2,
                3, 4, 7, 8, 8};
        int n = arr.length;
        int x = 8;
        System.out.println("First Occurrence = " +
                first(arr, x, n));
        System.out.println("Last Occurrence = " +
                last(arr, x, n));
    }
}
