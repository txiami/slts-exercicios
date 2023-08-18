package com.solutis.locadoraveiculos.repository;

import com.solutis.locadoraveiculos.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository  extends JpaRepository<Carro, Long> {
}
