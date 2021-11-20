package DSA;

public class DSA_122_Find_pivot_element_in_a_sorted_and_rotated_array {
    static int peakElement(int arr[], int low, int high, int lowerBound, int upperBound){
        int mid=low+(high-low)/2;

        if(mid == lowerBound){
            if(mid == upperBound){
                return mid;
            }
            else if(arr[mid] >= arr[mid+1]){
                return mid;
            }
        }
        else if(mid == upperBound && arr[mid] >= arr[mid - 1]) {
            return mid;
        }
        else {
            if(arr[mid] >= arr[mid-1] && arr[mid] >= arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[high]){
                return peakElement(arr, mid + 1, high, lowerBound, upperBound);
            }
            else if (arr[mid] < arr[high]) {
                return peakElement(arr, low, mid - 1, lowerBound, upperBound);
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int arr[]={8,9,10,11,12,13,14,15,16,1,2,3,4,5,6,7};
        System.out.println(peakElement(arr,0,15,0,15));
    }
}
