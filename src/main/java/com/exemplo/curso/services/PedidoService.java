package com.exemplo.curso.services;

import com.exemplo.curso.entities.Pedido;
import com.exemplo.curso.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    public Pedido findById(long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);

        return pedido.get();
    }

}
