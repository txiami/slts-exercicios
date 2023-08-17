package com.solutis.locadoraveiculos.controller;

import com.solutis.locadoraveiculos.entity.Veiculo;
import com.solutis.locadoraveiculos.entity.enums.Acessorios;
import com.solutis.locadoraveiculos.entity.enums.Categoria;
import com.solutis.locadoraveiculos.entity.enums.Marca;
import com.solutis.locadoraveiculos.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/veiculo")
public class VeiculoController {
    @Autowired
    private VeiculosService veiculosService;

    @PostMapping()
    public void cadastrarVeiculo(@RequestBody Veiculo veiculo){
        veiculosService.cadastrarVeiculo(veiculo);
    }

    @GetMapping("/buscar")
    public List<Veiculo> listarVeiculos(){
        return veiculosService.listarTodosOsVeiculos();
    }

    @GetMapping("/buscar/marca/{marca}")
    public List<Veiculo> listarVeiculosPorMarca(@PathVariable Marca marca) {
        List<Veiculo> veiculos = veiculosService.listarTodosOsVeiculos();
        return veiculos.stream()
                .filter(veiculo -> veiculo.getMarca() == marca)
                .collect(Collectors.toList());
    }

    @GetMapping("/buscar/modelo/{modelo}")
    public List<Veiculo> listarVeiculosPorModelo(@PathVariable String modelo) {
        List<Veiculo> veiculos = veiculosService.listarTodosOsVeiculos();
        return veiculos.stream()
                .filter(veiculo -> veiculo.getModelo().equals(modelo))
                .collect(Collectors.toList());
    }

    @GetMapping("/buscar/acessorios/{acessorio}")
    public List<Veiculo> listarVeiculosPorAcessorios(@PathVariable Acessorios acessorio) {
        List<Veiculo> veiculos = veiculosService.listarTodosOsVeiculos();
        return veiculos.stream()
                .filter(veiculo -> veiculo.getAcessorios() == acessorio)
                .collect(Collectors.toList());
    }

    @GetMapping("/buscar/categoria/{categoria}")
    public List<Veiculo> listarVeiculosPorCategoria(@PathVariable Categoria categoria) {
        List<Veiculo> veiculos = veiculosService.listarTodosOsVeiculos();
        return veiculos.stream()
                .filter(veiculo -> veiculo.getCategoria() == categoria)
                .collect(Collectors.toList());
    }


}
