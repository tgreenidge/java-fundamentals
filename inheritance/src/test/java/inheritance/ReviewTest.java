package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void testNewReviewThreeArgs() {
        Review review = new Review("This is a good review", 5, "Me");
        String[] outputValues = {"This is a good review", "5", "Me"};
        assertArrayEquals(outputValues, new String[] {review.getBody(), Integer.toString(review.getNumStars()), review.getAuthor()});

    }

    @Test
    public void testNewReviewFourArgs() {
        Restaurant newRestaurant = new Restaurant("Le Blanc", "$$");
        Review review = new Review("This is an ok review", 3, "Me", newRestaurant);

        String[] outputValues = {"This is an ok review", "3", "Me", newRestaurant.toString()};
        assertArrayEquals(outputValues, new String[] {review.getBody(), Integer.toString(review.getNumStars()), review.getAuthor(), review.getRestaurant().toString()});
    }

    @Test
    public void testToString() {
        Restaurant newRestaurant = new Restaurant("Le Blanc", "$$");
        Review review = new Review("This is an ok review", 3, "Me", newRestaurant);
        assertEquals("Restaurant: Le Blanc\nReview: This is an ok review \nNumber of Stars: 3\nAuthor: Me", review.toString());
    }
}
