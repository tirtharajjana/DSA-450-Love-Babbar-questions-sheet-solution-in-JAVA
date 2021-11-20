package DSA;

public class DSA_16_Count_Inversions {
    static int inversionCount(int a[]){
        int c=0;
        for(int i=0;i< a.length;i++)
            for(int j=i+1;j<a.length;j++)
                if(a[i]>a[j])
                    c++;
        return c;
    }
    public static void main(String[] args) {
        int a[]={2, 4, 1, 3, 5};
//        int a[]={2, 3, 4, 5, 6};
        System.out.println(inversionCount(a));
    }
}
