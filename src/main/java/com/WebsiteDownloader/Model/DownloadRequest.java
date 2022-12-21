package com.WebsiteDownloader.Model;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class DownloadRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String requestUrl;
//    private User user;
    private LocalDateTime date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}