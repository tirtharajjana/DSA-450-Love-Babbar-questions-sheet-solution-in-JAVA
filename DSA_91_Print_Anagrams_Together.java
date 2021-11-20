package DSA;
import java.util.*;

public class DSA_91_Print_Anagrams_Together {
    private static void printAnagrams(String arr[]){
        HashMap<String,List<String>> mp=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            String curr=arr[i];
            char[] word=arr[i].toCharArray();
            Arrays.sort(word);
            String newWord=new String(word);

            if (mp.containsKey(newWord)){
                mp.get(newWord).add(curr);
            }else {
                List<String> words=new ArrayList<>();
                words.add(curr);
                mp.put(newWord,words);
            }
        }

        for(String s:mp.keySet()){
            List<String> values=mp.get(s);
            if (values.size() > 0) {
                System.out.print(values);
            }
        }
    }

    public static void main(String[] args) {
        // Driver program
        String arr[] = { "cat", "dog", "tac", "god", "act","lol" };
        printAnagrams(arr);
    }
}
