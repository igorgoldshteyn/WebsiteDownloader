package com.WebsiteDownloader.Services;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class SignInService {

    public String signIn(String login, String password) {
        if (Objects.equals(login, "") || Objects.equals(password, "")) {
            return "login or password is empty";
        } else {
            System.out.println("2");
            return "OK";
        }
    }

    public String passwordRecovery(String login, String password) {


        return "OK";
    }

    public static String signUp() {
        return "signUp";
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