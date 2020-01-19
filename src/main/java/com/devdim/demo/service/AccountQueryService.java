package com.devdim.demo.service;

import java.util.List;

/**
 * created by Dima on 1/19/2020.
 */
public interface AccountQueryService {

    public List<Object> listEventsForAccount(String accountNumber);
}
