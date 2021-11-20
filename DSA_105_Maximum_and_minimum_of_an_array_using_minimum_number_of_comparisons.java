package DSA;

public class DSA_105_Maximum_and_minimum_of_an_array_using_minimum_number_of_comparisons {
    static class Pair {

        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n) {
        Pair minmax=new Pair();
        minmax.min=arr[0];
        minmax.max=arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i] > minmax.max)
                minmax.max=arr[i];
            else if(arr[i] < minmax.min)
                minmax.min=arr[i];
        }

        return minmax;
    }

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, arr_size);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);

    }
}
