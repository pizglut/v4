package com.example.v4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GaleriaController {
    @GetMapping("/galeria")
    public String sayGaleria() {
        return "galeria";
    }
}
