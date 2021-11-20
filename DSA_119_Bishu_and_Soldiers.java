package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class DSA_119_Bishu_and_Soldiers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();

        int[] arr=new int[len];

        for (int i = 0; i < len; i++) {
            arr[i]=sc.nextInt();
        }

        int q=sc.nextInt();
        int power;
        Arrays.sort(arr);
        for (int i = 0; i < q; i++) {
            power=sc.nextInt();
            int count=0,sum=0,j=0;
            while ( j<len && arr[j]<=power ){
                count++;
                sum+=arr[j];
                j++;
            }
            System.out.println(sum+" "+count);
        }

    }
}
//custom input
//         7
//        1 2 3 4 5 6 7
//        3
//        3
//        10
//        2
