package DSA;

public class DSA_2_maxima_and_minima_in_an_array {
    static int getMax(int a[],int n){
        int max=a[0];
        for(int i=1;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }

    static int getMin(int a[],int n){
        int min=a[0];
        for(int i=1;i<n;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        return min;
    }

    static  void printArray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        System.out.println("max :"+getMax(a,6));
        System.out.println("min :"+getMin(a,6));
    }
}
