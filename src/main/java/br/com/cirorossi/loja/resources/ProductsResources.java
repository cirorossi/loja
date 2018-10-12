package br.com.cirorossi.loja.resources;

import br.com.cirorossi.loja.entities.Product;
import br.com.cirorossi.loja.factory.ResponseFactory;
import br.com.cirorossi.loja.models.Response;
import br.com.cirorossi.loja.services.ProductsServices;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ProductsResources {

    @Autowired
    private ProductsServices productsServices;

    public ResponseEntity<Response<List<Product>>> list(){
        try {
            final List<Product> products= this.productsServices.list();
            return ResponseFactory.ok(products);
        } catch (final Exception ex){
            final String errorMessage = ExceptionUtils.getRootCauseMessage(ex);
            return ResponseFactory.badRequest(Collections.emptyList(), errorMessage);
        }
    }

}
