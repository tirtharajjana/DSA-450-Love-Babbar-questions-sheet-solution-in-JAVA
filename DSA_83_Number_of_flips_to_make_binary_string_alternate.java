package DSA;

public class DSA_83_Number_of_flips_to_make_binary_string_alternate {
    public static char flip(char ch){
        return ch == '0'?'1':'0';
    }

    public static int getFlipWithStartingCharcter(String str, char expected){
        int c=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != expected)
                c++;
            expected=flip(expected);
        }
        return c;
    }

    public static int minFlipToMakeStringAlternate(String str)
    {
        return Math.min(getFlipWithStartingCharcter(str,'0'),getFlipWithStartingCharcter(str,'1'));
    }

    public static void main(String[] args) {
        String str = "0001010111";
//        String str = "000";
        System.out.println(minFlipToMakeStringAlternate(str));
    }
}
