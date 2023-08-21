package com.solutis.locadoraveiculos.entity;

import com.solutis.locadoraveiculos.entity.enums.Sexo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "inc")
    private Long id;

    @NotBlank
    private String nome;

    @NotNull
    @PastOrPresent
    private LocalDate dataNascimento;

    @NotBlank
    @Column(unique = true)
    @CPF
    private String cpf;

    @NotBlank
    @Column(unique = true)
    @Email
    private String email;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Sexo sexo;



    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String email) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
    }
}
