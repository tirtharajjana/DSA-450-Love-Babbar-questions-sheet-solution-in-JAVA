package DSA;

public class DSA_453_Longest_alternating_subsequence {
    static int LAS(int[] arr, int n)
    {

        // "inc" and "dec" initialized as 1,
        // as single element is still LAS
        int inc = 1;
        int dec = 1;

        // Iterate from second element
        for (int i = 1; i < n; i++)
        {

            if (arr[i] > arr[i - 1])
            {
                // "inc" changes iff "dec"
                // changes
                inc = dec + 1;
            }
            else if (arr[i] < arr[i - 1])
            {

                // "dec" changes iff "inc"
                // changes
                dec = inc + 1;
            }
        }

        // Return the maximum length
        return Math.max(inc, dec);
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 10, 22, 9, 33, 49,
                50, 31, 60 };
        int n = arr.length;

        // Function Call
        System.out.println(LAS(arr, n));
    }
}
