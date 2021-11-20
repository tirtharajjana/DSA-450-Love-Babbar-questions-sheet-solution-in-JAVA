package DSA;

public class DSA_474_Count_number_of_bits_to_be_flipped_to_convert_A_to_B {
    public static int countSetBits(int n)
    {
        int count = 0;
        while (n != 0) {
            count++;
            n &=(n-1);
        }
        return count;
    }

    public static int FlippedCount(int a, int b)
    {

        return countSetBits(a ^ b);
    }

    // Driver code
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        System.out.print(FlippedCount(a, b));
    }
}
