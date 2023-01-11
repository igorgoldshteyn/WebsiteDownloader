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
//    private static Logger logger = LoggerFactory.getLogger(WebsiteDownloaderApplication.class);


    public static File downloadByUrl(String url) throws IOException, InterruptedException {
//        logger.info("Service downloadByUrl");
//        logger.info("Url = " + url);

        HttpResponse<String> response = null;
        try {
            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder().uri(URI.create(url)).build();

//        logger.info(request.toString());
            response = client.send(request, HttpResponse.BodyHandlers.ofString());

//            File downloadRequestHtml = new File();

        } catch (IOException e) {
            System.out.println(e);
//            return e.toString();
        }

        File websiteHtmlFile = null;




//            websiteHtmlFile = new File("wensite.html");
//
//            websiteHtmlFile.

            try {
                FileWriter myWriter = new FileWriter("website.html");
                myWriter.write(response.toString());
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }



            websiteHtmlFile.createNewFile();



        // send a response request with this file
//        logger.info(response.toString());

// сделать создание файла из этого html


        return websiteHtmlFile;


    }

    public static String getDownloadRequestsByUserId(String id) {
        return "OK";
    }
}

