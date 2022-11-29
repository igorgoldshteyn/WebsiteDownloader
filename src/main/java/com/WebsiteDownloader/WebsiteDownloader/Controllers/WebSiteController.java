package com.WebsiteDownloader.WebsiteDownloader.Controllers;

import com.WebsiteDownloader.WebsiteDownloader.Services.DownloadService;
import com.WebsiteDownloader.WebsiteDownloader.WebsiteDownloaderApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WebSiteController {

    private static Logger logger = LoggerFactory.getLogger(WebsiteDownloaderApplication.class);

    @GetMapping("/")
    public String mainPage() {

        System.out.println("sout mainPage");
        logger.info("mainPage");
        return "mainPage";
    }

    @GetMapping("/downloadByUrl")
//    public String downloadByUrl(@RequestParam String url) throws IOException, InterruptedException {
    public String downloadByUrl(@RequestParam String url) throws IOException, InterruptedException {
        if(url == null){
            System.out.println("URL is null");
            return "URL is null";

        }

        logger.info("downloadByUrl");
        logger.info(url);
        return DownloadService.downloadByUrl(url);
    }

    //  @GetMapping("/getDownloadRequestsByUserId")
    // public String getDownloadRequestsByUser(@RequestParam String id) {
    //     return DownloadService.downloadByUrl(url);
    // }

    //  @GetMapping("/login")
    // public String login(@RequestParam String login, @RequestParam String password ){
    //     return UserService.login(login,password);
    // }




}
