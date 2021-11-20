package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DSA_239_N_meetings_in_one_room {
    static class mycomparator implements Comparator<meeting>
    {
        @Override
        public int compare(meeting o1, meeting o2)
        {
            if (o1.end < o2.end)
            {

                // Return -1 if second object is
                // bigger then first
                return -1;
            }
            else if (o1.end > o2.end)

                // Return 1 if second object is
                // smaller then first
                return 1;

            return 0;
        }
    }

    // Custom class for storing starting time,
// finishing time and position of meeting.
    static class meeting
    {
        int start;
        int end;
        int pos;

        meeting(int start, int end, int pos)
        {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }
    public static void maxMeeting(ArrayList<meeting> al, int s)
    {

        // Initialising an arraylist for storing answer
        ArrayList<Integer> m = new ArrayList<>();

        int time_limit = 0;

        mycomparator mc = new mycomparator();

        // Sorting of meeting according to
        // their finish time.
        Collections.sort(al, mc);

        // Initially select first meeting.
        m.add(al.get(0).pos);

        // time_limit to check whether new
        // meeting can be conducted or not.
        time_limit = al.get(0).end;

        // Check for all meeting whether it
        // can be selected or not.
        for(int i = 1; i < al.size(); i++)
        {
            if (al.get(i).start > time_limit)
            {

                // Add selected meeting to arraylist
                m.add(al.get(i).pos);

                // Update time limit
                time_limit = al.get(i).end;
            }
        }

        // Print final selected meetings.
        for(int i = 0; i < m.size(); i++)
            System.out.print(m.get(i) + 1 + " ");
    }

    // Driver Code
    public static void main (String[] args)
    {

        // Starting time
        int s[] = { 1, 3, 0, 5, 8, 5 };

        // Finish time
        int f[] = { 2, 4, 6, 7, 9, 9 };

        // Defining an arraylist of meet type
        ArrayList<meeting> meet = new ArrayList<>();
        for(int i = 0; i < s.length; i++)

            // Creating object of meeting
            // and adding in the list
            meet.add(new meeting(s[i], f[i], i));

        // Function call
        maxMeeting(meet, meet.size());
    }

}
