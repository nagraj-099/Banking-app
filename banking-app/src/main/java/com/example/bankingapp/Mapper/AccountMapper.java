package com.example.bankingapp.Mapper;

import com.example.bankingapp.Dto.AccountDto;
import com.example.bankingapp.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {
        Account account = new Account(accountDto.getId(), accountDto.getAccountHolderName(),
                accountDto.getBalance());
        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(account.getId(),account.getAccountHolderName(),
                (long) account.getBalance());
        return accountDto;

    }
}