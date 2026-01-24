package br.com.alura.screenmatch.model;

import java.util.ArrayList;
import java.util.List;

public class Title {
    private String name;
    private int year;
    private int duration;
    private boolean included;
    private List<Integer> ratings = new ArrayList<Integer>();

    public Title (String name, int year, int duration, boolean included){
        this.name = name;
        this.year = year;
        this.duration = duration;
        this.included = included;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

    public List<Integer> getRatings() {
        return ratings;
    }

    public void showTechnicSlip(){
        System.out.println("Nome: " + name);
        System.out.println("Ano: " + year);
    }

    public double calculateMean(List <Integer> ratings){
        return ratings.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}
