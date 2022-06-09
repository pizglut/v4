package com.example.v4.item.support.exception;

public class RezerwacjeNotFoundException extends RuntimeException {

    public RezerwacjeNotFoundException(Long id) {
        super(String.format("Rezerwacje with id %d not found", id));
    }
}
