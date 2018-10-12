package br.com.cirorossi.loja.services;

import br.com.cirorossi.loja.entities.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ProductsServices {

    Optional<Product> registerOrUpdate(Product product) throws Exception;

    void remove(Product product) throws  Exception;

    List<Product> ListGreaterThan (BigDecimal value);

    List<Product> list();

}
