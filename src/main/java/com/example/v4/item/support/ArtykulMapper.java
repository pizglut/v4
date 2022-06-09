package com.example.v4.item.support;

import com.example.v4.item.api.request.ArtykulRequest;
import com.example.v4.item.api.request.UpdateArtykulRequest;
import com.example.v4.item.api.response.ArtykulResponse;
import com.example.v4.item.domain.Artykul;
import org.springframework.stereotype.Component;

@Component
public class ArtykulMapper {

    public Artykul toArtykul(ArtykulRequest artykulRequest) {
        return new Artykul(artykulRequest.getArtykul());
    }

    public Artykul toArtykul(Artykul artykul, UpdateArtykulRequest artykulRequest) {
        artykul.setArtykul(artykulRequest.getArtykul());
        return artykul;
    }

    public ArtykulResponse toArtykulResponse(Artykul artykul) {
        return new ArtykulResponse(artykul.getId(), artykul.getArtykul());
    }
}
