package com.WebsiteDownloader.WebsiteDownloader.Repository;

import com.WebsiteDownloader.WebsiteDownloader.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
