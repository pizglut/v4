package com.example.v4.item.support;

import com.example.v4.item.api.request.GodzinaRequest;
import com.example.v4.item.api.request.UpdateGodzinaRequest;
import com.example.v4.item.api.response.GodzinaResponse;
import com.example.v4.item.domain.Godzina;
import org.springframework.stereotype.Component;

@Component
public class GodzinaMapper {

    public Godzina toGodzina(GodzinaRequest godzinaRequest) {
        return new Godzina(godzinaRequest.getGodzina());
    }

    public Godzina toGodzina(Godzina godzina, UpdateGodzinaRequest godzinaRequest) {
        godzina.setGodzina(godzinaRequest.getGodzina());
        return godzina;
    }

    public GodzinaResponse toGodzinaResponse(Godzina godzina) {
        return new GodzinaResponse(godzina.getId(), godzina.getGodzina());
    }
}

