package com.example.v4.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class DataRezerwacjiRequest {

    private final String dataRezerwacji;

    @JsonCreator
    public DataRezerwacjiRequest(String dataRezerwacji) {
        this.dataRezerwacji = dataRezerwacji;
    }

    public String getDataRezerwacji() {
        return dataRezerwacji;
    }
}

