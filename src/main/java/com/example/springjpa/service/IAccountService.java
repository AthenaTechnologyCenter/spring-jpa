package com.example.springjpa.service;

import com.example.springjpa.model.entity.Account;
import com.example.springjpa.model.request.AccountLogin;
import com.example.springjpa.model.request.AccountRequest;
import com.example.springjpa.model.response.AccountResponse;

import java.util.List;

public interface IAccountService {
    Account getAccount(Long id);

    List<Account> getAll();

    Account login(AccountLogin request);

    Account create(AccountRequest request);

    Account getAccountByUsernameAndName(String username, String name);

    AccountResponse getAccountByUsernameAndNameInterface(String username, String name);

}
