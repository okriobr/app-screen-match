package br.com.alura.screenmatch.model;

public class Serie extends Title{
    private int season;
    private int episode;
    private boolean active;
    private int minutesEpisode;

    public Serie(String name, int year, int duration, boolean included) {
        super(name, year, duration, included);
    }


}
