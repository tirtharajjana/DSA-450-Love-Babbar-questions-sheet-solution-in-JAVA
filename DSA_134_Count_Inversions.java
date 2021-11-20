package DSA;

public class DSA_134_Count_Inversions {
    static int arr[] = new int[] { 1, 20, 6, 4, 5 };

    static int getInvCount(int n){
        int c=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[i]){
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Number of inversions are "+ getInvCount(arr.length));
    }
}
