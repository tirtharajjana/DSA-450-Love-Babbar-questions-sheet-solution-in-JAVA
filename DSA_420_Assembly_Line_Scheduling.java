package DSA;

public class DSA_420_Assembly_Line_Scheduling {
    public static int carAssembleTime(int a[][], int t[][], int e[], int x[]){
        int n=a[0].length;
        int first=e[0]+a[0][0];
        int second=e[1]+a[1][0];

        for (int i = 1; i < n; i++) {
            int up = Math.min(first + a[0][i], second + t[1][i] + a[0][i]),
                    down = Math.min(second + a[1][i], first + t[0][i] + a[1][i]);
            first = up;
            second = down;
        }

        first+=x[0];
        second+=x[1];
        return Math.min(first, second);
    }

    public static void main(String[] args) {
        int a[][] = {{4, 5, 3, 2},
                {2, 10, 1, 4}};
        int t[][] = {{0, 7, 4, 5},
                {0, 9, 2, 8}};
        int e[] = {10, 12}, x[] = {18, 7};

        System.out.println(carAssembleTime(a, t, e, x));
    }
}
