package com.solutis.locadoraveiculos.controller;
import com.solutis.locadoraveiculos.entity.Veiculo;
import com.solutis.locadoraveiculos.service.CarrinhoService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/carrinho")
public class CarrinhoController {

    private final CarrinhoService carrinhoService;

    @Autowired
    public CarrinhoController(CarrinhoService carrinhoService) {
        this.carrinhoService = carrinhoService;
    }

    @PostMapping("/adicionar")
    @Operation(summary = "Adicionar veículo ao carrinho")
    public ResponseEntity<Void> adicionarAoCarrinho(@RequestBody @Valid Veiculo veiculo) {
        carrinhoService.adicionarVeiculoAoCarrinho(veiculo);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(veiculo.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/remover/")
    @Operation(summary = "Remover veículo do carrinho")
    public ResponseEntity<Void> removerDoCarrinho(@RequestBody Veiculo veiculo) {
        carrinhoService.RetirarVeiculoDoCarrinho(veiculo);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/editar/")
    @Operation(summary = "Editar veículo no carrinho")
    public ResponseEntity<Void> editarNoCarrinho(@RequestBody @Valid Veiculo veiculoEditar) {
        carrinhoService.editarVeiculo(veiculoEditar);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar todos os veículos no carrinho")
    public ResponseEntity<List<Veiculo>> listarVeiculosNoCarrinho() {
        List<Veiculo> veiculos = carrinhoService.listarTodosOsVeiculos();
        return ResponseEntity.ok(veiculos);
    }


}

