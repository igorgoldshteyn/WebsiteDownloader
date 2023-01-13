package com.WebsiteDownloader.Services;

import com.WebsiteDownloader.WebsiteDownloaderApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class DownloadService {
    private static Logger logger = LoggerFactory.getLogger(WebsiteDownloaderApplication.class);


    public static boolean downloadByUrl(String url) throws IOException, InterruptedException {
        System.out.println("Service downloadByUrl");
        System.out.println("Url = " + url);

        HttpResponse<String> response = null;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("response = " + response.body());

        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            FileWriter myWriter = new FileWriter("website.html");
            myWriter.write(response.body());
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return true;
    }


    public static String getDownloadRequestsByUserId(String id) {
        return "OK";
    }
}

