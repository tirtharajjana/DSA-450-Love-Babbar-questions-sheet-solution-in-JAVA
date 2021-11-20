package DSA;

public class DSA_433_Max_length_chain {
    int a;
    int b;

    public DSA_433_Max_length_chain(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    static int maxChainLength(DSA_433_Max_length_chain arr[], int n){
        int i, j, max = 0;
        int mcl[] = new int[n];
        for ( i = 0; i < n; i++ )
            mcl[i] = 1;
        for ( i = 1; i < n; i++ )
            for ( j = 0; j < i; j++ )
                if ( arr[i].a > arr[j].b &&
                        mcl[i] < mcl[j] + 1)
                    mcl[i] = mcl[j] + 1;
        for ( i = 0; i < n; i++ )
            if ( max < mcl[i] )
                max = mcl[i];

        return max;
    }

    public static void main(String[] args)
    {
        DSA_433_Max_length_chain arr[] = new DSA_433_Max_length_chain[]
                {
                        new DSA_433_Max_length_chain(5,24),
                        new DSA_433_Max_length_chain(15, 25),
                        new DSA_433_Max_length_chain (27, 40),
                        new DSA_433_Max_length_chain(50, 60)};
        System.out.println("Length of maximum size chain is " + maxChainLength(arr, arr.length));
    }
}
