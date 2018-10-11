package br.com.cirorossi.loja.entities;
import lombok.*;
import javax.persistence.*;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode
@ToString(exclude = {"carrinho"})
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "itens")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "id_carrinho", nullable = false)
    private Carrinho carrinho;
}
