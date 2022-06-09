package com.example.v4.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UpdateEmailRequest extends EmailRequest{

    private final Long id;

    @JsonCreator
    public UpdateEmailRequest(String email, Long id) {
        super(email);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}