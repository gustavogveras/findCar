package com.gustavo.service;

import com.gustavo.domains.Cliente;
import com.gustavo.dto.request.ClienteRequest;
import com.gustavo.dto.response.ClienteResponse;

public interface ClienteService {

	public ClienteResponse cadastrarCliente (ClienteRequest clienteRequest); 
	
	public Cliente obterCliente (long id);
	
	public static long atualizarCliente (Cliente cliente, long nomeCliente) {
		cliente.setnomeCliente(nomeCliente);
		return nomeCliente;
	}
	
	public void deletarCliente (Long id);

	
}
