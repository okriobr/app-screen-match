package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.model.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void add(Title title){
        totalTime += title.getDurationMinutes();
    }
}
