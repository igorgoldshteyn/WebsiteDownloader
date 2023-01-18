package com.WebsiteDownloader.WebsiteDownloader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {


    String DEFAULT_URL = "http://localhost:8080/";

    @Test
    void simpleRestTest() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(DEFAULT_URL)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals("mainPage", response.body());

    }

    @Test
    void simpleRestTest2() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(DEFAULT_URL + "downloadByUrl" + "?url=https://www.baeldung.com/spring-request-param")).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals("mainPage", response.body());

    }

    @Test
    void userlogin() {
        // HttpClient client = HttpClient.newHttpClient();
        // HttpRequest request = HttpRequest.newBuilder().uri(URI.create(DEFAULT_URL + "login" )).build();
        // HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        // assertEquals("mainPage",response.body());

    }


    @Test
    void userloginWithWrongLoginAndPassword() {
        // HttpClient client = HttpClient.newHttpClient();
        // HttpRequest request = HttpRequest.newBuilder().uri(URI.create(DEFAULT_URL + "login" )).build();
        // HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        // assertEquals("mainPage",response.body());

    }

    @Test
    void createUser() {
        // HttpClient client = HttpClient.newHttpClient();
        // HttpRequest request = HttpRequest.newBuilder().uri(URI.create(DEFAULT_URL + "login" )).build();
        // HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        // assertEquals("mainPage",response.body());

    }
}
