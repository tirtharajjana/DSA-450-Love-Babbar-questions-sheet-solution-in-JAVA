package DSA;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Collections;

public class DSA_331_Minimum_sum_of_squares_of_character_counts_in_a_given_string_after_removing_k_characters {
    static final int MAX_CHAR = 26;
    static int minStringValue(String str, int k){
        int l=str.length();
        int[] freq=new int[MAX_CHAR];

        for (int i = 0; i < l; i++) {
            freq[str.charAt(i)-'a']++;
        }

        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < MAX_CHAR; i++) {
            if(freq[i]!=0)
                q.add(freq[i]);
        }

        while (k!= 0){
            q.add(q.poll()-1);
            k--;
        }
        
        int res=0;
        while (!q.isEmpty())
            res+=q.peek()*q.poll();
        
        return res;
    }

    public static void main(String[] args) {
        String str = "abbccc"; // Input 1
        int k = 2;
        System.out.println(minStringValue(str, k));

        str = "aaab"; // Input 2
        k = 2;
        System.out.println(minStringValue(str, k));
    }
}
