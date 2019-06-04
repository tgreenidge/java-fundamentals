package inheritance;

public class Review {
    private String body;
    private String author;
    private Integer numStars;
    private Restaurant restaurant;

    public Review(String body, int numStars, String author) {
        this.body = body;
        this.numStars = numStars;
        this.author = author;
    }

    public Review(String body, int numStars, String author, Restaurant restaurant) {
        this.body = body;
        this.numStars = numStars;
        this.author = author;
        this.restaurant = restaurant;
    }

    public Integer getNumStars() {
        return numStars;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return String.format("Restaurant: %s\nReview: %s \nNumber of Stars: %s\nAuthor: %s", restaurant.getName(), body, numStars, author);
    }
}
