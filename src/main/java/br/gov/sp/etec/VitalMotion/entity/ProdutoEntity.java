package br.gov.sp.etec.VitalMotion.entity;

import jakarta.persistence.*;

@Entity(name = "tb_produtos")
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private double preco;
    private String descricao;

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(ProdutoEntity categoria) {
        this.categoria = categoria.getCategoria();
    }

    public String getProdutoIdentifier() {
        return produtoIdentifier;
    }

    public void setProdutoIdentifier(String produtoIdentifier) {
        this.produtoIdentifier = produtoIdentifier;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String produtoIdentifier;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaEntity categoria;



    }


