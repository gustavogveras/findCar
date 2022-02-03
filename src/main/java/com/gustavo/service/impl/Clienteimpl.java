package com.gustavo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.domains.Cliente;
import com.gustavo.dto.request.ClienteRequest;
import com.gustavo.repository.ClienteRepository;
import com.gustavo.service.ClienteService;
@Service
public class Clienteimpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	@Override
	public Cliente cadastrarCliente(ClienteRequest clienteRequest) {
		Cliente clientecadastrado = clienteRepository.save(clienteRequest);
		return (clientecadastrado);
	}

	@Override
	public Cliente obterCliente(long id)  {
		Cliente clienteobtido = clienteRepository.findById(id).get();		
		return clienteobtido;
	}
	
	@Override
	public void deletarCliente(Long id) {
		clienteRepository.deleteById(id);
	}

	
}
