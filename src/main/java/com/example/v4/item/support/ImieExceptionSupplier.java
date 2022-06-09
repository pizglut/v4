package com.example.v4.item.support;

import com.example.v4.item.support.exception.ImieNotFoundException;

import java.util.function.Supplier;

public class ImieExceptionSupplier {

    public static Supplier<ImieNotFoundException> imieNotFound(Long id) {
        return () -> new ImieNotFoundException(id);
    }
}
