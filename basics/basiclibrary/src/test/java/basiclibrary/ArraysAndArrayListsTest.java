package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArraysAndArrayListsTest {
    @Test
    public void testRoll() {
        int numberOfRolls = 4;
        assertEquals("Roll method should return  array of length 4",4, ArraysAndArrayLists.roll(4).length);
    }

    @Test
    public void testContainsDuplicates() {
        int[] arrayWithDupes = {2, 3, 3, 3, 3};
        int[] arrayWithNoDupes = {2, 3, 4, 5, 6};
        assertTrue("containsDuplicates method should return 'true'", ArraysAndArrayLists.containsDuplicates(arrayWithDupes));
        assertFalse("containsMethod should return 'true'", ArraysAndArrayLists.containsDuplicates(arrayWithNoDupes));
    }

    @Test
    public void testContainsNoDuplicates() {
        int[] arrayWithNoDupes = {2, 3, 4, 5, 6};
        assertFalse("containsMethod should return 'true'", ArraysAndArrayLists.containsDuplicates(arrayWithNoDupes));
    }

    @Test
    public void testCalculateAverage() {
        int[] arrayOfIntegers = {1, 2, 3, 9, 5};
        assertEquals("Calculate average should return 4.0",4.0, ArraysAndArrayLists.calculateAverage(arrayOfIntegers), 0.001);
    }

    @Test
    public void testCalculateLowestAverage() {
        int[][] arraysOfIntegers = {
                {66, 64, 58, 65, 71, 57, 60},
                {22, 25, 0, 15, 26, 22, 20},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertArrayEquals("Calculate average should return {22, 25, 0, 15, 26, 22, 20}", arraysOfIntegers[1], ArraysAndArrayLists.calculateLowestAverage(arraysOfIntegers));
    }
}
