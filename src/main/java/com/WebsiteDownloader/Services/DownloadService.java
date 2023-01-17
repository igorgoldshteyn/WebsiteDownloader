package com.WebsiteDownloader.Services;

import com.WebsiteDownloader.WebsiteDownloaderApplication;
import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class DownloadService {
    private static Logger logger = LoggerFactory.getLogger(WebsiteDownloaderApplication.class);


    public static ResponseEntity<Resource> downloadByUrl(String url) throws IOException, InterruptedException {
        HttpResponse<String> response = null;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        try {

            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("response = " + response.body());

        } catch (IOException e) {
            System.out.println(e);
        }

        // creating a file in a path

        File f = new File("src/main/resources/Files/1.txt");
        f.createNewFile(); // сделать проверку, что файл не создан и именование правильное


        FileOutputStream outputStream = new FileOutputStream(f);
        byte[] strToBytes = response.body().getBytes();
        outputStream.write(strToBytes);

        outputStream.close();

        Path filePath = Path.of("1.txt");
        Resource resource = new UrlResource(filePath.toUri());

        System.out.println("SSSSSSSSSSSSSSSSSSSS");

        String content = Files.readString(filePath);

        System.out.println("AAAAAAAAAAAAAAAA");


        System.out.println();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE);
        httpHeaders.set(HttpHeaders.CONTENT_DISPOSITION, ContentDisposition.attachment().filename(resource.getFilename()).build().toString()); // (4) Content-Disposition: attachment; filename="demo-file.txt"

        return ResponseEntity.ok().headers(httpHeaders)
                .body(resource);


    }
}

//    public static String getDownloadRequestsByUserId(String id) {
//        return "OK";
//    }
//}

