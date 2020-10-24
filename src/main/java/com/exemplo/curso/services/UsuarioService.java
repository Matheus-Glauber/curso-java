package com.exemplo.curso.services;

import com.exemplo.curso.entities.Usuario;
import com.exemplo.curso.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Usuario findById(long id){
        Optional<Usuario> usr = usuarioRepository.findById(id);
        return usr.get();
    }

}
