package DSA;

import java.util.HashMap;
import java.util.Map;

public class DSA_25_Given_an_array_of_size_n_and_a_number_k_find_all_elements_that_appear_more_than_n__k_times {
    static void morethanNdK(int a[],int n,int k){
        int x=n/k;
        HashMap<Integer,Integer> hashMap=new HashMap<>();

        for(int i=0;i<n;i++){
            if(!hashMap.containsKey(a[i])){
                hashMap.put(a[i],1);
            }
            else{
                int c=hashMap.get(a[i]);
                hashMap.put(a[i],c+1);
            }
        }

        for(Map.Entry<Integer,Integer> m:hashMap.entrySet()){
            Integer t=(Integer)m.getValue();
            if(t>x){
                System.out.println(m.getKey());
            }
        }
    }
    public static void main(String[] args) {
        int a[] = new int[] { 1, 1, 2, 2, 3, 5, 4,
                2, 2, 3, 1, 1, 1 };
        int n = 12;
        int k = 4;
        morethanNdK(a, n, k);
    }
}
