package DSA;

public class DSA_5_Move_all_negative_numbers_to_beginning_array {
    static  void printArray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void nenagtive_at_begining(int a[],int n){
        int j=0;
        for(int i=1;i<n;i++){
            if(a[i]<0){
                if (i != j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={10,-20,30,-40,50,60};
        nenagtive_at_begining(a,6);
        printArray(a,6);
    }
}
