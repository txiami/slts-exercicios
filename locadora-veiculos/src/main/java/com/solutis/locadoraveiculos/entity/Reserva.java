package com.solutis.locadoraveiculos.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeCliente;
    private double preco;
    private List<ItemCarrinho> veiculoList;

    public String toString(List<Veiculo> Allveiculos){


        List<Veiculo> veiculosReservados = new ArrayList<>();
        for(ItemCarrinho itemCarrinho : veiculoList){
            for(Veiculo veiculo : Allveiculos){
                if(veiculo.getId() == itemCarrinho.getCarroId()){
                    veiculosReservados.add(veiculo);
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Reserva:");
        stringBuilder.append("\n  Cliente:").append(nomeCliente);
        stringBuilder.append("\n  Preco: R$ ").append(preco);
        stringBuilder.append("\n  Veiculos Selecionados: ");
        for (Veiculo veiculoReservado : veiculosReservados) {
            for(ItemCarrinho itemCarrinho : veiculoList){

                if(itemCarrinho.getCarroId() == veiculoReservado.getId()){
                    stringBuilder.append("\n    ").append(
                            veiculoReservado.getModelo() +" "+
                            veiculoReservado.getCor() + " Alugado por: R$ " +
                            itemCarrinho.getPreco() + " Durante: " + (Period.between(itemCarrinho.getDataInicial(), itemCarrinho.getDataFinal()).getDays()) + " dias");
                }
            }
        }
        return stringBuilder.toString();
    }
}
