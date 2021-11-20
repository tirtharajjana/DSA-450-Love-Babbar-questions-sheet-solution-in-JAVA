package DSA;
import java.util.*;
public class DSA_197_Minimum_swap_required_to_convert_binary_tree_to_binary_search_tree {
    static class Pair{
        int first, second;

        Pair(int a, int b){
            first = a;
            second = b;
        }
    }
    static void inorder(int a[], Vector<Integer> v, int n, int index){
        if(index >= n)
            return;
        inorder(a,v,n,2*index+1);
        v.add(a[index]);
        inorder(a,v,n,2*index+2);
    }
    public static int minSwaps(Vector<Integer> arr){
        int n=arr.size();
        ArrayList<Pair> arrpos=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrpos.add(new Pair(arr.get(i),i));
        }

        arrpos.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                    return o1.first - o2.first;
            }
        });

        Boolean[] vis=new Boolean[n];
        Arrays.fill(vis,false);

        int ans=0;

        for (int i = 0; i < n; i++) {
            // already swapped and corrected or
            // already present at correct pos
            if (vis[i] || arrpos.get(i).first == i)
                continue;

            // find out the number of  node in
            // this cycle and add in ans
            int cycle_size = 0;
            int j = i;
            while (!vis[j])
            {
                vis[j] = true;

                // move to next node
                j = arrpos.get(j).second;
                cycle_size++;
            }

            // Update answer by adding current cycle.
            if(cycle_size > 0)
            {
                ans += (cycle_size - 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[] = { 5, 6, 7, 8, 9, 10, 11 };
        int n = a.length;

        Vector<Integer> v = new Vector<Integer>();

        inorder(a, v, n, 0);

        System.out.println(minSwaps(v));
    }
}
