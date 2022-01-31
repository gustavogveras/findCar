package com.gustavo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.domains.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long>{

}
