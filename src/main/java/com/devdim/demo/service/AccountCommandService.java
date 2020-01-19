package com.devdim.demo.service;

import com.devdim.demo.dto.AccountCreateDTO;
import com.devdim.demo.dto.MoneyCreditDTO;
import com.devdim.demo.dto.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

/**
 * created by Dima on 1/19/2020.
 */
public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
