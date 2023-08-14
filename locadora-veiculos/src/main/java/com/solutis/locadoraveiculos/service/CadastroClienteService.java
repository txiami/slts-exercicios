package com.solutis.locadoraveiculos.service;

import com.solutis.locadoraveiculos.entity.Motorista;
import com.solutis.locadoraveiculos.entity.Pessoa;
import com.solutis.locadoraveiculos.repository.CadastroClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroClienteService {

    @Autowired
    private CadastroClienteRepository repository;

    public CadastroClienteService(CadastroClienteRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Pessoa salvarPessoa(Pessoa pessoa) {
        return repository.save(pessoa);
    }

}
