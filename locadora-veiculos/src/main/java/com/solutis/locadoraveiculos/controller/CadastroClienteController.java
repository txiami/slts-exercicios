package com.solutis.locadoraveiculos.controller;

import com.solutis.locadoraveiculos.entity.Funcionario;
import com.solutis.locadoraveiculos.entity.Motorista;
import com.solutis.locadoraveiculos.service.CadastroClienteService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/cadastroUsuario")
public class CadastroClienteController {

    @Autowired
    private final CadastroClienteService cadastroClienteService;

    public CadastroClienteController(CadastroClienteService cadastroClienteService) {
        this.cadastroClienteService = cadastroClienteService;
    }

    @PostMapping("/motorista")
    @Operation(summary = "Cadastrar motoristas")
    public ResponseEntity<Motorista> criarMotorista(@RequestBody @Valid Motorista motorista) {
        Motorista novoMotorista = (Motorista) cadastroClienteService.salvarPessoa(motorista);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(novoMotorista.getId()).toUri();
        return ResponseEntity.created(uri).body(novoMotorista);
    }

    @PostMapping("/funcionario")
    @Operation(summary = "Cadastrar funcionários")
    public ResponseEntity<Funcionario> criarFuncionario(@RequestBody @Valid Funcionario funcionario) {
        Funcionario novoFuncionario = (Funcionario) cadastroClienteService.salvarPessoa(funcionario);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(novoFuncionario.getId()).toUri();
        return ResponseEntity.created(uri).body(novoFuncionario);
    }
}

