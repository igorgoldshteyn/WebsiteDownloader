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
        logger.info("mainPage");
        return "/";
    }

    @GetMapping("/downloadByUrl/{url}")
    public String downloadByUrl(@RequestParam String url) throws IOException, InterruptedException {
        logger.info("downloadByUrl");
        return DownloadService.downloadByUrl(url);
    }



}
