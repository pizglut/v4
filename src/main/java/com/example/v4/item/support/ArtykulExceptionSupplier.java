package com.example.v4.item.support;

import com.example.v4.item.support.exception.ArtykulNotFoundException;

import java.util.function.Supplier;

public class ArtykulExceptionSupplier {

    public static Supplier<ArtykulNotFoundException> artykulNotFound(Long id) {
        return () -> new ArtykulNotFoundException(id);
    }
}
