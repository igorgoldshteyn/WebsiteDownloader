package com.WebsiteDownloader.Controllers;

import com.WebsiteDownloader.Services.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInController {
    @Autowired
    SignInService signInService;

    @PostMapping("/signIn")
    public String signIn(@RequestParam String login, @RequestParam String password) {
        return signInService.signIn(login, password);
    }

    @PostMapping("/signUp")
    public String signUp() {
        return signInService.signUp(); // repair
    }


}
