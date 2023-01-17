package com.WebsiteDownloader.Controllers;

//import com.WebsiteDownloader.Model.Account;
import com.WebsiteDownloader.Repository.AccountRepository;
import com.WebsiteDownloader.WebsiteDownloaderApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class AccountController {


//    private final AccountRepository repository;
//
//    AccountController(AccountRepository repository) {
//        this.repository = repository;
//    }
//    private static Logger logger = LoggerFactory.getLogger(WebsiteDownloaderApplication.class);
//
//
//    @GetMapping("/accounts")
//    List<Account> getAllAccounts() {
//        return (List<Account>) repository.findAll();
//    }
//
//    @GetMapping("/users/{id}")
//    Account getAccountById(@PathVariable Long id) {
//        return repository.findById(id).orElseThrow(RuntimeException::new); // поправить тут ошибку
//
//    }
//
//    @PostMapping("accounts/add")
//    public ResponseEntity createAccount(@RequestBody Account account) throws URISyntaxException {
//        Account savedAccount = repository.save(account);
//        return ResponseEntity.created(new URI("/clients/" + savedAccount.getId())).body(savedAccount);
//    }
//
//    @PutMapping("/users/{id}")
//    public ResponseEntity updateUser(@PathVariable Long id, @RequestBody Account account) {
//        Account currentAccount = repository.findById(id).orElseThrow(RuntimeException::new);
//        currentAccount.setName(account.getName());
//        currentAccount.setEmail(account.getEmail());
//        currentAccount = repository.save(account);
//
//        return ResponseEntity.ok(currentAccount);
//    }
//
//    @DeleteMapping("/users/{id}")
//    public ResponseEntity deleteAccount(@PathVariable Long id) {
//        repository.deleteById(id);
//        return ResponseEntity.ok().build();
//    }

}
