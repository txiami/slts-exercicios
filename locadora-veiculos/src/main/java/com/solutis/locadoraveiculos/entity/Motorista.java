package com.solutis.locadoraveiculos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "tb_motorista")
public class Motorista extends Pessoa{

    private String numeroCNH;

    public Motorista() {
    }

    public Motorista(String nome, LocalDate dataNascimento, String cpf, String numeroCNH) {
        super(nome, dataNascimento, cpf);
        this.numeroCNH = numeroCNH;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }
}
