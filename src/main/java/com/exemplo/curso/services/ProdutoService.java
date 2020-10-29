package com.exemplo.curso.services;

import com.exemplo.curso.entities.Produto;
import com.exemplo.curso.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto findById(long id){
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.get();
    }

}
