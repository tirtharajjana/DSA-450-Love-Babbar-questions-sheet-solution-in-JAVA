//package DSA;
//
//import java.util.HashSet;
//
//public class DSA_133_Subset_Sums {
//    static HashSet<Integer> solve(int a[],int st,int end){
//        int s=0,n=end-st+1;
//        HashSet<Integer>v=new HashSet<>();
//        for (int i = 0; i < (1<<n); i++) {
//            s=0;
//            int j=st,x=i;
//            while (x>0){
//                int l=x&1;
//                if( l == 1){
//                    s+=a[j];
//                }
//                j++;
//                x=x>>1;
//            }
//            v.add(s);
//        }
//        return v;
//    }
//
//    public static void main(String[] args) {
//        int n=3,a=-1,b=2;
//        int arr[]={1,-2,3};
//        HashSet<Integer>v1=new HashSet<>();
//        HashSet<Integer>v2=new HashSet<>();
//        v1=solve(arr,0,(n/2)-1);
//        v1=solve(arr,0,(n/2)-1);
//    }
//}


//                         uncomplete