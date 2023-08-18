package com.solutis.locadoraveiculos.repository;

import com.solutis.locadoraveiculos.entity.ModeloCarro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeloCarroRepository extends JpaRepository<ModeloCarro, Long> {
}
