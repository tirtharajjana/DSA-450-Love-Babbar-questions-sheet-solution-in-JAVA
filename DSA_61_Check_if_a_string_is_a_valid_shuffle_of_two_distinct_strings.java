package DSA;

public class DSA_61_Check_if_a_string_is_a_valid_shuffle_of_two_distinct_strings {
    static boolean shuffleCheck(String first, String second, String result) {
        int l1=first.length();
        int l2=second.length();
        int lr=result.length();

        if(l1+l2 != lr)
            return false;

        int i=0,j=0,k=0;

        while (k<lr){
            if(i<l1 && first.charAt(i) == result.charAt(k))
                i++;
            else if(j<l2 && second.charAt(j) == result.charAt(k))
                j++;
            else
                return false;
            k++;
        }

        if(i==l1 && j==l2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String first = "XY";
        String second = "12";
        String[] results = {"1XY2", "Y1X2", "Y21XX"};

        for (String result : results) {
            if ( shuffleCheck(first, second, result) == true) {
                System.out.println(result + " is a valid shuffle of " + first + " and " + second);
            }
            else {
                System.out.println(result + " is not a valid shuffle of " + first + " and " + second);
            }
        }
    }
}
