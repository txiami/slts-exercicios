package com.solutis.locadoraveiculos.controller;

import com.solutis.locadoraveiculos.entity.Veiculo;
import com.solutis.locadoraveiculos.entity.enums.Acessorios;
import com.solutis.locadoraveiculos.entity.enums.Categoria;
import com.solutis.locadoraveiculos.entity.enums.Marca;
import com.solutis.locadoraveiculos.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/buscar/marca{marca}")
    public List<Veiculo> listarVeiculosPorMarca(@PathVariable Marca marca){
        return veiculosService.listarVeiculosPorMarca(marca);
    }

    @GetMapping("/buscar/modelo{modelo}")
    public List<Veiculo> listarVeiculosPorModelo(@PathVariable String modelo){
        return veiculosService.listarVeiculosPorModelo(modelo);
    }

    @GetMapping("/buscar/acessorios{acessorio}")
    public List<Veiculo> listarVeiculosPorAcessorios(@PathVariable Acessorios acessorio){
        return veiculosService.listarVeiculosPorAcessorios(acessorio);
    }

    @GetMapping("/buscar/categoria{categoria}")
    public List<Veiculo> listarVeiculosPorAcessorios(@PathVariable Categoria categoria){
        return veiculosService.listarVeiculosPorCategoria(categoria);
    }


}
