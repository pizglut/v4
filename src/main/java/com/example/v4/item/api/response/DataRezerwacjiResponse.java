package com.example.v4.item.api.response;

public class DataRezerwacjiResponse {

    private final Long id;
    private final String dataRezerwacji;

    public DataRezerwacjiResponse(Long id, String dataRezerwacji) {
        this.id = id;
        this.dataRezerwacji = dataRezerwacji;
    }

    public Long getId() {
        return id;
    }

    public String getDataRezerwacji() {
        return dataRezerwacji;
    }
}

