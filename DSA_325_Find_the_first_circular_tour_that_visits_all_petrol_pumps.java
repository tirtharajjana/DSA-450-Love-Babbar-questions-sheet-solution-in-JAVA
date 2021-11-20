package DSA;

public class DSA_325_Find_the_first_circular_tour_that_visits_all_petrol_pumps {
    static class petrolPump
    {
        int petrol;
        int distance;

        // constructor
        public petrolPump(int petrol, int distance)
        {
            this.petrol = petrol;
            this.distance = distance;
        }
    }
    static int printTour(petrolPump arr[], int n){
        int start ,end;
        start=0;
        end=1;
        int curr_petrol=arr[start].petrol-arr[start].distance;

        while ( end!= start || curr_petrol<0 ){

            while (start!= end && curr_petrol<0){
                curr_petrol-=arr[start].petrol-arr[end].distance;
                start=(start+1)%n;
                if(start == 0)
                    return -1;
            }
            curr_petrol+=arr[end].petrol-arr[end].distance;
            end=(end+1)%n;
        }
        return start;
    }

    public static void main(String[] args) {
        petrolPump[] arr = {new petrolPump(6, 4),
                new petrolPump(3, 6),
                new petrolPump(7, 3)};

        int start = printTour(arr, arr.length);

        System.out.println(start == -1 ? "No Solution" : "Start = " + start);
    }
}
