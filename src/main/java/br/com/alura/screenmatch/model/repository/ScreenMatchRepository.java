package br.com.alura.screenmatch.model.repository;

import br.com.alura.screenmatch.model.TitleOmdb;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScreenMatchRepository {
    private final String PATH = "file.json";
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void save(TitleOmdb titleOmdb) throws IOException {
        String json = gson.toJson(titleOmdb);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PATH, true))){
            writer.write(json);
            writer.newLine();
        } catch (IOException e){
            throw new RuntimeException("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}
