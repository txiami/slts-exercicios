package com.solutis.locadoraveiculos.service;

import com.solutis.locadoraveiculos.entity.*;
import com.solutis.locadoraveiculos.repository.CarrinhoRepository;
import com.solutis.locadoraveiculos.repository.VeiculosRepository;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

@Service
public class CarrinhoService {
    @Autowired
    private CarrinhoRepository repository;

    @Autowired
    private VeiculosRepository veiculosRepository;

    public CarrinhoService(CarrinhoRepository repository){
        this.repository = repository;
    }
    public ItemCarrinho adicionarItemAoCarrinho(ItemCarrinho itemCarrinho){

        Optional<Veiculo> veiculo = veiculosRepository.findById(itemCarrinho.getCarroId());
        LocalDate dataInicio = itemCarrinho.getDataInicial();
        LocalDate dataTermino = itemCarrinho.getDataFinal();
        if(veiculo.isEmpty() || veiculo.get().getReservado() == true){
            return null;
        }
        long diasDeAluguel = Period.between(dataInicio, dataTermino).getDays();
        float valor = veiculo.get().getPreco() * diasDeAluguel;

        itemCarrinho.setPreco(valor);
        repository.save(itemCarrinho);
        return itemCarrinho;
    }
    public void RetirarVeiculoDoCarrinho(ItemCarrinho itemCarrinho){
        repository.delete(itemCarrinho);
    }
    public void editarVeiculo(ItemCarrinho itemCarrinho){
        repository.save(itemCarrinho);
    }
    public List<ItemCarrinho> listarTodosOsItens(){
        return repository.findAll();
    }


    public String confirmarReserva(Motorista cliente) {
        double valorTotal = repository.findAll().stream().mapToDouble(ItemCarrinho::getPreco).sum();
        List<Veiculo> veiculos = veiculosRepository.findAll();
        for(ItemCarrinho itemCarrinho : repository.findAll()){
            for(Veiculo veiculo : veiculos){
                if(veiculo.getId() == itemCarrinho.getCarroId()){
                    veiculo.setReservado(true);
                    veiculosRepository.save(veiculo);
                }
            }
        }
        repository.deleteAll();
        Reserva reserva = new Reserva(0, cliente.getNome(),valorTotal, repository.findAll());

        return reserva.toString(veiculosRepository.findAll());
    }

    public String buscarTermos(Motorista cliente) {
        double valorTotal = repository.findAll().stream().mapToDouble(ItemCarrinho::getPreco).sum();
        Reserva reserva = new Reserva(0, cliente.getNome(),valorTotal, repository.findAll());
        return reserva.toString(veiculosRepository.findAll());
    }

}
