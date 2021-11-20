package DSA;

public class DSA_85_Minimum_Swaps_for_Bracket_Balancing {
    static long swapCount(String s){
        char[] ch=s.toCharArray();
        int lb=0,rb=0;
        int swap=0,imbalance=0;

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == '['){
                lb++;
                if(imbalance>0){
                    swap+=imbalance;
                    imbalance--;
                }
            }
            else if(ch[i] == ']'){
                rb++;
                imbalance=(rb-lb);
            }
        }

        return swap;
    }

    public static void main(String[] args) {
        String s = "[]][][";
        System.out.println(swapCount(s) );

        s = "[[][]]";
        System.out.println(swapCount(s) );
    }
}
