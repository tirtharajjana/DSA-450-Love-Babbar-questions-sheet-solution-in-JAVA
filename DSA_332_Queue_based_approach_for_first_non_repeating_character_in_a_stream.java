package DSA;
import java.util.LinkedList;
import java.util.Queue;


public class DSA_332_Queue_based_approach_for_first_non_repeating_character_in_a_stream {
    static void firstNonRepeating(String str){
        int[] charCount=new int[26];
        Queue<Character> q=new LinkedList<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            q.add(ch);
            charCount[ch-'a']++;

            while (!q.isEmpty()){
                if(charCount[q.peek() -'a'] >1)
                    q.remove();
                else
                {
                    System.out.print(q.peek()+" ");
                    break;
                }
            }
            if (q.isEmpty())
                System.out.printf("-1 ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "aabc";
        firstNonRepeating(str);
    }
}
