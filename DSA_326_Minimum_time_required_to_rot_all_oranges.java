package DSA;
import java.util.LinkedList;
import java.util.Queue;

public class DSA_326_Minimum_time_required_to_rot_all_oranges {
    public final static int R = 3;
    public final static int C = 5;

    static class Ele{
        int x=0,y=0;
        Ele(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    static boolean isValid(int i,int j){
        if(i>=0 && j>=0 && i<R && j<C)
            return true;
        return false;
    }

    static boolean isDelim(Ele temp){
        return (temp.x ==-1 && temp.y == -1);
    }

    static boolean checkAll(int arr[][])
    {
        for (int i=0; i<R; i++)
            for (int j=0; j<C; j++)
                if (arr[i][j] == 1)
                    return true;
        return false;
    }

    static int rotOranges(int arr[][]){
        Queue<Ele> Q=new LinkedList<>();
        Ele temp;
        int ans=0;
        for(int i=0;i<R;i++)
            for(int j=0;j<C;j++)
                if(arr[i][j] == 2)
                    Q.add(new  Ele(i,j));


        Q.add(new Ele(-1,-1));

        while (!Q.isEmpty()){
            boolean flag=false;


            while(!isDelim(Q.peek())){
                temp=Q.peek();
                //check right
                if(isValid(temp.x+1,temp.y) && arr[temp.x+1][temp.y] == 1){
                    if(!flag){
                        ans++;
                        flag=true;
                    }
                    arr[temp.x+1][temp.y]=2;
                    temp.x++;
                    Q.add(new Ele(temp.x,temp.y));
                    temp.x--;
                }

                //check left
                if(isValid(temp.x-1,temp.y) && arr[temp.x-1][temp.y] == 1){
                    if(!flag){
                        ans++;
                        flag=true;
                    }
                    arr[temp.x-1][temp.y]=2;
                    temp.x--;
                    Q.add(new Ele(temp.x,temp.y));
                    temp.x++;
                }
                //top
                if(isValid(temp.x,temp.y+1) && arr[temp.x][temp.y+1] == 1){
                    if(!flag){
                        ans++;
                        flag=true;
                    }
                    arr[temp.x][temp.y+1]=2;
                    temp.y++;
                    Q.add(new Ele(temp.x,temp.y));
                    temp.y--;
                }

                //bottom
                if (isValid(temp.x, temp.y-1) && arr[temp.x][temp.y-1] == 1)
                {
                    if (!flag)
                    {
                        ans++;
                        flag = true;
                    }
                    arr[temp.x][temp.y-1] = 2;
                    temp.y--;
                    Q.add(new Ele(temp.x,temp.y)); // push this cell to Queue
                }
                Q.remove();

            }
            Q.remove();
            if(!Q.isEmpty()){
                Q.add(new Ele(-1,-1));
            }




        }
        return (checkAll(arr))? -1: ans;

    }

    public static void main(String[] args) {
        int arr[][] = { {2, 1, 0, 2, 1},
                {1, 0, 1, 2, 1},
                {1, 0, 0, 2, 1}};
        int ans = rotOranges(arr);
        if(ans == -1)
            System.out.println("All oranges cannot rot");
        else
            System.out.println("Time required for all oranges to rot = " + ans);
    }

}
