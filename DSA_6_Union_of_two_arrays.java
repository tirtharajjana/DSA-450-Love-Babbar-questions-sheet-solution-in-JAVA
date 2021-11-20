package DSA;

public class DSA_6_Union_of_two_arrays {
    static  void printArray(int a[],int n){
        for(int i=0;i<n;i++){
            if(a[i]!=0)
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
         int a[]={1,2,3,6,5};
         int b[]={3,5,4};
        int l=0;
        int c[] = new int[8];
         for(int i=0;i<a.length;i++){
             int flag=0;
            for(int j=0;j<c.length;j++)
                if (a[i] == c[j]) {
                    flag = 1;
                    break;
                }
            if(flag != 1){
                c[l]=a[i];
                l++;
            }
         }
        printArray(c,8);
    }
}
