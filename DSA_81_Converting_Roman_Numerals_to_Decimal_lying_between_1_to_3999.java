package DSA;

public class DSA_81_Converting_Roman_Numerals_to_Decimal_lying_between_1_to_3999 {
    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    int romanToDecimal(String str){
        int res=0;

        for (int i = 0; i < str.length(); i++) {
            int s1=value(str.charAt(i));

            if(i+1<str.length()){
                int s2=value(str.charAt(i+1));
                if(s1<=s2){
                    res=res+s2-s1;
                    i++;
                }else {
                    res=res+s1;
                }

            }
            else {
                res=res+s1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        DSA_81_Converting_Roman_Numerals_to_Decimal_lying_between_1_to_3999 ob = new DSA_81_Converting_Roman_Numerals_to_Decimal_lying_between_1_to_3999();

        // Considering inputs given are valid
        String str = "MCMIV";
        System.out.println("Integer form of Roman Numeral"
                + " is "
                + ob.romanToDecimal(str));
    }
}