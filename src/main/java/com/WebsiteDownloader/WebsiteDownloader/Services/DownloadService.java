package com.WebsiteDownloader.WebsiteDownloader.Services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DownloadService {
    public static String downloadByUrl(String url) throws IOException, InterruptedException {
        try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
        return response.body();

        }catch (IOException e){
            System.out.println(e);
            return e.toString();
        }
    }

}
