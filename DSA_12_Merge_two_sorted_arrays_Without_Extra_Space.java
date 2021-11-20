package DSA;

public class DSA_12_Merge_two_sorted_arrays_Without_Extra_Space {
    static  void printArray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void merge(int a[],int b[],int m,int n){
        for(int i=n-1;i>=0;i--){
            int j,last=a[m-1];

            for(j=m-2;j>=0 && a[j]>b[i];j--)
                a[j+1]=a[j];
            if(j!= m-2 && last>b[i]){
                a[j+1]=b[i];
                b[i]=last;
            }
        }
    }
    public static void main(String[] args) {
       int ar1[] = {1, 5, 9, 10, 15, 20};
       int ar2[] = {2, 3, 8, 13};
       merge(ar1,ar2,6,4);
       printArray(ar1,6);
       printArray(ar2,4);
    }
}
