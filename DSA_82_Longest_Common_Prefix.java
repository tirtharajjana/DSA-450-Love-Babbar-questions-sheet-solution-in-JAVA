package DSA;

public class DSA_82_Longest_Common_Prefix {
    static String commonPrefixUtil(String str1, String str2) {
        String res="";
        for (int i = 0,j=0; i <str1.length() && j<str2.length() ; i++,j++) {
            if(str1.charAt(i) != str2.charAt(j))
                break;
            res+=str1.charAt(i);
        }
        return res;
    }
    static String commonPrefix(String arr[], int n) {
        String pre=arr[0];

        for (int i = 1; i <arr.length ; i++) {
            pre=commonPrefixUtil(pre,arr[i]);
        }
        return pre;
    }

    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks",
                "geek", "geezer"};
        int n = arr.length;

        String ans = commonPrefix(arr, n);

        if (ans.length() > 0) {
            System.out.printf("The longest common prefix is - %s",
                    ans);
        } else {
            System.out.printf("There is no common prefix");
        }
    }
}
