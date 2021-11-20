package DSA;

public class DSA_17_Best_Time_to_Buy_and_Sell_Stock {
    static int maxProfit(int a[]){
        int max=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[j]-a[i])>max && (a[j]-a[i]) >0){
                    max=(a[j]-a[i]);
                }
            }

        }
        return max;

    }
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
//        int a[]={7,6,4,3,1};
        System.out.println(maxProfit(a));
    }
}
