package br.com.alura.screenmatch.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ScreenMatchApiCLient {

    public String getData() throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.omdbapi.com/?t=matrix&apikey=12a45813"))
                .build();

        HttpResponse<String> response = client
                .send(request,HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
