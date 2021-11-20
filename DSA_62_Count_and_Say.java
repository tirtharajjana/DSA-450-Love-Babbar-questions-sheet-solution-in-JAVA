package DSA;

public class DSA_62_Count_and_Say {
    static String countnndSay(int n){
        if(n == 1)
            return "1";
        if(n == 2)
            return "11";
        
        String str="11";

        for (int i = 3; i <= n ; i++) {
            String temp="";
            str+="$";
            int c=1;
            for (int j = 1; j < str.length(); j++) {
                if(str.charAt(j) != str.charAt(j-1)){
                    temp+=c;
                    temp+=str.charAt(j-1);
                    c=1;
                }
                else
                    c++;
            }
            str=temp;
        }
        return str;
    }

    public static void main(String[] args) {
        int N = 4;
        System.out.println(countnndSay(N));
    }
}
