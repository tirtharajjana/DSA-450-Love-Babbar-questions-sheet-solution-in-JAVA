package DSA;

public class DSA_65_Print_all_Subsequences_of_a_string {
    static void printSubSeqRec(String str, int n, int index, String curr){
        if(index== n)
            return;
        if(curr != null && !curr.trim().isBlank())
            System.out.println(curr);

        for (int i = index+1; i <n ; i++) {
            curr+=str.charAt(i);
            printSubSeqRec(str,n,i,curr);
            curr=curr.substring(0,curr.length()-1);
        }
    }

    static void printSubSeq(String str)
    {
        int index = -1;
        String curr = "";

        printSubSeqRec(str, str.length(), index, curr);
    }

    public static void main(String[] args)
    {
        String str = "cab";
        printSubSeq(str);
    }
}
