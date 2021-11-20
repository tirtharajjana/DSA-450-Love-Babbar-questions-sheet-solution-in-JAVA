package DSA;

public class DSA_1_reverse_array {
    static void reverseArray(int arr[],int n){
        int temp;
        int start=0;
        int end = n-1;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static  void printArray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        reverseArray(a,6);
        printArray(a,6);
    }
}
