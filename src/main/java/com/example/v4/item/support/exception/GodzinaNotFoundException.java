package com.example.v4.item.support.exception;

public class GodzinaNotFoundException extends RuntimeException{

    public GodzinaNotFoundException(Long id) {
        super(String.format("Godzina with id %d not found", id));
    }
}
