package com.chaikhona24.chaikhona24.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebSiteController {

    @GetMapping("/")
    public String mainPage() {
        return "mainPage";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }


}
