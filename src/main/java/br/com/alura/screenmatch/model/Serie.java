package br.com.alura.screenmatch.model;

public class Serie extends Title {
    private int season;
    private int episode;
    private boolean active;
    private int minutesEpisode;

    public Serie(String name, int year) {
        super(name, year);
    }

    public Serie (TitleOmdb titleOmdb){
        super(titleOmdb);
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesEpisode() {
        return minutesEpisode;
    }

    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }

    @Override
    public int getDuration() {
        return season * episode * minutesEpisode;
    }

    @Override
    protected String getType() {
        return "Série: ";
    }
}
