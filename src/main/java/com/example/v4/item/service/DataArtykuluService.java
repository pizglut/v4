package com.example.v4.item.service;

import com.example.v4.item.api.request.DataArtykuluRequest;
import com.example.v4.item.api.request.UpdateDataArtykuluRequest;
import com.example.v4.item.api.response.DataArtykuluResponse;
import com.example.v4.item.domain.DataArtykulu;
import com.example.v4.item.repository.DataArtykuluRepository;
import com.example.v4.item.support.DataArtykuluExceptionSupplier;
import com.example.v4.item.support.DataArtykuluMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataArtykuluService {

    private final DataArtykuluRepository dataArtykuluRepository;
    private final DataArtykuluMapper dataArtykuluMapper;

    public DataArtykuluService(DataArtykuluRepository dataArtykuluRepository, DataArtykuluMapper dataArtykuluMapper) {
        this.dataArtykuluRepository = dataArtykuluRepository;
        this.dataArtykuluMapper = dataArtykuluMapper;
    }

    public DataArtykuluResponse create(DataArtykuluRequest dataArtykuluRequest) {
        DataArtykulu dataArtykulu = dataArtykuluRepository.save(dataArtykuluMapper.toDataArtykulu(dataArtykuluRequest));
        return dataArtykuluMapper.toDataArtykuluResponse(dataArtykulu);
    }

    public DataArtykuluResponse find(Long id) {
        DataArtykulu dataArtykulu = dataArtykuluRepository.findById(id).orElseThrow(DataArtykuluExceptionSupplier.dataArtykuluNotFound(id));
        return dataArtykuluMapper.toDataArtykuluResponse(dataArtykulu);
    }

    public List<DataArtykuluResponse> findAll() {
        return dataArtykuluRepository.findAll().stream().map(dataArtykuluMapper::toDataArtykuluResponse).collect(Collectors.toList());
    }

    public DataArtykuluResponse update(UpdateDataArtykuluRequest updateDataArtykuluRequest) {
        DataArtykulu dataArtykulu = dataArtykuluRepository.findById(updateDataArtykuluRequest.getId()).orElseThrow(
                DataArtykuluExceptionSupplier.dataArtykuluNotFound(updateDataArtykuluRequest.getId()));
        dataArtykuluRepository.save(dataArtykuluMapper.toDataArtykulu(dataArtykulu, updateDataArtykuluRequest));
        return dataArtykuluMapper.toDataArtykuluResponse(dataArtykulu);
    }

    public DataArtykuluResponse updateAlternativeVersion(Long id, UpdateDataArtykuluRequest updateDataArtykuluRequest) {
        DataArtykulu dataArtykulu = dataArtykuluRepository.findById(id).orElseThrow(
                DataArtykuluExceptionSupplier.dataArtykuluNotFound(id));
        dataArtykuluRepository.save(dataArtykuluMapper.toDataArtykulu(dataArtykulu, updateDataArtykuluRequest));
        return dataArtykuluMapper.toDataArtykuluResponse(dataArtykulu);
    }

    public void delete(Long id) {
        DataArtykulu dataArtykulu = dataArtykuluRepository.findById(id).orElseThrow(DataArtykuluExceptionSupplier.dataArtykuluNotFound(id));
        dataArtykuluRepository.deleteById(dataArtykulu.getId());
    }
}
