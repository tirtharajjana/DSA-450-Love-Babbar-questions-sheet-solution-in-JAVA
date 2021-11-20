package DSA;
import java.util.*;
public interface DSA_126_EKOSPOJ {
    static boolean solve(int a[],int n,int m,int mid){
        int sum=0;
        for (int i = 0; i < n; i++) {
            if(a[i] > mid)
                sum+=a[i]-mid;
        }
        if(sum >= m){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n=4;
        int m=7;

        int a[]={20, 15, 10, 17};
        int lb=0;
        int ans=0;
        int ub = Arrays.stream(a).max().getAsInt();

        while (lb<=ub){
            int mid=(lb+ub)/2;
            if(solve(a,n,m,mid)){
                ans=mid;
                lb=mid+1;
            }
            else
                ub=mid-1;
        }

        System.out.println(ans);
    }
}
