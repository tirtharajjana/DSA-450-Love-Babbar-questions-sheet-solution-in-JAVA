package DSA;
import java.util.*;
public class DSA_340_Kth_smallest_and_largest_element_in_an_unsorted_array {
    class MaxHeap
    {
        int[] harr; // pointer to array of elements in heap
        int capacity; // maximum possible size of max heap
        int heap_size; // Current number of elements in max heap

        int parent(int i) { return (i - 1) / 2; }
        int left(int i) { return (2 * i + 1); }
        int right(int i) { return (2 * i + 2); }
        int getMax() { return harr[0]; } // Returns maximum

        // to replace root with new node x and heapify() new root
        void replaceMax(int x)
        {
            this.harr[0] = x;
            maxHeapify(0);
        }
        MaxHeap(int a[], int size)
        {
            heap_size = size;
            harr = a; // store address of array
            int i = (heap_size - 1) / 2;
            while (i >= 0)
            {
                maxHeapify(i);
                i--;
            }
        }

        // Method to remove maximum element (or root) from max heap
        int extractMax()
        {
            if (heap_size == 0)
                return Integer.MAX_VALUE;

            // Store the maximum vakue.
            int root = harr[0];

            // If there are more than 1 items, move the last item to root
            // and call heapify.
            if (heap_size > 1)
            {
                harr[0] = harr[heap_size - 1];
                maxHeapify(0);
            }
            heap_size--;
            return root;
        }

        // A recursive method to heapify a subtree with root at given index
        // This method assumes that the subtrees are already heapified
        void maxHeapify(int i)
        {
            int l = left(i);
            int r = right(i);
            int largest = i;
            if (l < heap_size && harr[l] > harr[i])
                largest = l;
            if (r < heap_size && harr[r] > harr[largest])
                largest = r;
            if (largest != i)
            {
                int t = harr[i];
                harr[i] = harr[largest];
                harr[largest] = t;
                maxHeapify(largest);
            }
        }
    };

    // Function to return k'th largest element in a given array
    int kthSmallest(int arr[], int n, int k)
    {

        // Build a heap of first k elements: O(k) time
        MaxHeap mh = new MaxHeap(arr, k);

        // Process remaining n-k elements.  If current element is
        // smaller than root, replace root with current element
        for (int i = k; i < n; i++)
            if (arr[i] < mh.getMax())
                mh.replaceMax(arr[i]);

        // Return root
        return mh.getMax();
    }

    // Driver program to test above methods
    public static void main(String[] args)
    {
        int arr[] = { 12, 3, 5, 7, 19 };
        int n = arr.length, k = 4;
        DSA_340_Kth_smallest_and_largest_element_in_an_unsorted_array gfg = new DSA_340_Kth_smallest_and_largest_element_in_an_unsorted_array();
        System.out.print("K'th smallest element is " +
                gfg.kthSmallest(arr, n, k));
    }
}
