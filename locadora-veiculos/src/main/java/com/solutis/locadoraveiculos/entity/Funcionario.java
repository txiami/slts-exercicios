package com.solutis.locadoraveiculos.entity;

import com.solutis.locadoraveiculos.entity.enums.Sexo;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

@Entity
@Table(name = "tb_funcionario")
public class Funcionario extends Pessoa{

    @NotBlank
    @Pattern(regexp = "\\d{5}")
    private String matricula;

    public Funcionario() {
    }

    public Funcionario(String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String matricula) {
        super(nome, dataNascimento, cpf, sexo);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
