package com.example.v4.item.support;

import com.example.v4.item.api.request.KategoriaRequest;
import com.example.v4.item.api.request.UpdateKategoriaRequest;
import com.example.v4.item.api.response.KategoriaResponse;
import com.example.v4.item.domain.Kategoria;
import org.springframework.stereotype.Component;

@Component
public class KategoriaMapper {

    public Kategoria toKategoria(KategoriaRequest kategoriaRequest) {
        return new Kategoria(kategoriaRequest.getKategoria());
    }

    public Kategoria toKategoria(Kategoria kategoria, UpdateKategoriaRequest kategoriaRequest) {
        kategoria.setKategoria(kategoriaRequest.getKategoria());
        return kategoria;
    }

    public KategoriaResponse toKategoriaResponse(Kategoria kategoria) {
        return new KategoriaResponse(kategoria.getId(), kategoria.getKategoria());
    }
}

