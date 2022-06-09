package com.example.v4.item.support;

import com.example.v4.item.support.exception.GodzinaNotFoundException;

import java.util.function.Supplier;

public class GodzinaExceptionSupplier {

    public static Supplier<GodzinaNotFoundException> godzinaNotFound(Long id) {
        return () -> new GodzinaNotFoundException(id);
    }
}
