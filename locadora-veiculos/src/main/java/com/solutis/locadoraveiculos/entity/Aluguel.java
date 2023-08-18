package com.solutis.locadoraveiculos.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

@Entity
@Table(name = "tb_aluguel")
public class Aluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Calendar dataPedido;

    @NotNull
    @Future
    private LocalDate dataEntrega;

    @NotNull
    @Future
    private LocalDate dataDevolucao;

    @NotNull
    @Positive
    private BigDecimal valorTotal;

    @OneToOne
    @JoinColumn(name = "apolice_seguro_id")
    private ApoliceSeguro apolice;

    @ManyToOne
    @JoinColumn(name = "motorista_id")
    private Motorista motorista;

    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carro carro;

    public Aluguel() {
    }

    public Aluguel(Calendar dataPedido, LocalDate dataEntrega, LocalDate dataDevolucao, ApoliceSeguro apolice, Motorista motorista, Carro carro) {
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
        this.dataDevolucao = dataDevolucao;
        this.apolice = apolice;
        this.motorista = motorista;
        this.carro = carro;
        calcularValorTotal();
    }

    public Aluguel(Long id, Calendar dataPedido, LocalDate dataEntrega, LocalDate dataDevolucao, ApoliceSeguro apolice, Motorista motorista, Carro carro) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.dataEntrega = dataEntrega;
        this.dataDevolucao = dataDevolucao;
        this.apolice = apolice;
        this.motorista = motorista;
        this.carro = carro;
        calcularValorTotal();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Calendar dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ApoliceSeguro getApolice() {
        return apolice;
    }

    public void setApolice(ApoliceSeguro apolice) {
        this.apolice = apolice;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void calcularValorTotal() {
        if (dataEntrega != null && dataDevolucao != null && carro != null && apolice != null) {
            BigDecimal valorDiaria = carro.getValorDiaria();
            BigDecimal valorApolice = apolice.getValorFranquia();

            long quantidadeDeDias = ChronoUnit.DAYS.between(dataEntrega, dataDevolucao);

            this.valorTotal = valorDiaria.multiply(BigDecimal.valueOf(quantidadeDeDias))
                    .add(valorApolice);
        }
    }
}
