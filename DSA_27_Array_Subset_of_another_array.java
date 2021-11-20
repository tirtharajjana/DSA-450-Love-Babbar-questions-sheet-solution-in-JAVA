package DSA;

import java.util.HashSet;

public class DSA_27_Array_Subset_of_another_array {
    static Boolean isSubset(int a[],int b[],int m,int n){
        HashSet<Integer> h=new HashSet<>();
        for (int i = 0; i < m; i++) {
            h.add(a[i]);
        }
        for (int i = 0; i < n; i++) {
            if(!h.contains(b[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int a1[] = {11, 1, 13, 21, 3, 7};
        int a2[] = {11, 3, 7, 1};
        System.out.println(isSubset(a1,a2,6,4));
    }
}
