package com.example.v4.item.support;

import com.example.v4.item.support.exception.ItemNotFoundException;

import java.util.function.Supplier;

public class ItemExceptionSupplier {

    public static Supplier<ItemNotFoundException> itemNotFound(Long id) {
        return () -> new ItemNotFoundException(id);
    }
}