package com.solutis.locadoraveiculos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends Pessoa{

    private String matricula;

    public Funcionario() {
    }

    public Funcionario(String nome, LocalDate dataNascimento, String cpf, String matricula) {
        super(nome, dataNascimento, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
