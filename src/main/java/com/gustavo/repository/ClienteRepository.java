package com.gustavo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.domains.Cliente;
import com.gustavo.dto.request.ClienteRequest;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Cliente save(ClienteRequest clienteRequest);

	
}
