package com.example.v4.item.support;


import com.example.v4.item.support.exception.TytulNotFoundException;

import java.util.function.Supplier;

public class TytulExceptionSupplier {

    public static Supplier<TytulNotFoundException> tytulNotFound(Long id) {
        return () -> new TytulNotFoundException(id);
    }
}
