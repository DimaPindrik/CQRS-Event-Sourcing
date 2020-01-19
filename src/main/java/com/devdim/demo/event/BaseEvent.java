package com.devdim.demo.event;

/**
 * created by Dima on 1/19/2020.
 */
public class BaseEvent<T> {

    public final T id;

    public BaseEvent(T id) {
        this.id = id;
    }
}
