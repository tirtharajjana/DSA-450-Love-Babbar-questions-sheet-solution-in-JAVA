package DSA;

public class DSA_13_Kadan_Algorithm {
    static int sum(int a[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        return sum;
    }
    static int maxSubarraySum(int a[],int n){
        int arSum=sum(a,n);
        int sum=a[0];
        for(int i=0;i<n;i++){
            int s=a[i];
            for(int j=i+1;j<n;j++){
                s+=a[j];
                if(s>sum){
                    sum=s;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {-1,2,1,-1,1,3,-10};
        System.out.println(maxSubarraySum(arr,7));
    }
}
