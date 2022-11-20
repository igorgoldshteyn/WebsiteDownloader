package com.WebsiteDownloader.WebsiteDownloader.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSiteController {

    @GetMapping("/")
    public String mainPage() {
return "test";
    }



}
