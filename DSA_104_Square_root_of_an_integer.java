package DSA;

public class DSA_104_Square_root_of_an_integer {
    static int floorSqrt(int x){
        if(x == 0 || x == 1){
            return x;
        }
        int i=0;
        int res=i*i;

        while(res<x){
            i++;
            res=i*i;
        }
        return i-1;
    }

    public static void main(String[] args) {
        int x = 11;
        System.out.print(floorSqrt(x));
    }
}
