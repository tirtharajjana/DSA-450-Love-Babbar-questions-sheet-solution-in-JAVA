package DSA;

public class DSA_11_Find_the_Duplicate_Number_arrays {
    static int getDuplicate(int a[],int n){
        int d = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i] == a[j]){
                    d=a[i];
                    break;
                }
            }
        }
        return d;
    }
    public static void main(String[] args) {
        int a[]= {3,1,3,4,2};
        System.out.println(getDuplicate(a,5));
    }
}
