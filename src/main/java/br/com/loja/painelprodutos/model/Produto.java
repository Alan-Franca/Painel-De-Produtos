package br.com.loja.painelprodutos.model;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Data
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String marca;
    private int quantidadeEstoque;

    @Column(precision = 10, scale = 2)
    private BigDecimal precoBase;

    @Column(precision = 10, scale = 2)
    private BigDecimal precoVenda;

    @Column(precision = 5, scale = 4)
    private BigDecimal percentualImposto;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}