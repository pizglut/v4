package com.example.v4.item.service;

import com.example.v4.item.api.request.ArtykulRequest;
import com.example.v4.item.api.request.UpdateArtykulRequest;
import com.example.v4.item.api.response.ArtykulResponse;
import com.example.v4.item.domain.Artykul;
import com.example.v4.item.repository.ArtykulRepository;
import com.example.v4.item.support.ArtykulExceptionSupplier;
import com.example.v4.item.support.ArtykulMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtykulService {

    private final ArtykulRepository artykulRepository;
    private final ArtykulMapper artykulMapper;

    public ArtykulService(ArtykulRepository artykulRepository, ArtykulMapper artykulMapper) {
        this.artykulRepository = artykulRepository;
        this.artykulMapper = artykulMapper;
    }

    public ArtykulResponse create(ArtykulRequest artykulRequest) {
        Artykul artykul = artykulRepository.save(artykulMapper.toArtykul(artykulRequest));
        return artykulMapper.toArtykulResponse(artykul);
    }

    public ArtykulResponse find(Long id) {
        Artykul artykul = artykulRepository.findById(id).orElseThrow(ArtykulExceptionSupplier.artykulNotFound(id));
        return artykulMapper.toArtykulResponse(artykul);
    }

    public List<ArtykulResponse> findAll() {
        return artykulRepository.findAll().stream().map(artykulMapper::toArtykulResponse).collect(Collectors.toList());
    }

    public ArtykulResponse update(UpdateArtykulRequest updateArtykulRequest) {
        Artykul artykul = artykulRepository.findById(updateArtykulRequest.getId()).orElseThrow(
                ArtykulExceptionSupplier.artykulNotFound(updateArtykulRequest.getId()));
        artykulRepository.save(artykulMapper.toArtykul(artykul, updateArtykulRequest));
        return artykulMapper.toArtykulResponse(artykul);
    }

    public ArtykulResponse updateAlternativeVersion(Long id, UpdateArtykulRequest updateArtykulRequest) {
        Artykul artykul = artykulRepository.findById(id).orElseThrow(
                ArtykulExceptionSupplier.artykulNotFound(id));
        artykulRepository.save(artykulMapper.toArtykul(artykul, updateArtykulRequest));
        return artykulMapper.toArtykulResponse(artykul);
    }

    public void delete(Long id) {
        Artykul artykul = artykulRepository.findById(id).orElseThrow(ArtykulExceptionSupplier.artykulNotFound(id));
        artykulRepository.deleteById(artykul.getId());
    }
}

