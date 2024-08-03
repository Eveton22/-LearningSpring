package br.com.coder.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.coder.exercicios_sb.models.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    
    @GetMapping("/qualquer")
    public Cliente obterCliente(){
        return new Cliente(24, "Pedro", "233.223.333-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId(@PathVariable int id){
        return new Cliente(id, "Maria", "878.878.789-90");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id){
        return new Cliente(id, "Joao Augusto", "878.878.789-90");
    }

    
}

