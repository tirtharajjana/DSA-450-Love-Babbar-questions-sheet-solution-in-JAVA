package DSA;

public class DSA_98_Recursively_print_all_sentences_that_can_be_formed_from_list_of_word_lists {
    static final int R= 3;
    static final int C =3;

    static void printUtil(String [][]arr, int m, int n,String []output){
        output[m] = arr[m][n];
        if (m == R - 1)
        {
            for (int i = 0; i < R; i++)
                System.out.print(output[i] + " ");
            System.out.println();
            return;
        }
        for (int i = 0; i < C; i++)
            if (arr[m + 1][i] != "" && m < C)
                printUtil(arr, m + 1, i, output);
    }

    static void print(String [][]arr)
    {
        // Create an array to store sentence
        String []output = new String[R];

        // Consider all words for first
        // row as starting points and
        // print all sentences
        for (int i = 0; i < C; i++)
            if (arr[0][i] != "")
                printUtil(arr, 0, i, output);
    }
    public static void main(String[] args)
    {
        String [][]arr  = {{"you", "we", ""},
                {"have", "are", ""},
                {"sleep", "eat", "drink"}};
        print(arr);
    }
}
