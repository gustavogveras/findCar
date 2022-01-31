package com.gustavo.service;

import org.springframework.stereotype.Service;

import com.gustavo.domains.Cliente;
import com.gustavo.domains.Funcionario;
@Service
public interface ClienteService {

	public Cliente cadastrarCliente (Cliente cliente); 
	
	public Cliente obterCliente (long id);
	
	public static long atualizarCliente (Cliente cliente, long nomeCliente) {
		cliente.setnomeCliente(nomeCliente);
		return nomeCliente;
	}
	
	public void deletarCliente (Long id);
	
}
