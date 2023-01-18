package com.WebsiteDownloader;

import com.WebsiteDownloader.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class WebsiteDownloaderApplication{

    @Autowired
    private AccountRepository accountRepository;

    public static void main(String[] args) throws IOException {

        SpringApplication.run(WebsiteDownloaderApplication.class, args);

    }
}
