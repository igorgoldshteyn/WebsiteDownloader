package com.WebsiteDownloader.Controllers;

import com.WebsiteDownloader.Services.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignInController {
    @Autowired
    SignInService signInService;

    @GetMapping("/signIn")
    public boolean signIn(@RequestParam String login, @RequestParam String password) {
        return signInService.signIn(login, password);
    }

    @PostMapping("/signUp")
    public boolean signUp() {
        return signInService.signUp();

    }


}
