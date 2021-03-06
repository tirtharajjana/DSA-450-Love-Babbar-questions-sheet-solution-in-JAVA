package DSA;
import java.io.*;
import java.util.*;
public class DSA_339_k_largest_elements {
    public static void FirstKelements(int arr[], int size, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[k]);
        }
        for (int i = k; i < size; i++) {
            if(minHeap.peek() > arr[i])
                continue;
            else{
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        Iterator iterator = minHeap.iterator();

        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }
    }

    public static void main (String[] args)
    {
        int arr[] = { 11, 3, 2, 1, 15, 5, 4,
                45, 88, 96, 50, 45 };

        int size = arr.length;

        // Size of Min Heap
        int k = 3;

        FirstKelements(arr, size, k);
    }

}
