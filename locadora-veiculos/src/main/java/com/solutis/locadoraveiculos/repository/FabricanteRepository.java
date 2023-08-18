package com.solutis.locadoraveiculos.repository;

import com.solutis.locadoraveiculos.entity.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FabricanteRepository  extends JpaRepository<Fabricante, Long> {
}
