package com.WebsiteDownloader.Services;

import com.WebsiteDownloader.WebsiteDownloaderApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
class LoginService {

    public String SignIn(String login, String password) {


        return "OK";
    }

    public String passwordRecovery(String login, String password) {


        return "OK";
    }

    public static String signUp() {
        return "ok";
    }

    private String checkPasswordStrength(String password) {

        return "OK";
    }

    private String generate(String password) {

        //не менее 8 символов;
        //не более 128 символов;
        //как минимум одна заглавная и одна строчная буква;
        //только латинские или кириллические буквы;
        //как минимум одна цифра;
        //только арабские цифры;
        //без пробелов;
        //Другие допустимые символы:~ ! ? @ # $ % ^ & * _ - + ( ) [ ] { } > < / \ | " ' . , : ;

        boolean passwordPasses = false;
        String[] generatedPassword = new String[8];

        while (passwordPasses != true) {

            if (generatedPassword.length < 8 || generatedPassword.length > 128) {
                passwordPasses = true;

            } else {

            }

        }


        return "OK";
    }


}