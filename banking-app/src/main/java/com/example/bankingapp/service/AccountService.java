package com.example.bankingapp.service;

import com.example.bankingapp.Dto.AccountDto;

import java.util.List;

public interface AccountService{

    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withDraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);


}
