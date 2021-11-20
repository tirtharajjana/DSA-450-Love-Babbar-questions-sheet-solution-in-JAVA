package DSA;

public class DSA_398_Minimise_the_cashflow_among_a_given_set_of_friends_who_have_borrowed_money_from_each_other {
    static final int N = 3;

    // A utility function that returns
    // index of minimum value in arr[]
    static int getMin(int arr[])
    {
        int minInd = 0;
        for (int i = 1; i < N; i++)
            if (arr[i] < arr[minInd])
                minInd = i;
        return minInd;
    }

    // A utility function that returns
    // index of maximum value in arr[]
    static int getMax(int arr[])
    {
        int maxInd = 0;
        for (int i = 1; i < N; i++)
            if (arr[i] > arr[maxInd])
                maxInd = i;
        return maxInd;
    }

    // A utility function to return minimum of 2 values
    static int minOf2(int x, int y)
    {
        return (x < y) ? x: y;
    }

    static void minCashFlowRec(int amount[]){
        int mxCredit=getMax(amount),mxDebit=getMin(amount);
        if(amount[mxCredit] == 0 && amount[mxDebit] == 0)
            return;
        int min = minOf2(-amount[mxDebit], amount[mxCredit]);
        amount[mxCredit] -= min;
        amount[mxDebit] += min;
        System.out.println("Person " + mxDebit + " pays " + min
                + " to " + "Person " + mxCredit);
        minCashFlowRec(amount);
    }
    static void minCashFlow(int graph[][])
    {

        int amount[]=new int[N];

        for (int p = 0; p < N; p++)
            for (int i = 0; i < N; i++)
                amount[p] += (graph[i][p] - graph[p][i]);

        minCashFlowRec(amount);
    }
    public static void main (String[] args)
    {
        // graph[i][j] indicates the amount
        // that person i needs to pay person j
        int graph[][] = { {0, 1000, 2000},
                {0, 0, 5000},
                {0, 0, 0},};

        // Print the solution
        minCashFlow(graph);
    }
}
