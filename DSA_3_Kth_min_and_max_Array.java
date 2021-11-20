package DSA;

public class DSA_3_Kth_min_and_max_Array {
    static int KthMin(int A[],int n,int k){
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
        return A[k-1];
    }

    static int KthMax(int A[],int n,int k){
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
        return A[n-k];
    }
    public static void main(String[] args) {
        int arr[]={20,30,150,10,90,1};
        System.out.println("2nd minimum element is "+KthMin(arr,6,2));
        System.out.println("2nd maximum element is "+KthMax(arr,6,2));

    }
}
