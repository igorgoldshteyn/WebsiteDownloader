package com.WebsiteDownloader.WebsiteDownloader.Services;

import com.WebsiteDownloader.WebsiteDownloader.WebsiteDownloaderApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class DownloadService {
    private static Logger logger = LoggerFactory.getLogger(WebsiteDownloaderApplication.class);


    public static String downloadByUrl(String url) throws IOException, InterruptedException { // надо дотестировать
        logger.info("Service downloadByUrl");
        logger.info("Url = " + url);
        try {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        logger.info(request.toString());
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        logger.info(response.toString());

        return response.body();

        }catch (IOException e){
            System.out.println(e);
            return e.toString();
        }
    }
}
