package DSA;

public class DSA_4_Sort_an_array_of_0s_1s_and_2s {
    static  void printArray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void Sort(int A[],int n){
        int i;
        int j;
        int isSorted=0;
        for( i =0;i<n-1;i++){//for number of pass
            isSorted = 1;
            for(j = 0;j <n-1-i ;j++)//for comparison in each pass
            {
                if(A[j] > A[j+1]){
                    int temp= A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                    isSorted=0;
                }
            }
            if(isSorted == 1){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,2,2,0,1};
        Sort(arr,6);
        printArray(arr,6);

    }
}
