package DSA;

import java.util.Arrays;

public class DSA_442_Count_number_of_ways_to_reacha_given_score_in_a_game {
    static int count(int n){
        int table[] = new int[n + 1], i;

        // Initialize all table values as 0
        Arrays.fill(table, 0);

        // Base case (If given value is 0)
        table[0] = 1;
        for (i = 3; i <= n; i++)
            table[i] += table[i - 3];
        for (i = 5; i <= n; i++)
            table[i] += table[i - 5];
        for (i = 10; i <= n; i++)
            table[i] += table[i - 10];

        return table[n];
    }
    public static void main (String[] args)
    {
        int n = 20;
        System.out.println("Count for "+n+" is "+count(n));

        n = 13;
        System.out.println("Count for "+n+" is "+count(n));
    }
}
