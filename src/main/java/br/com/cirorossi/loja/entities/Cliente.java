package br.com.cirorossi.loja.entities;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome", nullable = false, unique = false)
    private String nome;

    @Column(name = "active", nullable = false)
    private Boolean active;

}