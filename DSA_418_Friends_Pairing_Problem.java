package DSA;

public class DSA_418_Friends_Pairing_Problem  {
    static int countFriendsPairings(int n){
        int a=1,b=2,c=0;
        if(n<=2){
            return n;
        }
        for (int i = 3; i <= n ; i++) {
            c=b+(i-1)*a;
            a=b;
            b=c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countFriendsPairings(n));
    }
}
