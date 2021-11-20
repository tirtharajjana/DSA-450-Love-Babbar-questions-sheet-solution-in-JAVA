package DSA;

public class DSA_18_Count_pairs_with_given_sum {
    static int getPairsCount(int a[],int k){
        int c=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i]+a[j]) == k){
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int a[]={1, 5, 7, 1};
        System.out.println(getPairsCount(a,6));
    }
}
