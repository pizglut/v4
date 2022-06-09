package com.example.v4.item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "klient")

public class Klient {

    @Id
    @GeneratedValue
    private Long id;

    private String imie;

    private String nazwisko;

    private String email;

    private String tel;

    public Klient() {
    }

    public Klient(String imie, String nazwisko, String email, String tel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.tel = tel;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}

