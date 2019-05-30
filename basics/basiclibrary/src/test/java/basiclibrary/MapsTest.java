package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class MapsTest {
    @Test
    public void testPrintToMaxTemperatures() {
        //Daily average temperatures for Seattle, October 1-28 2017
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        String expectedOuput = "High: 72\n" +
                "Low: 51\n" +
                "Never saw temperature: 52\n" +
                "Never saw temperature: 53\n" +
                "Never saw temperature: 54\n" +
                "Never saw temperature: 55\n" +
                "Never saw temperature: 56\n" +
                "Never saw temperature: 57\n" +
                "Never saw temperature: 58\n" +
                "Never saw temperature: 59\n" +
                "Never saw temperature: 60\n" +
                "Never saw temperature: 61\n" +
                "Never saw temperature: 62\n" +
                "Never saw temperature: 64\n" +
                "Never saw temperature: 65\n" +
                "Never saw temperature: 66\n" +
                "Never saw temperature: 70\n" +
                "Never saw temperature: 71";

        assertEquals("blas", expectedOuput, Maps.printMinToMaxTemperatures(weeklyMonthTemperatures));
    }

    @Test
    public void testTallyMethod() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        assertEquals("Tally method should return 'Bush'", "Bush", Maps.tally(votes));
    }
}