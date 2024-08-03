package br.com.coder.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetofosHttpController {

    @GetMapping
    public String get(){
        return "Requisicao GET";
    }

    @PostMapping
    public String post(){
        return "Requisicao POST";
    }

    @PutMapping
    public String put(){
        return "Requisicao PUT";
    }

    public String delete(){
        return "Requisicao DELETE";
    }

    public String patch(){
        return "Requisicao GET PATCH";
    }


}
