package DSA;

public class DSA_110_Find_a_pair_with_the_given_difference {
    static boolean findPair(int arr[],int n){
        int len=arr.length;

        int i=0,j=1;

        while (i<len && j<len){
            if(i!= j && arr[j]-arr[i] == n){
                System.out.print("Pair Found: "+
                        "( "+arr[i]+", "+ arr[j]+" )");
                return true;
            }
            else if(arr[j]-arr[i] <n){
                j++;
            }
            else {
                i++;
            }
        }

        System.out.print("No such pair");
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 30, 40, 100};
        int n = 60;
        findPair(arr,n);
    }
}
