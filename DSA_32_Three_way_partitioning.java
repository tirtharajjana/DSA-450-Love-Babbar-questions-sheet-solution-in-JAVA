package DSA;

public class DSA_32_Three_way_partitioning {
    static void threeWayPartition(int a[],int n,int l,int h){
        int start =0, end=n-1;
        for (int i = 0; i <= end;) {
            if(a[i] < l){
                int t=a[i];
                a[i]=a[start];
                a[start]=t;
                start++;
                i++;
            }
            else if(a[i]>h){
                int t=a[i];
                a[i]=a[end];
                a[end]=t;
                end--;
            }
            else{
                i++;
            }

        }
    }
    static  void printArray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        threeWayPartition(a,a.length,14,20);
        printArray(a,a.length);
    }
}
