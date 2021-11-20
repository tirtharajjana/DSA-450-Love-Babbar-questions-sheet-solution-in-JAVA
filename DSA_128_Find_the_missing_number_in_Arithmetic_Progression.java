package DSA;

public class DSA_128_Find_the_missing_number_in_Arithmetic_Progression {
    static int findMissingUtil(int arr[], int low, int high, int diff){
        int mid;
        while (low<=high){
            mid=(low+high)/2;
            if((arr[mid] - arr[0])/diff == mid){
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return arr[high] + diff;
    }

    static int findMissing(int arr[], int n){
        int diff=(arr[n-1] - arr[0])/n;

        return findMissingUtil(arr, 0, n - 1, diff);
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 8, 10, 12, 14};
        int n = arr.length;
        System.out.println("The missing element is "+
                findMissing(arr, n));
    }
}
