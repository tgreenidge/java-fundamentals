package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;


public class TheaterTest {
    Theater testTheaterWithNoMovies;
    Theater testTheaterWithOneMovie;
    Theater testTheaterWithManyMovies;
    HashSet<String> movies = new HashSet<>();

    @Before
    public void setup() {
        testTheaterWithNoMovies = new Theater("Movie House 1");
        testTheaterWithOneMovie = new Theater("Movie House 2", "Alladin");
        movies.add("Alladin");
        movies.add("Avengers");
        movies.add("Black Panther");
        testTheaterWithManyMovies = new Theater("Movie House 3", movies);
    }

    @Test
    public void testNewTheatreNoMovies() {
        assertEquals("Theatre Name Should be Movie House 1", "Movie House 1", testTheaterWithNoMovies.getName());
    }

    @Test
    public void testNewTheatreOneMovie() {
        assertEquals("Theatre Name Should be Movie House 2", "Movie House 2", testTheaterWithOneMovie.getName());
        assertTrue("Movie Name Should be in theatre movies", testTheaterWithOneMovie.getMovies().contains("Alladin"));
    }

    @Test
    public void testNewTheatreManyMovies() {
        assertEquals("Theatre Name Should be Movie House 3", "Movie House 3", testTheaterWithManyMovies.getName());
        assertEquals("Movies Should be in theatre movies", movies, testTheaterWithManyMovies.getMovies());
    }

    @Test
    public void testAddMovie() {
        String newMovie = "Girls Trip";
        testTheaterWithManyMovies.addMovie(newMovie);
        assertTrue("Girls Trip Should be in theatre movies", testTheaterWithManyMovies.getMovies().contains(newMovie));
    }

    @Test
    public void testRemoveMovieInMovies() {
        String newMovie = "Alladin";
        testTheaterWithManyMovies.removeMovie(newMovie);
        assertFalse("Girls Trip Should Not be in theatre movies", testTheaterWithManyMovies.getMovies().contains(newMovie));
    }
    @Test
    public void testRemoveMovieNotInMovies() {
        String newMovie = "Girls Trip";
        testTheaterWithManyMovies.removeMovie(newMovie);
        assertFalse("Girls Trip Should Not be in theatre movies", testTheaterWithManyMovies.getMovies().contains(newMovie));
    }

    @Test
    public void testToString() {
        String expectedOutput = "Theater Name: Movie House 1";
        assertEquals("To string should return expected output", expectedOutput, testTheaterWithNoMovies.toString());
    }

    @Test
    public void testAddReview() {
        Review theaterReview = new Review("This is a good review", 5, "Me");
        testTheaterWithOneMovie.addReview(theaterReview);
        assertTrue("Should contain review", testTheaterWithOneMovie.getReviews().contains(theaterReview));
    }

}
