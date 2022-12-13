package com.WebsiteDownloader.Controllers;

import com.WebsiteDownloader.Model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/testTEXT")
    String getAllUsers() {
        return"sdfwsdf";
    }


    @PostMapping("/add")
    public ResponseEntity createUser() throws URISyntaxException {
        return ResponseEntity.created(new URI("/clients/" )).body("sdf");
    }
}
