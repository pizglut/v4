package com.example.v4.item.support;

import com.example.v4.item.api.request.DataRezerwacjiRequest;
import com.example.v4.item.api.request.UpdateDataRezerwacjiRequest;
import com.example.v4.item.api.response.DataRezerwacjiResponse;
import com.example.v4.item.domain.DataRezerwacji;
import org.springframework.stereotype.Component;

@Component
public class DataRezerwacjiMapper {

    public DataRezerwacji toDataRezerwacji(DataRezerwacjiRequest dataRezerwacjiRequest) {
        return new DataRezerwacji(dataRezerwacjiRequest.getDataRezerwacji());
    }

    public DataRezerwacji toDataRezerwacji(DataRezerwacji dataRezerwacji, UpdateDataRezerwacjiRequest dataRezerwacjiRequest) {
        dataRezerwacji.setDataRezerwacji(dataRezerwacjiRequest.getDataRezerwacji());
        return dataRezerwacji;
    }

    public DataRezerwacjiResponse toDataRezerwacjiResponse(DataRezerwacji dataRezerwacji) {
        return new DataRezerwacjiResponse(dataRezerwacji.getId(), dataRezerwacji.getDataRezerwacji());
    }
}

