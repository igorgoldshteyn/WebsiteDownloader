package com.WebsiteDownloader.Repository;

import com.WebsiteDownloader.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
