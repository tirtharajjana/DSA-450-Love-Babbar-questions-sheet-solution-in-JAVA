package DSA;

import java.util.Arrays;

public class DSA_111_Find_four_elements_that_sum_to_a_given_value {
    void find4Numbers(int A[], int n, int X){
        Arrays.sort(A);
        int l,r;

        for (int i = 0; i < n-3; i++) {
            for (int j = 0; j < n-2; j++) {
                l=j+1;
                r=n-1;

                while (l<r){
                    if(A[i]+A[j]+A[l]+A[r] == X){
                        System.out.println(A[i]+" "+A[j]+" "+A[l]+" "+A[r]);
                        l++;
                        r--;
                    }
                    else if(A[i]+A[j]+A[l]+A[r] > X){
                        r--;
                    }
                    else
                        l++;
                }
            }
        }
    }

    public static void main(String[] args) {
        DSA_111_Find_four_elements_that_sum_to_a_given_value findfour = new DSA_111_Find_four_elements_that_sum_to_a_given_value();
        int A[] = {1, 4, 45, 6, 10, 12};
        int n = A.length;
        int X = 21;
        findfour.find4Numbers(A, n, X);
    }
}
