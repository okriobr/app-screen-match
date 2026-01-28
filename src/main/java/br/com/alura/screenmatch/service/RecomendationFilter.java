package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.interfaces.Classifiable;

public class RecomendationFilter {

    public void filter(Classifiable classifiable){
        if (classifiable.getRating() >= 4){
            System.out.println("Excelente!");
        } else if (classifiable.getRating() >= 2){
            System.out.println("Muito bom!");
        } else {
            System.out.println("Bom!");
        }
    }
}
