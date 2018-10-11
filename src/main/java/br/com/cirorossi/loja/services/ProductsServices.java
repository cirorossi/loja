package br.com.cirorossi.loja.services;

import br.com.cirorossi.loja.entities.Product;

import java.util.Optional;

public interface ProductsServices {

    Optional<Product> registerOrUpdate(Product product) throws Exception;

    void remove(Product product) throws  Exception;

}
