package com.exemplo.curso.repositories;

import com.exemplo.curso.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



}
