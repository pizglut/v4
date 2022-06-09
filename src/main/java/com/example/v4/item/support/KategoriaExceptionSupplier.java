package com.example.v4.item.support;

import com.example.v4.item.support.exception.KategoriaNotFoundException;

import java.util.function.Supplier;

public class KategoriaExceptionSupplier {

    public static Supplier<KategoriaNotFoundException> kategoriaNotFound(Long id) {
        return () -> new KategoriaNotFoundException(id);
    }
}
