package DSA;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class DSA_327_Distance_of_nearest_cell_having_1 {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static boolean isValid(int x,int y,int n,int m){
        return (x>=0 && y>=0 && y<m && x<n);
    }

    static void nearest(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;

        int[][] dp=new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j]= 10000000;
            }
        }

        Queue<ArrayList<Integer>> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == 1){
                    dp[i][j]=0;
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    q.add(temp);
                }
            }
        }

        while (!q.isEmpty()){
            ArrayList<Integer> curr=q.poll();
            int x=curr.get(0);
            int y=curr.get(1);

            for (int i = 0; i < 4; i++) {
                int n_x=x+dx[i];
                int n_y=y+dy[i];

                if(isValid(n_x, n_y, n, m) && dp[n_x][n_y] > dp[x][y] + 1){
                    dp[n_x][n_y]=dp[x][y]+1;
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(n_x);
                    temp.add(n_y);
                    q.add(temp);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][] = { {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 0} };

        nearest(mat);
    }
}
