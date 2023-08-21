package com.solutis.locadoraveiculos.repository;

import com.solutis.locadoraveiculos.entity.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, Long> {
}
