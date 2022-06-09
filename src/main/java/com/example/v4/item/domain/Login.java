package com.example.v4.item.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "klient")

public class Login {

    @Id
    @GeneratedValue
    private Long id;

    private String login;

    private String haslo;

    public Login() {
    }

    public Login(String login, String haslo) {
        this.login = login;
        this.haslo = haslo;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
}

