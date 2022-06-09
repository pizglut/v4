package com.example.v4.item.service;

import com.example.v4.item.api.request.KategoriaRequest;
import com.example.v4.item.api.request.UpdateKategoriaRequest;
import com.example.v4.item.api.response.KategoriaResponse;
import com.example.v4.item.domain.Kategoria;
import com.example.v4.item.repository.KategoriaRepository;
import com.example.v4.item.support.KategoriaExceptionSupplier;
import com.example.v4.item.support.KategoriaMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KategoriaService {

    private final KategoriaRepository kategoriaRepository;
    private final KategoriaMapper kategoriaMapper;

    public KategoriaService(KategoriaRepository kategoriaRepository, KategoriaMapper kategoriaMapper) {
        this.kategoriaRepository = kategoriaRepository;
        this.kategoriaMapper = kategoriaMapper;
    }

    public KategoriaResponse create(KategoriaRequest kategoriaRequest) {
        Kategoria kategoria = kategoriaRepository.save(kategoriaMapper.toKategoria(kategoriaRequest));
        return kategoriaMapper.toKategoriaResponse(kategoria);
    }

    public KategoriaResponse find(Long id) {
        Kategoria kategoria = kategoriaRepository.findById(id).orElseThrow(KategoriaExceptionSupplier.kategoriaNotFound(id));
        return kategoriaMapper.toKategoriaResponse(kategoria);
    }

    public List<KategoriaResponse> findAll() {
        return kategoriaRepository.findAll().stream().map(kategoriaMapper::toKategoriaResponse).collect(Collectors.toList());
    }

    public KategoriaResponse update(UpdateKategoriaRequest updateKategoriaRequest) {
        Kategoria kategoria = kategoriaRepository.findById(updateKategoriaRequest.getId()).orElseThrow(
                KategoriaExceptionSupplier.kategoriaNotFound(updateKategoriaRequest.getId()));
        kategoriaRepository.save(kategoriaMapper.toKategoria(kategoria, updateKategoriaRequest));
        return kategoriaMapper.toKategoriaResponse(kategoria);
    }

    public KategoriaResponse updateAlternativeVersion(Long id, UpdateKategoriaRequest updateKategoriaRequest) {
        Kategoria kategoria = kategoriaRepository.findById(id).orElseThrow(
                KategoriaExceptionSupplier.kategoriaNotFound(id));
        kategoriaRepository.save(kategoriaMapper.toKategoria(kategoria, updateKategoriaRequest));
        return kategoriaMapper.toKategoriaResponse(kategoria);
    }

    public void delete(Long id) {
        Kategoria kategoria = kategoriaRepository.findById(id).orElseThrow(KategoriaExceptionSupplier.kategoriaNotFound(id));
        kategoriaRepository.deleteById(kategoria.getId());
    }
}

