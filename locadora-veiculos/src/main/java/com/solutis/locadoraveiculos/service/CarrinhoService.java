package com.solutis.locadoraveiculos.service;

import com.solutis.locadoraveiculos.entity.Veiculo;
import com.solutis.locadoraveiculos.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {
    @Autowired
    private CarrinhoRepository repository;

    public CarrinhoService(CarrinhoRepository repository){
        this.repository = repository;
    }
    public void adicionarVeiculoAoCarrinho(Veiculo veiculo){
        repository.save(veiculo);
    }
    public void RetirarVeiculoDoCarrinho(Veiculo veiculo){
        repository.delete(veiculo);
    }
    public void editarVeiculo(Veiculo veiculoeditar){
        repository.save(veiculoeditar);
    }
    public List<Veiculo> listarTodosOsVeiculos(){
        return repository.findAll();
    }

    public List<Veiculo> listarVeiculosPorDisponibilidade(boolean disponibilidade){
        List<Veiculo> veiculos = repository.findAll();

        for(Veiculo veiculo : veiculos){
            if(veiculo.getReservado() != disponibilidade){
                veiculos.remove(veiculo);
            }
        }
        return veiculos;
    }


}
