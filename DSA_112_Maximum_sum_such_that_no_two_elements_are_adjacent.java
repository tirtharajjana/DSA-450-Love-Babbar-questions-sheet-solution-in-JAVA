package DSA;

public class DSA_112_Maximum_sum_such_that_no_two_elements_are_adjacent {
    int FindMaxSum(int arr[], int n){
        int incl=arr[0],excl=0;

        for (int i = 1; i < n; i++) {
            int excl_curr=Math.max(incl,excl);
            incl=excl+arr[i];
            excl=excl_curr;
        }

        return Math.max(incl,excl);
    }

    public static void main(String[] args) {
        DSA_112_Maximum_sum_such_that_no_two_elements_are_adjacent sum = new DSA_112_Maximum_sum_such_that_no_two_elements_are_adjacent();
        int arr[] = new int[]{5, 5, 10, 100, 10, 5};
        System.out.println(sum.FindMaxSum(arr, arr.length));
    }
}
