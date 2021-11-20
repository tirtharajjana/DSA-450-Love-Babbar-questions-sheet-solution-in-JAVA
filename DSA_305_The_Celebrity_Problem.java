package DSA;

public class DSA_305_The_Celebrity_Problem {
    public static int celebrity(int M[][], int n){
        int a=0,b=n-1;

        while(a<b)
            if(M[a][b] == 1)
                a++;
            else
                b--;

        for(int i=0;i<n;i++){
            if(i!=a){
                if(M[a][i] == 1|| M[i][a] == 0){
                    return -1;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
//        int[][] M = { { 0, 0, 0, 1},
//                { 0, 0, 0, 1 },
//                { 0, 0, 0, 1},
//                { 0, 0, 0, 0 } };
        int[][] M = { { 0, 1, 0, 0},
                { 0, 0, 0, 0 },
                { 0, 1, 0, 0},
                { 0, 1, 0, 0 } };

        int celebIdx = celebrity(M, 4);

        if (celebIdx == -1)
            System.out.println("No celebrity found!");
        else {
            System.out.println(
                    "0-based celebrity index is : " + celebIdx);
        }
    }
}
