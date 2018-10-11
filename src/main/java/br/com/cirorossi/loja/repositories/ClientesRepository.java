package br.com.cirorossi.loja.repositories;

import br.com.cirorossi.loja.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientesRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByActive(Boolean active);

    List<Cliente> findByNameContaining(String nome);

}
