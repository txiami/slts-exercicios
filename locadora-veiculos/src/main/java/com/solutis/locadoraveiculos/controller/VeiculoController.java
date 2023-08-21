package com.solutis.locadoraveiculos.controller;

import com.solutis.locadoraveiculos.entity.Veiculo;
import com.solutis.locadoraveiculos.entity.enums.Acessorios;
import com.solutis.locadoraveiculos.entity.enums.Categoria;
import com.solutis.locadoraveiculos.entity.enums.Marca;
import com.solutis.locadoraveiculos.service.VeiculosService;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary = "Inserir dados de um veiculo")
    public void cadastrarVeiculo(@RequestBody Veiculo veiculo){
        veiculosService.cadastrarVeiculo(veiculo);
    }

    @GetMapping("/buscar")
    @Operation(summary = "Listar veiculos")
    public List<Veiculo> listarVeiculos(){
        return veiculosService.listarTodosOsVeiculos();
    }

    @GetMapping("/buscar/marca/{marca}")
    @Operation(summary = "Buscar veiculo por marca")
    public List<Veiculo> listarVeiculosPorMarca(@PathVariable Marca marca) {
        List<Veiculo> veiculos = veiculosService.listarTodosOsVeiculos();
        return veiculos.stream()
                .filter(veiculo -> veiculo.getMarca() == marca)
                .collect(Collectors.toList());
    }
    @GetMapping("/buscar/id/{id}")
    @Operation(summary = "Buscar veiculo por ID")
    public Veiculo listarVeiculosPorId(@PathVariable Long id) {
        Veiculo veiculo = veiculosService.listarVeiculoPorId(id);
        return veiculo;
    }

    @GetMapping("/buscar/modelo/{modelo}")
    @Operation(summary = "Buscar veiculo por modelo")
    public List<Veiculo> listarVeiculosPorModelo(@PathVariable String modelo) {
        List<Veiculo> veiculos = veiculosService.listarTodosOsVeiculos();
        return veiculos.stream()
                .filter(veiculo -> veiculo.getModelo().equals(modelo))
                .collect(Collectors.toList());
    }

    @GetMapping("/buscar/acessorios/{acessorio}")
    @Operation(summary = "Buscar veiculo por acessorio")
    public List<Veiculo> listarVeiculosPorAcessorios(@PathVariable Acessorios acessorio) {
        List<Veiculo> veiculos = veiculosService.listarTodosOsVeiculos();
        return veiculos.stream()
                .filter(veiculo -> veiculo.getAcessorios() == acessorio)
                .collect(Collectors.toList());
    }

    @GetMapping("/buscar/categoria/{categoria}")
    @Operation(summary = "Buscar veiculo por categoria")
    public List<Veiculo> listarVeiculosPorCategoria(@PathVariable Categoria categoria) {
        List<Veiculo> veiculos = veiculosService.listarTodosOsVeiculos();
        return veiculos.stream()
                .filter(veiculo -> veiculo.getCategoria() == categoria)
                .collect(Collectors.toList());
    }


}
