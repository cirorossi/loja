package br.com.cirorossi.loja.services.impl;

import br.com.cirorossi.loja.entities.Product;
import br.com.cirorossi.loja.repositories.ProductsRepository;
import br.com.cirorossi.loja.services.ProductsServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProductsServiceImpl implements ProductsServices {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public Optional<Product> registerOrUpdate(final Product product) throws Exception {
        log.info("M-ProductsServiceImpl.registerOrUpdate. II=registering or updating product: {}", product);
        return Optional.ofNullable(this.productsRepository.save(product));

    }

    @Override
    public void remove(Product product) throws Exception {

        log.info("M-ProductsServiceImpl.registerOrUpdate. II=registering or updating product: {}", product);
        this.productsRepository.delete(product);
    }

    @Override
    public List<Product> ListGreaterThan(BigDecimal value) {
        log.info("M-ProductsServiceImpl.ListGreaterThan. search : {}", value);
        return this.productsRepository.findByValueGreaterThan(value);
    }

    @Override
    public List<Product> list() {
        return this.productsRepository.findAll();
    }
}
