package DSA;

public class DSA_23_Maximum_Product_Subarray {
    static int maxProduct(int a[],int n){
        int res=a[0];
        for(int i=0;i<n;i++){
            int mul=a[i];
            for(int j=i+1;j<n;j++){
                res=Math.max(res,mul);
                mul*=a[j];
            }
            res=Math.max(res,mul);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={6, -3, -10, 0, 2};
        System.out.println(maxProduct(a,5));
    }
}
