package DSA;

public class DSA_132_The_Double_HeLiX {
    public static void main(String[] args) {
        int a[]={3, 5, 7, 9, 20, 25, 30, 40, 55, 56, 57, 60, 62};
        int b[]={1, 4, 7, 11, 14, 25, 44, 47, 55, 57, 100};
        int n=13,m=11;

        int s1=0,s2=0;
        int i=0,j=0,ma=0;
        while (i<n && j<m){
            if(a[i] < b[j]){
                s1+=a[i++];
            }
            else if(b[j]<a[i]){
                s2+=b[j++];
            }else {
                ma=ma+Math.max(s1,s2)+a[i];
                s1=s2=0;
                i++;
                j++;
            }
        }
        while (i<n)
            s1+=a[i++];
        while (j<m)
            s2+=b[j++];
        ma=ma+Math.max(s1,s2);
        System.out.println(ma);
    }
}
