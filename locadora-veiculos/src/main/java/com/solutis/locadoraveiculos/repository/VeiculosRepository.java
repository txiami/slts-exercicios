package com.solutis.locadoraveiculos.repository;

import com.solutis.locadoraveiculos.entity.Veiculo;
import com.solutis.locadoraveiculos.entity.enums.Acessorios;
import com.solutis.locadoraveiculos.entity.enums.Categoria;
import com.solutis.locadoraveiculos.entity.enums.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculo, Long> {

}
