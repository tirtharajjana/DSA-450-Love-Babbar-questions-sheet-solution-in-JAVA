package DSA;

import java.math.BigInteger;

public class DSA_22_Factorials_of_large_numbers {
    static BigInteger factorial(int n){
        BigInteger b=new BigInteger("1");
        for(int i=2;i<=n;i++){
            b=b.multiply(b.valueOf(i));

        }
        return b;
    }
    public static void main(String[] args) {
        int n=100;
        System.out.println(factorial(n));
    }
}
