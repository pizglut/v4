package com.example.v4.item.support.exception;

public class IndexNotFoundException extends RuntimeException {

    public IndexNotFoundException(Long id) {
        super(String.format("artykul with id %d not found", id));
    }
}