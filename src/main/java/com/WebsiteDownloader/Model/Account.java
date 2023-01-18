package com.WebsiteDownloader.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "accounts")
public class Account {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String address;
    private String login;
    private String password;


}
