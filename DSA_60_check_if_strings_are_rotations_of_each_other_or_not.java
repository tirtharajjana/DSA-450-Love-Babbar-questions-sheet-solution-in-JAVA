package DSA;

public class DSA_60_check_if_strings_are_rotations_of_each_other_or_not {
    static boolean areRotations(String str1, String str2){
        return (str1.length() == str2.length() && (str1+str2).indexOf(str2) != -1);
    }

    public static void main(String[] args) {
        String str1 = "AACD";
        String str2 = "ACDA";

        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }
}
