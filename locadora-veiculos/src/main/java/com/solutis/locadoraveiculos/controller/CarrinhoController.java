package com.solutis.locadoraveiculos.controller;
import com.solutis.locadoraveiculos.entity.*;
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

    @Autowired
    private CarrinhoService carrinhoService;

    @Autowired
    public CarrinhoController(CarrinhoService carrinhoService) {
        this.carrinhoService = carrinhoService;
    }

    @PostMapping("/adicionar")
    @Operation(summary = "Adicionar item ao carrinho")
    public ItemCarrinho adicionarAoCarrinho(@RequestBody @Valid ItemCarrinho itemCarrinho) {
        ItemCarrinho response = carrinhoService.adicionarItemAoCarrinho(itemCarrinho);
        return response;
    }

    @PostMapping("/confirmar")
    @Operation(summary = "Confirmar reserva de todos os veiculos do carrinho")
    public String confirmarReserva(@RequestBody @Valid Motorista cliente) {
        String reserva = carrinhoService.confirmarReserva(cliente);
        return "Olá " + cliente.getNome() + ", sua reserva foi confirmada!\n" + reserva;
    }

    @GetMapping("/termos")
    @Operation(summary = "Buscar termos do contrato de aluguel")
    public String buscarTermos(@RequestBody @Valid Motorista cliente) {
        String reserva = carrinhoService.buscarTermos(cliente);
        return "Olá " + cliente.getNome() + ", seu contrato de aluguel atual é:\n" + reserva;
    }

    @DeleteMapping("/remover/")
    @Operation(summary = "Remover item do carrinho")
    public ResponseEntity<Void> removerDoCarrinho(@RequestBody ItemCarrinho itemCarrinho) {
        carrinhoService.RetirarVeiculoDoCarrinho(itemCarrinho);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/editar")
    @Operation(summary = "Editar item do carrinho")
    public ResponseEntity<Void> editarNoCarrinho(@RequestBody @Valid ItemCarrinho itemCarrinho) {
        carrinhoService.editarVeiculo(itemCarrinho);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar todos os veículos no carrinho")
    public ResponseEntity<List<ItemCarrinho>> listarVeiculosNoCarrinho() {
        List<ItemCarrinho> itensCarrinho = carrinhoService.listarTodosOsItens();
        return ResponseEntity.ok(itensCarrinho);
    }


}

