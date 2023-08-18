package com.solutis.locadoraveiculos.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_carro")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String placa;

    @NotBlank
    private String chassi;

    @NotBlank
    private String cor;

    @NotBlank
    private String imgUrl;

    @NotNull
    @Positive
    private BigDecimal valorDiaria;

    @ManyToMany
    @JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Acessorio> acessorios = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private ModeloCarro modelo;

    public Carro() {
    }

    public Carro(Long id, String placa, String chassi, String cor, String imgUrl, BigDecimal valorDiaria, ModeloCarro modelo) {
        this.id = id;
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.imgUrl = imgUrl;
        this.valorDiaria = valorDiaria;
        this.modelo = modelo;
    }

    public Carro(String placa, String chassi, String cor, String imgUrl, BigDecimal valorDiaria, ModeloCarro modelo) {
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.imgUrl = imgUrl;
        this.valorDiaria = valorDiaria;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public BigDecimal getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(BigDecimal valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public ModeloCarro getModelo() {
        return modelo;
    }

    public void setModelo(ModeloCarro modelo) {
        this.modelo = modelo;
    }

    public Set<Acessorio> getAcessorios() {
        return acessorios;
    }
}
