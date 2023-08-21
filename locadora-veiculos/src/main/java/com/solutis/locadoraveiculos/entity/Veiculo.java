package com.solutis.locadoraveiculos.entity;

import com.solutis.locadoraveiculos.entity.enums.Acessorios;
import com.solutis.locadoraveiculos.entity.enums.Categoria;
import com.solutis.locadoraveiculos.entity.enums.Marca;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_veiculos")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotBlank(message = "O campo cor é obrigatório")
    private String cor;
    @Column(unique = true)
    @NotBlank
    private String urlImagem;
    @NotNull
    private Float preco;
    @Column(unique = true)
    @NotBlank
    private String placa;
    private Boolean reservado;
    @NotBlank
    private String modelo;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Marca marca;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Acessorios acessorios;
    private String descricao;
    private String especificacoes;

}
