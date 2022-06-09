package com.example.v4.item.support;

import com.example.v4.item.support.exception.DataRezerwacjiNotFoundException;


import java.util.function.Supplier;

public class DataRezerwacjiExceptionSupplier {

    public static Supplier<DataRezerwacjiNotFoundException> dataRezerwacjiNotFound(Long id) {
        return () -> new DataRezerwacjiNotFoundException(id);
    }
}
