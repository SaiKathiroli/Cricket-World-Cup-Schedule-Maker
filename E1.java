
import java.util.*;

public class E1
{
    static int count = 0;

   static List<String> shuffl = new ArrayList<>();
    public static void schedule(String[] teams)
    {
        if(teams.length == 1) return;

        for (int i = 1; i < teams.length; i++)
        {
            shuffl.add(teams[0] + " vs " + teams[i]);
            count = count+1;
        }

        String[] send = Arrays.copyOfRange(teams,1,teams.length);
        schedule(send);
    }
    public static void main(String[] args)
    {
        String[] teams = {"Netherlands","Australia","New Zealand","Afghanistan","Bangladesh","Pakistan","Sri Lanka","India",
                "South Africa","England"};
        schedule(teams);
        Collections.shuffle(shuffl,new Random(4));
        for (String j:shuffl)
        {
            System.out.println(j);
        }
        System.out.println();
        System.out.println("The Total Number of Matches: "+count);
    }
}
