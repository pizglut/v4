package com.example.v4.item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "artykuly")

public class Artykuly {

    @Id
    @GeneratedValue
    private Long id;
    private String artykul;

    private String kategori;

    private String dataRezerwacji;

    public Artykuly() {
    }

    public Artykuly(String artykul, String kategoria, String dataRezerwacji) {
        this.artykul = artykul;
        this.kategori = kategoria ;
        this.dataRezerwacji = dataRezerwacji ;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setArtykul(String artykul) {
        this.artykul = artykul;
    }

    public String getArtykul() {
        return artykul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getDataRezerwacji() {
        return dataRezerwacji;
    }

    public void setDataRezerwacji(String dataRezerwacji) {
        this.dataRezerwacji = dataRezerwacji;
    }
}

