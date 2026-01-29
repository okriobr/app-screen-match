package br.com.alura.screenmatch.model;

public class Movie extends Title {
    private String director;

    public Movie(String name, int year) {
        super(name, year);
    }

    public Movie (TitleOmdb titleOmdb){
        super(titleOmdb);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    protected String getType() {
        return "Filme: ";
    }

}
