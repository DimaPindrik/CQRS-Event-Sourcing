package com.devdim.demo.event;

import com.devdim.demo.enums.Status;

/**
 * created by Dima on 1/19/2020.
 */
public class AccountActivatedEvent extends BaseEvent<String> {

    public final Status status;

    public AccountActivatedEvent(String id, Status status) {
        super(id);
        this.status = status;
    }
}
