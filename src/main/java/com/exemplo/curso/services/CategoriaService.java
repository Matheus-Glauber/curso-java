package com.exemplo.curso.services;

import com.exemplo.curso.entities.Categoria;
import com.exemplo.curso.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll(){
        return categoriaRepository.findAll();
    }

    public Categoria findById(long id){
        Optional<Categoria> cat = categoriaRepository.findById(id);
        return cat.get();
    }

}
