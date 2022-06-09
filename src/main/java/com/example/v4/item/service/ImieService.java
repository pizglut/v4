package com.example.v4.item.service;

import com.example.v4.item.api.request.ImieRequest;
import com.example.v4.item.api.request.UpdateImieRequest;
import com.example.v4.item.api.response.ImieResponse;
import com.example.v4.item.domain.Imie;
import com.example.v4.item.repository.ImieRepository;
import com.example.v4.item.support.ImieExceptionSupplier;
import com.example.v4.item.support.ImieMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImieService {

    private final ImieRepository imieRepository;
    private final ImieMapper imieMapper;

    public ImieService(ImieRepository imieRepository, ImieMapper imieMapper) {
        this.imieRepository = imieRepository;
        this.imieMapper = imieMapper;
    }

    public ImieResponse create(ImieRequest imieRequest) {
        Imie imie = imieRepository.save(imieMapper.toImie(imieRequest));
        return imieMapper.toImieResponse(imie);
    }

    public ImieResponse find(Long id) {
        Imie imie = imieRepository.findById(id).orElseThrow(ImieExceptionSupplier.imieNotFound(id));
        return imieMapper.toImieResponse(imie);
    }

    public List<ImieResponse> findAll() {
        return imieRepository.findAll().stream().map(imieMapper::toImieResponse).collect(Collectors.toList());
    }

    public ImieResponse update(UpdateImieRequest updateImieRequest) {
        Imie imie = imieRepository.findById(updateImieRequest.getId()).orElseThrow(
                ImieExceptionSupplier.imieNotFound(updateImieRequest.getId()));
        imieRepository.save(imieMapper.toImie(imie, updateImieRequest));
        return imieMapper.toImieResponse(imie);
    }

    public ImieResponse updateAlternativeVersion(Long id, UpdateImieRequest updateImieRequest) {
        Imie imie = imieRepository.findById(id).orElseThrow(
                ImieExceptionSupplier.imieNotFound(id));
        imieRepository.save(imieMapper.toImie(imie, updateImieRequest));
        return imieMapper.toImieResponse(imie);
    }

    public void delete(Long id) {
        Imie imie = imieRepository.findById(id).orElseThrow(ImieExceptionSupplier.imieNotFound(id));
        imieRepository.deleteById(imie.getId());
    }
}

