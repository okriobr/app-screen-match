package br.com.alura.screenmatch.app;

import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Title;

import java.util.ArrayList;
import java.util.List;

public class ScreenMatchApp {
    public static void main(String[] args) {
        Movie movie = new Movie("The GodFather", 1972);

        Serie serie = new Serie("Lost", 2004);

        List<Title> titles = new ArrayList<>();

        titles.add(movie);
        titles.add(serie);

        titles.sort(Title::compareTo);

        System.out.println(titles);
    }
}
