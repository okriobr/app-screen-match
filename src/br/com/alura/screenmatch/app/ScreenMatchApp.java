package br.com.alura.screenmatch.app;

import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Title;

import java.util.ArrayList;
import java.util.List;

public class ScreenMatchApp {
    public static void main(String[] args) {
        Movie movie = new Movie("The GodFather", 1972, 177, true);

        System.out.println("Ficha técnica do filme");

        movie.showTechnicSlip();

        movie.getRatings().add(8);
        movie.getRatings().add(5);
        movie.getRatings().add(10);

        double meanResult = movie.calculateMean(movie.getRatings());

        System.out.println(String.format("Média: %.1f", meanResult) + "\n");

        Serie serie = new Serie("Lost", 2004, 0,false );

        System.out.println("Ficha técnica da série");

        serie.setSeason(6);
        serie.setEpisode(121);
        serie.setMinutesEpisode(40);
        serie.getDurationMinutes();

        serie.showTechnicSlip();

//        ArrayList<Title> playlist = new ArrayList<>();
//
//        playlist.add(movie);
//        playlist.add(serie);
//
//        System.out.println(playlist.size());

        List<Movie> movies = new ArrayList<>();

        movies.add(movie);

        System.out.println("Nome: " + movies.get(0).getName());
    }
}
