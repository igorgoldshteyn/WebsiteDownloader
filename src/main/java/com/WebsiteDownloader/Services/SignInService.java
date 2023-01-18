package com.WebsiteDownloader.Services;

import com.WebsiteDownloader.Model.Account;
import com.WebsiteDownloader.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class SignInService {
    final AccountRepository repository;


    SignInService(AccountRepository repository) {
        this.repository = repository;
    }

    public Boolean signIn(String login, String password) {

        Iterable<Account> allAccounts = repository.findAll(); //????

//        (List<Account>) repository.findAll()

        System.out.println(allAccounts);
        System.out.println(allAccounts.toString());

        //finding in a database


        if (login.equals("test") && password.equals("test")) {
            return true;
        } else {
            return false;
        }
    }

    public String passwordRecovery(String login, String password) {
        return "OK";
    }

    public boolean signUp() {
        return true;
    }


//    private String generate(String password) {
//
//        //не менее 8 символов;
//        //не более 128 символов;
//        //как минимум одна заглавная и одна строчная буква;
//        //только латинские или кириллические буквы;
//        //как минимум одна цифра;
//        //только арабские цифры;
//        //без пробелов;
//        //Другие допустимые символы:~ ! ? @ # $ % ^ & * _ - + ( ) [ ] { } > < / \ | " ' . , : ;
//
//        boolean passwordPasses = false;
//        String[] generatedPassword = new String[8];
//
//        while (passwordPasses != true) {
//
//            if (generatedPassword.length < 8 || generatedPassword.length > 128) {
//                passwordPasses = true;
//
//            } else {
//
//            }
//
//        }
//
//
//        return "OK";
//    }


}