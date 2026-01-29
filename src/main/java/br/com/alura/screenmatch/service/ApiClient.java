package br.com.alura.screenmatch.service;

import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o que deseja buscar: ");
        String search = input.nextLine();

        String url = "https://www.omdbapi.com/?t="+search+"&apikey=12a45813";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        TitleOmdb titleOmdb = gson.fromJson(json, TitleOmdb.class);

        try{
            Movie movie = new Movie(titleOmdb);
            System.out.println(movie);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
