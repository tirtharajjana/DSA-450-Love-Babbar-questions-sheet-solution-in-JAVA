package DSA;
import java.util.Arrays;
import java.util.Comparator;
public class DSA_117_Sort_an_array_according_to_count_of_set_bits {
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Integer arr[] = { 1, 2, 3, 4, 5, 6 };
        int n = 6;
        sortBySetBitCount(arr, n);
        printArr(arr, n);
        System.out.println();
    }

    private static void printArr(Integer[] arr, int n)
    {
        // TODO Auto-generated method stub
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        // cout << arr[i] << " ";
    }
    private static Integer[] sortBySetBitCount(Integer[] arr, int n){
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int c1=Integer.bitCount(o1);
                int c2=Integer.bitCount(o2);

                if(c1<= c2)
                    return 1;
                return -1;
            }
        });
        return arr;
    }
}
