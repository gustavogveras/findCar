package com.gustavo.service;

import com.gustavo.domains.Cliente;
import com.gustavo.dto.ClienteRequest;

public interface ClienteService {

	public Cliente cadastrarCliente (Cliente cliente); 
	
	public Cliente obterCliente (long id);
	
	public static long atualizarCliente (Cliente cliente, long nomeCliente) {
		cliente.setnomeCliente(nomeCliente);
		return nomeCliente;
	}
	
	public void deletarCliente (Long id);

	public static Cliente atualizarCliente(ClienteRequest clienteRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
