package com.solutis.locadoraveiculos.service;

import com.solutis.locadoraveiculos.entity.Funcionario;
import com.solutis.locadoraveiculos.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public List<Funcionario> findAll() {
        return repository.findAll();
    }

    public Funcionario findById(Long id) {
        Optional<Funcionario> obj = repository.findById(id);
        return obj.get();
    }

    public Funcionario insert(Funcionario obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Funcionario update(Long id, Funcionario obj) {
        Funcionario entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    public void updateData(Funcionario entity, Funcionario obj) {
        entity.setNome(obj.getNome());
        entity.setDataNascimento(obj.getDataNascimento());
        entity.setEmail(obj.getEmail());
        entity.setMatricula(obj.getMatricula());
    }
}
