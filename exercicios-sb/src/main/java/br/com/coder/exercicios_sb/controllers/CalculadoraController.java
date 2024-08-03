package br.com.coder.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
@RequestMapping("/calcular")
public class CalculadoraController {
    
    //Calculadora/somar/10/20
    @GetMapping("/somar/{a}/{b}")
    public int Somar(@PathVariable int a, int b){
        int somados = a + b;
        return somados;
        
    }
    //calculadora/subtrair/10/20
    @GetMapping("/{valor}")
    public int subtrair(int b, int a){
        return a - b;
    }
}
