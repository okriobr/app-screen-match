package br.com.alura.screenmatch.controller;

import br.com.alura.screenmatch.model.TitleOmdb;
import br.com.alura.screenmatch.service.ScreenMatchService;

import java.io.IOException;

public class ScreenMatchController {
    private final ScreenMatchService service = new ScreenMatchService();

    public TitleOmdb getTitle(String title) throws IOException, InterruptedException {
        return service.titleSearch(title);
    }
}
