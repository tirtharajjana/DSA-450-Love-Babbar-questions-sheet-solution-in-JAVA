package DSA;

import java.util.HashMap;

public class DSA_58_Print_all_the_duplicates_in_the_input_string {

    static void printDups(String str){
        HashMap<Character,Integer> hm=new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),1);
            }else{
                hm.put(str.charAt(i),hm.get(str.charAt(i)) +1 );
            }
        }

        for (char c:hm.keySet()){
            if(hm.get(c) > 1){
                System.out.println(c +": "+hm.get(c));
            }
        }
    }
    public static void main(String[] args) {
        String str = "test string";
        printDups(str);
    }
}
