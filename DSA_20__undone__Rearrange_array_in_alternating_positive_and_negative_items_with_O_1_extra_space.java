package DSA;

public class DSA_20__undone__Rearrange_array_in_alternating_positive_and_negative_items_with_O_1_extra_space {
    static  void printArray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }

    static void rightrotate(int a[],int flag,int till){
        for(int i=till;i>flag;i--){
            a[i]=a[i-1];
        }
    }
    static void rearrange(int a[],int n){
        int flag=0;
        for(int i=1;i<n;i++){
            if(a[i]<0){
                int temp=a[i];
                rightrotate(a,flag,i);
                a[flag]=temp;
                flag+=2;
            }
        }
    }
    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, -4, -1, 4};
        int arr[]= {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        rearrange(arr,10);
        printArray(arr,10);
    }
}


///////////////////////undone///////////////////////////////