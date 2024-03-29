package com.example.springjpa.service;

import com.example.springjpa.model.entity.Account;
import com.example.springjpa.model.request.AccountLogin;
import com.example.springjpa.model.request.AccountRequest;
import com.example.springjpa.model.response.AccountProfileResponse;
import com.example.springjpa.model.response.AccountResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class AccountServiceImpl implements IAccountService {

//    @Autowired
//    private AccountRepository repository;
//
//    @Override
//    public Account getAccount(Long id) {
//        return null;
//    }
//
//    @Override
//    public List<Account> getAll() {
//        return repository.findAll();
//    }
//
//    @Override
//    public Account login(AccountLogin request) {
//        Optional<Account> account = repository.findByUsernameAndPassword(request.getUsername(), request.getPassword());
//        if (account.isEmpty()) {
//            log.error("username and password are not match");
//            return null;
//        }
//        return account.get();
//    }
//
//    @Override
//    public Account create(AccountRequest request) {
//        Account account = new Account();
//        account.setName(request.getName());
//        account.setUsername(request.getUsername());
//        account.setPassword(request.getPassword());
//        account.setProfileId(request.getProfileId());
//        repository.save(account);
//        return account;
//    }
//
//    @Override
//    public Account getAccountByUsernameAndName(String username, String name) {
//        return repository.findCustomizeAccountSecond(username, name);
//    }
//
//    @Override
//    public AccountResponse getAccountByUsernameAndNameInterface(String username, String name) {
//        return repository.findCustomizeAccount4th(username, name);
//    }
//
//    @Override
//    public AccountProfileResponse loginFullInfo(AccountLogin login) {
//        return repository.findAccountProfile(login.getUsername(), login.getPassword());
//    }
//
//
//}
}
