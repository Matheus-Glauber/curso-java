package com.exemplo.curso.resources;

import com.exemplo.curso.entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

    @GetMapping
    public ResponseEntity<Usuario> findAll(){
        Usuario usr = new Usuario(1L, "Maria", "maria@gmail.com", "81999999999", "123456");

        return ResponseEntity.ok().body(usr);
    }

}
