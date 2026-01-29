package br.com.alura.screenmatch.model;

public record TitleOmdb(String title, String year, String runtime) {
    public String getOnlyYear(){
        return year.substring(0,4);
    }

}
