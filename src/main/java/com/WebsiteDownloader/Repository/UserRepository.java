package com.WebsiteDownloader.Repository;

import com.WebsiteDownloader.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Long> {
}
