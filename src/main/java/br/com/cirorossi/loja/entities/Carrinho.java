package br.com.cirorossi.loja.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "carrinhos")
public class Carrinho {

    //   ???
    //   como que faz a
    //   notação de
    //   chave estrangeira

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPedido;

    @Column(name = "idCliente", nullable = false)
    private long idCliente;

    @Column(name = "dataPedido", nullable = false)
    private Date dataPedido;

    @Column(name = "total", nullable = false)
    private BigDecimal total;

}
