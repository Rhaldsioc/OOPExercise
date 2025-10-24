package exercise17_Movie;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Christopher Nolan");
        movie.addActor("Leonardo DiCaprio");
        movie.addReview("Excellent!");
        movie.addReview("Mind-blowing visuals!");

        movie.showReviews();
    }
}
