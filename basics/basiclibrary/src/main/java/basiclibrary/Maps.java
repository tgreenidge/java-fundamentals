package basiclibrary;

import java.util.*;

public class Maps {

    public static String printMinToMaxTemperatures(int[][] weeklyMonthTemperatures) {
        HashSet<Integer> temperatures = new HashSet<>();

        for(int[] weeklyTemp : weeklyMonthTemperatures){
            for (int dailyTemp : weeklyTemp) {
                temperatures.add(dailyTemp);
            }

        }

        // convert hashset to a list and sort
        int[] temperaturesAsArray = new int[temperatures.size()];
        int i = 0;
        for (int temp : temperatures) {
            temperaturesAsArray[i++] = temp;
        }

        Arrays.sort(temperaturesAsArray);

        // build string
        StringBuilder outputString = new StringBuilder();
        outputString.append("High: " + temperaturesAsArray[temperaturesAsArray.length - 1] + "\nLow: " + temperaturesAsArray[0]);

        for(i = 1; i < temperaturesAsArray.length - 1; i++)
            outputString.append("\nNever saw temperature: " + temperaturesAsArray[i]);

        return outputString.toString();
    }

    public static String tally (List<String> votes){
        String winner = null;
        int maxVotes = 0;
        HashMap<String, Integer> voteCount = new HashMap<>();

        for (String personVotedFor : votes){
            if(voteCount.get(personVotedFor) == null)
                voteCount.put(personVotedFor, 0);
            else
                voteCount.put(personVotedFor, voteCount.get(personVotedFor) + 1);

            //determine max
            if(voteCount.get(personVotedFor) > maxVotes) {
                maxVotes = voteCount.get(personVotedFor);
                winner = personVotedFor;
            }
        }

        return winner;
    }
}
