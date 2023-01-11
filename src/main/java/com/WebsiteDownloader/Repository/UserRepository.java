package com.WebsiteDownloader.Repository;

import com.WebsiteDownloader.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<Account,Long> {
}
