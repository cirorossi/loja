package br.com.cirorossi.loja.repositories;

import br.com.cirorossi.loja.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensRepository extends JpaRepository<Item, Long> {

}
