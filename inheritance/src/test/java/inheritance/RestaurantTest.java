package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testNewRestaurant() {
        Restaurant newRestaurant = new Restaurant("Le Blanc", "$$");
        String[] outputValues = {"Le Blanc", "$$"};
        assertArrayEquals(outputValues, new String[] {newRestaurant.getName(), newRestaurant.getPrice()});
    }

    @Test
    public void testToString() {
        Restaurant newRestaurant = new Restaurant("Le Blanc", "$$");
        String expectedOutput = "Restaurant Name: Le Blanc\nPrice: $$ \nNumber of Stars: No Stars";
        assertEquals(expectedOutput, newRestaurant.toString());
    }

    @Test
    public void testAddReview() {
        Restaurant newRestaurant = new Restaurant("Le Blanc", "$$");
        Review restaurantReview = new Review("This is a good review", 5, "Me");
        newRestaurant.addReview(restaurantReview);
        assertTrue("Should contain review", newRestaurant.containsReview(restaurantReview));
    }

    @Test
    public void testUpdateRestaurantStars() {
        Restaurant newRestaurant = new Restaurant("Le Blanc", "$$");
        Review restaurantReview = new Review("This is a good review", 5, "Me");
        newRestaurant.addReview(restaurantReview);

        Review restaurantReview2 = new Review("This is an ok review", 3, "Me");
        newRestaurant.addReview(restaurantReview2);

        assertEquals("Should contain review", 4, newRestaurant.getNumStars());
    }
}
