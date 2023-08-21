package com.solutis.locadoraveiculos.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tb_carrinho")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemCarrinho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long carroId;
    @NotNull
    private LocalDate dataInicial;
    @NotNull
    private LocalDate dataFinal;
    private double preco;
}
