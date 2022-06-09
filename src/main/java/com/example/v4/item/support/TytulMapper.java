package com.example.v4.item.support;

import com.example.v4.item.api.request.TytulRequest;
import com.example.v4.item.api.request.UpdateTytulRequest;
import com.example.v4.item.api.response.TytulResponse;
import com.example.v4.item.domain.Tytul;
import org.springframework.stereotype.Component;

@Component
public class TytulMapper {

    public Tytul toTytul(TytulRequest tytulRequest) {
        return new Tytul(tytulRequest.getTytul());
    }

    public Tytul toTytul(Tytul tytul, UpdateTytulRequest tytulRequest) {
        tytul.setTytul(tytulRequest.getTytul());
        return tytul;
    }

    public TytulResponse toTytulResponse(Tytul tytul) {
        return new TytulResponse(tytul.getId(), tytul.getTytul());
    }
}

