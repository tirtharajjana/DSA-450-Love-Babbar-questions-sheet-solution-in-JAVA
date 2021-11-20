package DSA;
import java.util.*;
public class DSA_84_Second_most_repeated_string_in_a_sequence {
    static String secMostRepeated(Vector<String> seq){
        HashMap<String,Integer> occ=new HashMap<String,Integer>(seq.size()){
            public Integer get(Object key){
                return containsKey(key)?super.get(key):0;
            }
        };

        for (int i = 0; i < seq.size(); i++) {
            occ.put(seq.get(i),occ.get(seq.get(i))+1);
        }

        int first_max=Integer.MIN_VALUE,sec_max=Integer.MAX_VALUE;

        Iterator<Map.Entry<String,Integer>> itr=occ.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String,Integer> entry=itr.next();
            int v = entry.getValue();
            if( v > first_max) {
                sec_max = first_max;
                first_max = v;
            }

            else if (v > sec_max &&
                    v != first_max)
                sec_max = v;
        }

        itr = occ.entrySet().iterator();
        while (itr.hasNext())
        {
            Map.Entry<String, Integer> entry = itr.next();
            int v = entry.getValue();
            if (v == sec_max)
                return entry.getKey();
        }

        return null;


    }

    public static void main(String[] args) {
        String arr[] = { "ccc", "aaa", "ccc",
                "ddd", "aaa", "aaa" };
        List<String> seq =  Arrays.asList(arr);

        System.out.println(secMostRepeated(new Vector<>(seq)));
    }
}
