package br.com.cirorossi.loja.repositories;

import br.com.cirorossi.loja.entities.Carrinho;
import br.com.cirorossi.loja.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarrinhosRepository extends JpaRepository<Carrinho, Long> {

    Optional<Carrinho> findByCliente(Cliente cliente);

}
