package DSA;

import java.util.Arrays;

public class DSA_97_two_given_strings_are_isomorphic_to_each_other {
    static int size = 256;

    static boolean areIsomorphic(String str1, String str2){
        int m=str1.length();
        int n=str2.length();

        if(m!=n)
            return false;
        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);
        int[] map = new int[size];
        Arrays.fill(map, -1);

        for (int i = 0; i < n; i++) {
            if(map[str1.charAt(i)] == -1){
                if(marked[str2.charAt(i)] != false){
                    return false;
                }
                marked[str2.charAt(i)]=true;
                map[str1.charAt(i)]=str2.charAt(i);
            }
            else if(map[str1.charAt(i)] != str2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res = areIsomorphic("aab", "xxy");
        System.out.println(res);

        res = areIsomorphic("aab", "xyz");
        System.out.println(res);
    }
}
