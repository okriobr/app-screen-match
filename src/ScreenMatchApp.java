import br.com.alura.screenmatch.model.Movie;

public class ScreenMatchApp {
    public static void main(String[] args) {
        Movie movie = new Movie("The GodFather", 1972, 177, true);

        movie.showTechnicSlip();

        movie.getRatings().add(8);
        movie.getRatings().add(5);
        movie.getRatings().add(10);

        double meanResult = movie.calculateMean(movie.getRatings());

        System.out.println("Média: " + meanResult);
    }
}
