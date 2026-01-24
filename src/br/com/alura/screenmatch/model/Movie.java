package br.com.alura.screenmatch.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    String name;
    int year;
    int duration;
    boolean included;
    private List<Integer> ratings = new ArrayList<Integer>();

    public Movie(String name, int year, int duration, boolean included){
        this.name = name;
        this.year = year;
        this.duration = duration;
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
