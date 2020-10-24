package com.exemplo.curso.config;

import com.exemplo.curso.entities.Pedido;
import com.exemplo.curso.entities.Usuario;
import com.exemplo.curso.repositories.PedidoRepository;
import com.exemplo.curso.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("teste")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public void run(String... args) throws Exception {

        Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Pedido p1 = new Pedido(null, Instant.parse("2020-10-24T00:52:07Z"), u1);
        Pedido p2 = new Pedido(null, Instant.parse("2020-10-24T00:54:35Z"), u2);
        Pedido p3 = new Pedido(null, Instant.parse("2020-10-24T00:55:11Z"), u1);

        usuarioRepository.saveAll(Arrays.asList(u1, u2));
        pedidoRepository.saveAll(Arrays.asList(p1, p2, p3));

    }
}
