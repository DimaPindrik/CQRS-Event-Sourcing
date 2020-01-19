package com.devdim.demo.command;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

/**
 * created by Dima on 1/19/2020.
 */
public class BaseCommand<T> {

    @TargetAggregateIdentifier
    public final T id;

    public BaseCommand(T id) {
        this.id = id;
    }
}
