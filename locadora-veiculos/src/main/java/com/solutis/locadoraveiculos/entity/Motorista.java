package com.solutis.locadoraveiculos.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.solutis.locadoraveiculos.entity.enums.Sexo;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_motorista")
public class Motorista extends Pessoa{

    @NotBlank
    @Size(min = 10, max = 10)
    @Pattern(regexp = "[0-9]+")
    private String numeroCNH;

    @JsonIgnore
    @OneToMany(mappedBy = "motorista")
    private List<Aluguel> alugueis = new ArrayList<>();

    public Motorista() {
    }

    public Motorista(String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String numeroCNH) {
        super(nome, dataNascimento, cpf, sexo);
        this.numeroCNH = numeroCNH;
    }

    public Motorista(Long id, String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String numeroCNH) {
        super(id, nome, dataNascimento, cpf, sexo);
        this.numeroCNH = numeroCNH;
    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }
}
