package com.example.v4.item.support;

import com.example.v4.item.support.exception.EmailNotFoundException;

import java.util.function.Supplier;

public class EmailExceptionSupplier {

    public static Supplier<EmailNotFoundException> emailNotFound(Long id) {
        return () -> new EmailNotFoundException(id);
    }
}
