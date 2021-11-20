package DSA;

public class DSA_66_print_all_permutations_of_a_given_string {
    private void permute(String str, int l, int r){
        if(l == r){
            System.out.println(str);
        }
        else {
            for (int i = 1; i <= r ; i++) {
                str=swap(str,l,r);
                permute(str,l+1,r);
                str = swap(str,l,i);
            }
        }
    }

    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        DSA_66_print_all_permutations_of_a_given_string permutation = new DSA_66_print_all_permutations_of_a_given_string();
        permutation.permute(str, 0, n-1);
    }
}
