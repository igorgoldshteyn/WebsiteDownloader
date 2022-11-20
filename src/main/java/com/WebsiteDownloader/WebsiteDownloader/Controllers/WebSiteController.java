package com.WebsiteDownloader.WebsiteDownloader.Controllers;

import com.WebsiteDownloader.WebsiteDownloader.Services.DownloadService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WebSiteController {

    @GetMapping("/")
    public String mainPage() {
        return "test";
    }

    @GetMapping("/downloadByUrl/{url}")
    public String downloadByUrl(@PathVariable String url) throws IOException, InterruptedException {
        return DownloadService.downloadByUrl(url);
    }



}
