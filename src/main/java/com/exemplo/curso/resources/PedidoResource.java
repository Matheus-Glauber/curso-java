package com.exemplo.curso.resources;

import com.exemplo.curso.entities.Pedido;
import com.exemplo.curso.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<Pedido>> findAll() {
        List<Pedido> listaDePedidos = pedidoService.findAll();
        return ResponseEntity.ok().body(listaDePedidos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedido> findById(@PathVariable long id) {
        Pedido ped = pedidoService.findById(id);
        return ResponseEntity.ok().body(ped);
    }

}
