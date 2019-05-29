package basiclibrary;

import java.util.*;

public class ArraysAndArrayLists {
    public static int[] roll(int n) {
        int[] numbersRolled = new int[n];

        for (int i = 0; i < n; i++) {
            numbersRolled[i] = (int) (Math.random() * 6) + 1;
        }

        return numbersRolled;
    }

    public static boolean containsDuplicates(int[] arrayOfNums) {
        Arrays.sort(arrayOfNums);

        for(int i = 1; i < arrayOfNums.length; i++){
            if(arrayOfNums[i - 1] == arrayOfNums[i])
                return true;
        }

        return false;
    }

    public static float calculateAverage(int[] arrayOfNums) {
        int sum = 0;

        for(int num : arrayOfNums) {
            sum += num;
        }

        return sum / arrayOfNums.length;
    }

    public static int[] calculateLowestAverage(int[][] arrayOfArrays ) {
        double lowestAverage = calculateAverage(arrayOfArrays[0]);
        int lowestAverageIndex = 0;

        for(int i = 1; i < arrayOfArrays.length; i++) {
            double currentArrayAverage = calculateAverage(arrayOfArrays[i]);
            if( currentArrayAverage < lowestAverage) {
                lowestAverage = currentArrayAverage;
                lowestAverageIndex = i;
            }
        }

        return arrayOfArrays[lowestAverageIndex];
    }
}
