package com.example.v4.item.support;

import com.example.v4.item.api.request.ImieRequest;
import com.example.v4.item.api.request.UpdateImieRequest;
import com.example.v4.item.api.response.ImieResponse;
import com.example.v4.item.domain.Imie;
import org.springframework.stereotype.Component;

@Component
public class ImieMapper {

    public Imie toImie(ImieRequest imieRequest) {
        return new Imie(imieRequest.getImie());
    }

    public Imie toImie(Imie imie, UpdateImieRequest imieRequest) {
        imie.setImie(imieRequest.getImie());
        return imie;
    }

    public ImieResponse toImieResponse(Imie imie) {
        return new ImieResponse(imie.getId(), imie.getImie());
    }
}

