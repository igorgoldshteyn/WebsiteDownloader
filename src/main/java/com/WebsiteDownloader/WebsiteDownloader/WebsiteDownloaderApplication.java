package com.WebsiteDownloader.WebsiteDownloader;

import com.WebsiteDownloader.WebsiteDownloader.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebsiteDownloaderApplication{

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(WebsiteDownloaderApplication.class, args);
    }
}
