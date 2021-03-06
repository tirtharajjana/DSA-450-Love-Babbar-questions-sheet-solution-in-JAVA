package DSA;

public class DSA_108_Majority_Element {
    void printMajority(int a[], int size)
    {
        /* Find the candidate for Majority*/
        int cand = findCandidate(a, size);

        /* Print the candidate if it is Majority*/
        if (isMajority(a, size, cand))
            System.out.println(" " + cand + " ");
        else
            System.out.println("No Majority Element");
    }

    int findCandidate(int a[], int size){
        int maj_ind=0,count=1;

        for (int i = 1; i <size ; i++) {
            if(a[maj_ind] == a[i])
                count++;
            else
                count--;
            if(count == 0){
                count=1;
                maj_ind=i;
            }
        }

        return a[maj_ind];
    }

    boolean isMajority(int a[], int size, int cand){
        int count=0;
        for (int i = 0; i < size; i++) {
            if(a[i] == cand)
                count++;
        }

        if (count>size/2)
            return true;
        return false;
    }

    public static void main(String[] args) {
        DSA_108_Majority_Element majorelement
                = new DSA_108_Majority_Element();
        int a[] = new int[] { 1, 1, 3, 1, 3 };

        // Function call
        int size = a.length;
        majorelement.printMajority(a, size);
    }
}
