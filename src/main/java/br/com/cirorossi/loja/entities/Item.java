package br.com.cirorossi.loja.entities;
import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "itens")
public class Item {

 //   como que faz a notação de chave estrangeira

    @Column(name = "idPedido", nullable = false)
    private long idPedido;

    @Column(name = "idProduct", nullable = false)
    private long idProduct;

    @Column(name = "precoUnitario", nullable = false)
    private BigDecimal precoUnitario;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "precoTotal", nullable = false)
    private BigDecimal precoTotal;

}
