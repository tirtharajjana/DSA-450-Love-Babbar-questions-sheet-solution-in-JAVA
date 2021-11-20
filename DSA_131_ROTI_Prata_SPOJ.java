package DSA;

public class DSA_131_ROTI_Prata_SPOJ {
    static boolean solve(int[] arr,int len,int par,int mid){
        int time=0,paratha=0;
        for (int i = 0; i < len; i++) {
            time=arr[i];
            int j=2;
            while (time<=mid){
                paratha++;
                time=time+(arr[i]*j);
                j++;
            }
            if(paratha>=par){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int par=10;
        int a[]={1, 2, 3, 4};
        int lb=0,ub=Integer.MAX_VALUE;
        int ans=0;

        while(lb<=ub){
            int mid=(lb+ub)/2;
            if(solve(a,4,par,mid)){
                ans=mid;
                ub=mid-1;
            }
            else {
                lb=mid+1;
            }
        }
        System.out.println(ans);
    }
}
