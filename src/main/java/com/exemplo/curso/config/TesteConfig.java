package com.exemplo.curso.config;

import com.exemplo.curso.entities.Categoria;
import com.exemplo.curso.entities.Pedido;
import com.exemplo.curso.entities.Produto;
import com.exemplo.curso.entities.Usuario;
import com.exemplo.curso.entities.enums.PedidoStatus;
import com.exemplo.curso.repositories.CategoriaRepository;
import com.exemplo.curso.repositories.PedidoRepository;
import com.exemplo.curso.repositories.ProdutoRepository;
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

    @Autowired
    CategoriaRepository categoriaRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {

        Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Pedido p1 = new Pedido(null, Instant.parse("2020-10-24T00:52:07Z"), PedidoStatus.PAGO, u1);
        Pedido p2 = new Pedido(null, Instant.parse("2020-10-24T00:54:35Z"), PedidoStatus.AGUARDANDO_PAGAMENTO, u2);
        Pedido p3 = new Pedido(null, Instant.parse("2020-10-24T00:55:11Z"), PedidoStatus.AGUARDANDO_PAGAMENTO, u1);

        Categoria c1 = new Categoria(null, "Eletrônico");
        Categoria c2 = new Categoria(null, "Livros");
        Categoria c3 = new Categoria(null, "Informática");

        Produto pr1 = new Produto(null, "Harry Potter", "Livro sobre bruxos ingleses", 35.0, "");
        Produto pr2 = new Produto(null, "LeNovo Ideapad 330", "Melhor custo x beneficio", 3100.99, "");
        Produto pr3 = new Produto(null, "Moto One", "Smarphone Motorola", 990.5, "");
        Produto pr4 = new Produto(null, "The Witcher", "Livro sobre bruxo guerreiro", 49.90, "");
        Produto pr5 = new Produto(null, "MacBook", "Notebook da Apple", 11000.0, "");

        usuarioRepository.saveAll(Arrays.asList(u1, u2));
        pedidoRepository.saveAll(Arrays.asList(p1, p2, p3));
        categoriaRepository.saveAll(Arrays.asList(c1, c2, c3));
        produtoRepository.saveAll(Arrays.asList(pr1, pr2, pr3, pr4, pr5));

    }
}
