package DSA;

public class DSA_35_Median_of_two_sorted_arrays_of_same_size {
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
    static int getMedian(int a[],int b[],int n){
        merge(a,b,n,n);
        return (a[n-1]+b[0])/2;
    }
    public static void main(String[] args) {
        int ar1[] = { 1, 12, 15, 26, 38 };
        int ar2[] = { 2, 13, 17, 30, 45 };

        int n1 = 5;
        int n2 = 5;

            System.out.println("Median is "+ getMedian(ar1, ar2, n1));

    }
}
