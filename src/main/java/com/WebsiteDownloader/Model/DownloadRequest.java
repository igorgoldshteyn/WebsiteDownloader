package com.WebsiteDownloader.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;

public class DownloadRequest {

    private Integer id;
    private String requestUrl;
    private User user;
    private LocalDateTime date;
}