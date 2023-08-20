package com.solutis.locadoraveiculos.repository;

import com.solutis.locadoraveiculos.entity.ItemCarrinho;
import com.solutis.locadoraveiculos.entity.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<ItemCarrinho, Long> {
}
