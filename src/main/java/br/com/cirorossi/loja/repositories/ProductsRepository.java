package br.com.cirorossi.loja.repositories;

import br.com.cirorossi.loja.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductsRepository extends JpaRepository<Product, Long> {

    List<Product> findByValueGreaterThan(BigDecimal value);
}
