package com.example.v4.item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "klient")

public class Rezerwacja {

    @Id
    @GeneratedValue
    private Long id;

    private String dataRezerwacji;

    private String godzina;

    private String klient_id;

    public Rezerwacja() {
    }

    public Rezerwacja(String dataRezerwacji, String godzina, String klient_id) {
        this.dataRezerwacji = dataRezerwacji;
        this.godzina = godzina;
        this.klient_id = klient_id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDataRezerwacji() {
        return dataRezerwacji;
    }

    public void setDataRezerwacji(String dataRezerwacji) {
        this.dataRezerwacji = dataRezerwacji;
    }

    public String getGodzina() {
        return godzina;
    }

    public void setGodzina(String godzina) {
        this.godzina = godzina;
    }

    public String getKlient_id() {
        return klient_id;
    }

    public void setKlient_id(String klient_id) {
        this.klient_id = klient_id;
    }
}

