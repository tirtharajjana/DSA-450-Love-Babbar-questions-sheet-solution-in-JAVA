package DSA;

import java.util.ArrayList;

public class DSA_102_Find_a_Fixed_Point__Value_equal_to_index__in_a_given_array {
    static ArrayList<Integer>  linearSearch(int arr[], int n){
        ArrayList<Integer> a=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] == i){
                a.add(i);
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {-10, -1, 0, 3, 4, 11, 30, 50, 100};
        int n = arr.length;
        System.out.println("Fixed Point is "
                + linearSearch(arr, n));
    }
}
