package com.example.v4.item.support;

import com.example.v4.item.support.exception.DataArtykuluNotFoundException;

import java.util.function.Supplier;

public class DataArtykuluExceptionSupplier {

    public static Supplier<DataArtykuluNotFoundException> dataArtykuluNotFound(Long id) {
        return () -> new DataArtykuluNotFoundException(id);
    }

}
