package br.com.cirorossi.loja.resources;

import br.com.cirorossi.loja.dtos.ProductDTO;
import br.com.cirorossi.loja.entities.Product;
import br.com.cirorossi.loja.factory.ResponseFactory;
import br.com.cirorossi.loja.models.Response;
import br.com.cirorossi.loja.services.ProductsServices;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Slf4j
@RequestMapping("/products")
@RestController
public class ProductsResources {

    @Autowired
    private ProductsServices productsServices;

    @GetMapping
    public ResponseEntity<Response<List<Product>>> list(){
        try {
            final List<Product> products= this.productsServices.list();
            return ResponseFactory.ok(products);
        } catch (final Exception ex){
            final String errorMessage = ExceptionUtils.getRootCauseMessage(ex);
            return ResponseFactory.badRequest(Collections.emptyList(), errorMessage);
        }
    }

    @PostMapping
    public ResponseEntity<Response<Product>> register(@Valid @RequestBody ProductDTO productDTO, BindingResult result){
        log.info("register new product", productDTO);
        if(result.hasErrors()){
            return ResponseFactory.badRequest(null, result.getAllErrors().get(0).getDefaultMessage());
        }
        try {
           final Optional<Product> registerProduct = this.
        } catch (final Exception ex){
            final String errorMessage = ExceptionUtils.getRootCauseMessage(ex);
            return ResponseFactory.badRequest(Collections.emptyList(), errorMessage);
        }

    }

}
