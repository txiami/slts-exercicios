package com.solutis.locadoraveiculos.controller;

import com.solutis.locadoraveiculos.entity.Motorista;
import com.solutis.locadoraveiculos.service.MotoristaService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/motorista")
public class MotoristaController {

    @Autowired
    private MotoristaService service;

    @GetMapping
    @Operation(summary = "Listar todos os motoristas")
    public ResponseEntity<List<Motorista>> findAll() {
        List<Motorista> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    @Operation(summary = "Listar motorista através de seu ID")
    public ResponseEntity<Motorista> findById(@PathVariable Long id) {
        Motorista obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    @Operation(summary = "Inserir dados de um motorista")
    public ResponseEntity<Motorista> insert(@RequestBody Motorista obj) {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    @Operation(summary = "Remover um motorista através de seu ID")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    @Operation(summary = "Atualizar um motorista através de seu ID")
    public ResponseEntity<Motorista> update(@PathVariable Long id, @RequestBody Motorista obj) {
        obj = service.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

}
