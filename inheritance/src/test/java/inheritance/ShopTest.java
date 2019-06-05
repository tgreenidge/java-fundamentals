package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    Shop testShop;

    @Before
    public void setup() {
        testShop = new Shop("Le Blanc", "A very cool shop", "$$");
    }

    @Test
    public void testNewShop() {
        assertEquals("Shop Name Should be Le Blanc", "Le Blanc", testShop.getName());
        assertEquals("Shop description Should be A very cool shop", "A very cool shop", testShop.getDescription());
        assertEquals("Shop price Should be $$", "$$", testShop.getPrice());
    }

    @Test
    public void testToString() {
        String expectedOutput = "Shop Name: Le Blanc\nDescription: A very cool shop\nPrice: $$\nNumber of Stars: No Stars";
        assertEquals(expectedOutput, expectedOutput, testShop.toString());
    }

    @Test
    public void testAddReview() {
        Review review = new Review("This is a good review", 5, "Me");
        testShop.addReview(review);
        assertTrue("Should contain review", testShop.getReviews().contains(review));
    }
}

