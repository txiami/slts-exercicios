package com.solutis.locadoraveiculos.repository;

import com.solutis.locadoraveiculos.entity.Motorista;
import com.solutis.locadoraveiculos.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroClienteRepository extends JpaRepository<Pessoa, Long> {
}
