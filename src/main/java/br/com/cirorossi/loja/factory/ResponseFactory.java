package br.com.cirorossi.loja.factory;

import br.com.cirorossi.loja.models.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseFactory {

    private ResponseFactory() {};

    private static <S>ResponseEntity<Response<S>> getResponse(S body, String message, HttpStatus status) {

        final Response<S> response = Response
                .<S>builder()
                .body(body)
                .message(message)
                .build();

        return new ResponseEntity<>(response,status);
    }

    public static <S> ResponseEntity<Response<S>> ok(final S body, final String message){
        return ResponseFactory.getResponse(body, message, HttpStatus.OK);
    }

    public static <S> ResponseEntity<Response<S>> ok(final S body){
        return ResponseFactory.ok(body, "OK");
    }

    public static <S> ResponseEntity<Response<S>> badRequest(final S body, final String message){
        return ResponseFactory.getResponse(body, message, HttpStatus.BAD_REQUEST);
    }

}
