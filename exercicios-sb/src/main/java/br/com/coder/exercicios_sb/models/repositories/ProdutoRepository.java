package br.com.coder.exercicios_sb.models.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.coder.exercicios_sb.models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
    
}
