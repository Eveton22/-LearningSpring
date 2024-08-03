package br.com.coder.exercicios_sb.controllers;

import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.coder.exercicios_sb.models.entities.Produto;
import br.com.coder.exercicios_sb.models.repositories.ProdutoRepository;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/produtos")
public class ProdudoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    

    @PostMapping
    @RequestMapping(method= {RequestMethod.PUT, RequestMethod.POST})
    public @ResponseBody Produto novoProduto(Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/pagina/{numero}")
    public Iterable<Produto> obterProdutosPorPagina(@PathVarible int numero) {
        Pageable page = PageRequest.of(0, 3);
        return produtoRepository.findAll(page);
    }

    @GetMapping(path="/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }

    @PutMapping
    public Produto alterarProduto(Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @DeleteMapping(path="/{id}")
    public void deletarProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
        
    }

}

