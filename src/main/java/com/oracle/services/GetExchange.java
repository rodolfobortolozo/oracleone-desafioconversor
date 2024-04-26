package com.oracle.services;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class GetExchange<T> {

    abstract Class<T> getEntidade();
    String url;
    protected GetExchange(String url){
        this.url = url;
    }

    public T request(){
        try {
            Gson gson = new Gson();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .GET()
                    .build();
            HttpClient httpClient = HttpClient.newHttpClient();

            var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            return gson.fromJson(response.body(), getEntidade());

        }catch (URISyntaxException | IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }

        return null;
    }
}
