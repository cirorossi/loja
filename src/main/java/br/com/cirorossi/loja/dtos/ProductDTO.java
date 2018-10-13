package br.com.cirorossi.loja.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    @NotEmpty(message = "Please specify product name")
    private String name;

    @NotEmpty(message = "Please specify description")
    private String description;

    @NotEmpty(message = "Please specify prouct value")
    private BigDecimal value;

    private String image;
}
