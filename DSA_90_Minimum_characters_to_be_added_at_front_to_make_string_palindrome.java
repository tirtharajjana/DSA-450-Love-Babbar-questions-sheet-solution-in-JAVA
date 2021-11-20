package DSA;
import java.util.*;
public class DSA_90_Minimum_characters_to_be_added_at_front_to_make_string_palindrome {
    public static int[] computeLPSArray(String str){
        int n = str.length();
        int lps[] = new int[n];
        int i = 1, len = 0;
        lps[0] = 0;

        while (i < n)
        {
            if (str.charAt(i) == str.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {

                if (len != 0)
                {
                    len = lps[len - 1];

                }
                else
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    static int getMinCharToAddedToMakeStringPalin(String str){
        StringBuilder s = new StringBuilder();
        s.append(str);

        String rev = s.reverse().toString();
        s.reverse().append("$").append(rev);


        int lps[] = computeLPSArray(s.toString());
        return str.length() - lps[s.length() - 1];
    }

    public static void main(String[] args) {
        String str = "AACECAAAA";
        System.out.println(getMinCharToAddedToMakeStringPalin(str));
    }
}
