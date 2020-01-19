package com.devdim.demo.controller;

import com.devdim.demo.service.AccountQueryService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by Dima on 1/19/2020.
 */
@RestController
@RequestMapping("/bank-accounts")
@Api(value = "Account Queries",
        description = "Account Query Events Endpoint",
        tags = "Account Queries")
public class AccountQueryController {

    private final AccountQueryService accountQueryService;

    public AccountQueryController(AccountQueryService accountQueryService) {
        this.accountQueryService = accountQueryService;
    }

    @GetMapping("/{accountNumber}/events")
    public List<Object> listEventsForAccount(@PathVariable("accountNumber") String accountNumber) {
        return accountQueryService.listEventsForAccount(accountNumber);
    }
}