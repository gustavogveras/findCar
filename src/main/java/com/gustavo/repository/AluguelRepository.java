package com.gustavo.repository;

import org.springframework.boot.autoconfigure.web.servlet.JerseyApplicationPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.domains.Aluguel;
@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Long> {

	
}
