package com.gustavo.service.impl;

import com.gustavo.domains.Cliente;
import com.gustavo.repository.ClienteRepository;
import com.gustavo.service.ClienteService;

public class Clienteimpl implements ClienteService {

	private ClienteRepository clienteRepository;
	
	@Override
	public Cliente cadastrarCliente(Cliente cliente) {
		Cliente clientecadastrado = ClienteRepository.save(cliente);
		return (clientecadastrado);
	}

	@Override
	public Cliente obterCliente(long id)  {
		Cliente clienteobtido = ClienteRepository.findById(id).get();		
		return clienteobtido;
	}
	
	@Override
	public void deletarCliente(Long id) {
		ClienteRepository.deleteById(id);
	}

	
}
