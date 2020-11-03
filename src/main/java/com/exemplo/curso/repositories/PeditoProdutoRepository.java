package com.exemplo.curso.repositories;

import com.exemplo.curso.entities.PedidoProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeditoProdutoRepository extends JpaRepository<PedidoProduto, Long> {
}
