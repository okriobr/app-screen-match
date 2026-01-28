package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.interfaces.Classifiable;

public abstract  class Title implements Classifiable, Comparable<Title> {
    private final String name;
    private final int year;
    private int duration;
    private boolean included;
    private int sumRatings;
    private int totalRatings;
    protected abstract String getType();

    public Title (String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

    public int getSumRatings() {
        return sumRatings;
    }

    public boolean isIncluded() {
        return included;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public String getTechnicSlip(){
        return "Nome: " + this.name + "\nAno: " + this.year;
    }

    public void rate(double rating){
        sumRatings += (int) rating;
        totalRatings++;
    }

    public double calculateMean(){
        return (double) sumRatings / totalRatings;
    }

    @Override
    public int getRating() {
        return (int) calculateMean() / 2;
    }

    @Override
    public String toString() {
        return getType() + this.name + "(" + this.year + ")";
    }

    @Override
    public int compareTo(Title title) {
        return this.name.compareTo(title.getName());
    }
}
