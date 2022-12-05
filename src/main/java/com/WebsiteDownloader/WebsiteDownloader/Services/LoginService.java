package com.WebsiteDownloader.WebsiteDownloader.Services;

import com.WebsiteDownloader.WebsiteDownloader.WebsiteDownloaderApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
class LoginService{

    public  String SignIn(String login, String password){



        return"OK";
    }

    public String passwordRecovery(String login, String password){



        return"OK";
    }

    public static String signUp(){
        return "ok";
    }

    private String checkPasswordStrength(String password){

        return"OK";
    }




}