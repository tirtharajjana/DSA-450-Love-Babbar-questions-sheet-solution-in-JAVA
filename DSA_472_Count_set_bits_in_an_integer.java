package DSA;

public class DSA_472_Count_set_bits_in_an_integer {
    static int countSetBits(int n){
        int c=0;
        while(n>0){
            c+=n & 1;
            n >>=1;
        }
        return c;
    }

    public static void main(String args[])
    {
        int i = 9;
        System.out.println(countSetBits(i));
    }
}
