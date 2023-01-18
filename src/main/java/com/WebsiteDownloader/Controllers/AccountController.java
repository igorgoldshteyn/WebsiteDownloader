package com.WebsiteDownloader.Controllers;

import com.WebsiteDownloader.Model.Account;
import com.WebsiteDownloader.Repository.AccountRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class AccountController {

    private final AccountRepository repository;

    AccountController(AccountRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/accounts")
    List<Account> getAllAccounts() {
        return (List<Account>) repository.findAll();
    }

    @GetMapping("/accounts/{id}")
    Account getAccountById(@RequestParam Long id) {
        return repository.findById(id).orElseThrow(RuntimeException::new);

    }

    @PostMapping("accounts/add")
    public ResponseEntity createAccount(@RequestBody Account account) throws URISyntaxException {
        Account savedAccount = repository.save(account);

        return ResponseEntity.created(new URI("/clients/" + savedAccount.getId())).body(savedAccount);
    }

    @PutMapping("/accounts/")
    public ResponseEntity updateUser(@RequestBody Account account) {
        Account currentAccount = repository.findById(account.getId()).orElseThrow(RuntimeException::new);

        currentAccount.setName(account.getName());
        currentAccount.setEmail(account.getEmail());
        currentAccount.setLogin(account.getLogin());
        currentAccount.setPassword(account.getPassword());
        currentAccount.setAddress(account.getAddress());
        currentAccount = repository.save(account);

        return ResponseEntity.ok(currentAccount);
    }

    @DeleteMapping("/accounts/")
    public ResponseEntity deleteAccount(@RequestParam Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
