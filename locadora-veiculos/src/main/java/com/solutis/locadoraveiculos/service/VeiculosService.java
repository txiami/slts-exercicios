package com.solutis.locadoraveiculos.service;

import com.solutis.locadoraveiculos.entity.Veiculo;
import com.solutis.locadoraveiculos.entity.enums.Acessorios;
import com.solutis.locadoraveiculos.entity.enums.Categoria;
import com.solutis.locadoraveiculos.entity.enums.Marca;
import com.solutis.locadoraveiculos.repository.VeiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculosService {
    @Autowired
    private VeiculosRepository repository;

    public VeiculosService(VeiculosRepository repository){
        this.repository = repository;
    }
    public void cadastrarVeiculo(Veiculo veiculo){

        repository.save(veiculo);
    }
    public void deletarVeiculo(Veiculo veiculo){
        repository.delete(veiculo);
    }
    public void editarVeiculo(Veiculo veiculoeditar){
        repository.save(veiculoeditar);
    }
    public List<Veiculo> listarTodosOsVeiculos(){

        List<Veiculo> Allveiculos = repository.findAll();
        List<Veiculo> veiculosOn = new ArrayList<>();
        for(Veiculo veiculo : Allveiculos){
            if(veiculo.getReservado() == false){
                veiculosOn.add(veiculo);
            }
        }
        return veiculosOn;
    }

    public Veiculo listarVeiculoPorId(Long id){
        return repository.findById(id).get();
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

    public List<Veiculo> listarVeiculosPorMarca(Marca marca){
        List<Veiculo> veiculos = repository.findAll();

        for(Veiculo veiculo : veiculos){
            if(veiculo.getMarca() != marca){
                veiculos.remove(veiculo);
            }
        }
        return veiculos;
    }

    public List<Veiculo> listarVeiculosPorModelo(String modelo){
        List<Veiculo> veiculos = repository.findAll();

        for(Veiculo veiculo : veiculos){
            if(veiculo.getModelo() != modelo){
                veiculos.remove(veiculo);
            }
        }
        return veiculos;
    }

    public List<Veiculo> listarVeiculosPorAcessorios(Acessorios acessorio){
        List<Veiculo> veiculos = repository.findAll();

        for(Veiculo veiculo : veiculos){
            if(veiculo.getAcessorios() != acessorio){
                veiculos.remove(veiculo);
            }
        }
        return veiculos;
    }

    public List<Veiculo> listarVeiculosPorCategoria(Categoria categoria){
        List<Veiculo> veiculos = repository.findAll();

        for(Veiculo veiculo : veiculos){
            if(veiculo.getCategoria() != categoria){
                veiculos.remove(veiculo);
            }
        }
        return veiculos;
    }

}
