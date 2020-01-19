package com.devdim.demo.controller;

import com.devdim.demo.dto.AccountCreateDTO;
import com.devdim.demo.dto.MoneyCreditDTO;
import com.devdim.demo.dto.MoneyDebitDTO;
import com.devdim.demo.service.AccountCommandService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

/**
 * created by Dima on 1/19/2020.
 */
@RestController
@RequestMapping("/bank-accounts")
@Api(value = "Account Commands",
        description = "Account Commands Related Endpoints",
        tags = "Account Commands")
public class AccountCommandController {

    private final AccountCommandService accountCommandService;

    public AccountCommandController(AccountCommandService accountCommandService) {
        this.accountCommandService = accountCommandService;
    }

    @PostMapping
    public CompletableFuture<String> createAccount(@RequestBody AccountCreateDTO accountCreateDTO) {
        return accountCommandService.createAccount(accountCreateDTO);
    }

    @PutMapping("/credits/{accountNumber}")
    public CompletableFuture<String> creditMoneyToAccount(@PathVariable("accountNumber") String accountNumber,
                                                          @RequestBody MoneyCreditDTO moneyCreditDTO) {
        return accountCommandService.creditMoneyToAccount(accountNumber, moneyCreditDTO);
    }

    @PutMapping("/debits/{accountNumber}")
    public CompletableFuture<String> debitMoneyFromAccount(@PathVariable("accountNumber") String accountNumber,
                                                           @RequestBody MoneyDebitDTO moneyDebitDTO) {
        return accountCommandService.debitMoneyFromAccount(accountNumber, moneyDebitDTO);
    }
}