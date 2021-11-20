package DSA;



public class DSA_7_Cyclically_rotate_an_array_by_one {
    static  void printArray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void rotateArray(int a[],int n){
        int last=a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=last;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        rotateArray(a,6);
        printArray(a,6);

    }
}
