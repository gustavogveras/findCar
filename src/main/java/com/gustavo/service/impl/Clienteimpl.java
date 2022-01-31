package com.gustavo.service.impl;

import com.gustavo.domains.Cliente;
import com.gustavo.service.ClienteService;

public class Clienteimpl implements ClienteService {

	@Override
	public Cliente cadastrarCliente(Cliente cliente) {
	System.out.println(cliente);
		
		return (cliente);
	}

	@Override
	public Cliente obterCliente(long id)  {
		Cliente obter = new Cliente();		
		return obter;
	}
	
	@Override
	public void deletarCliente(Long id) {
		
	}

	
}
