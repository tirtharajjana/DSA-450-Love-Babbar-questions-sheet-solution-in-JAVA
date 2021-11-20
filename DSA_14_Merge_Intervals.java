package DSA;

public class DSA_14_Merge_Intervals {
    static void print2D(int a[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print(",");
        }
        System.out.println();
    }
    static void mergeInterval(int a[][],int r){
        for(int i=0;i<r-1;){
            if(a[i][1]>=a[i+1][0]){
                a[i][1]=a[i+1][1];
                for(int j=i+1;j<r-1;j++){
                    a[j][0]=a[j+1][0];
                    a[j][1]=a[j+1][1];
                }
                r--;
            }
            else{
                i++;
            }
//            print2D(a,r,2);
        }
        print2D(a,r,2);
    }
    public static void main(String[] args) {
        int a[][]=new int[][]{{1,3},{2,6},{6,10},{11,14}};
        mergeInterval(a,4);
    }
}
