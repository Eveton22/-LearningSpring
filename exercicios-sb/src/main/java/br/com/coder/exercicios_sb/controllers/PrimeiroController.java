package br.com.coder.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
    
    @GetMapping(path = "/ola")
    public String ola(){
        return "Olá spring Boot!";
    }

    
    @PostMapping(path = "/saudacao")
    public String saudacao(){
        return "Olá spring Boot! (POST)";
    }

    
}
