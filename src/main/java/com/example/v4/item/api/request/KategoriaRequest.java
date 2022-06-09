package com.example.v4.item.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class KategoriaRequest {

    private final String kategoria;

    @JsonCreator
    public KategoriaRequest(String kategoria) {
        this.kategoria = kategoria;
    }

    public String getKategoria() {
        return kategoria;
    }
}


