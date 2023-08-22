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
    @NotBlank(message = "O campo urlImagem é obrigatório")
    private String urlImagem;
    @NotNull
    private Float preco;
    @Column(unique = true)
    @NotBlank(message = "O campo placa é obrigatório")
    private String placa;
    private Boolean reservado;
    @NotBlank(message = "O campo modelo é obrigatório")
    private String modelo;
    @NotNull(message = "O campo marca é obrigatório")
    @Enumerated(EnumType.STRING)
    private Marca marca;
    @NotNull(message = "O campo categoria é obrigatório")
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    @NotNull(message = "O campo acessorios é obrigatório")
    @Enumerated(EnumType.STRING)
    private Acessorios acessorios;
    private String descricao;
    private String especificacoes;
}
