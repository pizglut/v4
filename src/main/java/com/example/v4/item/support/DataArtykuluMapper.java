package com.example.v4.item.support;

import com.example.v4.item.api.request.DataArtykuluRequest;
import com.example.v4.item.api.request.UpdateDataArtykuluRequest;
import com.example.v4.item.api.response.DataArtykuluResponse;
import com.example.v4.item.domain.DataArtykulu;
import org.springframework.stereotype.Component;

@Component
public class DataArtykuluMapper {

    public DataArtykulu toDataArtykulu(DataArtykuluRequest dataArtykuluRequest) {
        return new DataArtykulu(dataArtykuluRequest.getDataArtykulu());
    }

    public DataArtykulu toDataArtykulu(DataArtykulu dataArtykulu, UpdateDataArtykuluRequest dataArtykuluRequest) {
        dataArtykulu.setDataArtykulu(dataArtykuluRequest.getDataArtykulu());
        return dataArtykulu;
    }

    public DataArtykuluResponse toDataArtykuluResponse(DataArtykulu dataArtykulu) {
        return new DataArtykuluResponse(dataArtykulu.getId(), dataArtykulu.getDataArtykulu());
    }
}