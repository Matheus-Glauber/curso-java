package com.exemplo.curso.resources;

import com.exemplo.curso.entities.Usuario;
import com.exemplo.curso.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> findAll(){
        List<Usuario> listaDeUsuarios = usuarioService.findAll();
        return ResponseEntity.ok().body(listaDeUsuarios);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable long id){
        Usuario usr = usuarioService.findById(id);
        return ResponseEntity.ok().body(usr);
    }

}
