package com.gustavo.service;

import org.springframework.stereotype.Service;


import com.gustavo.findCar.Cliente;
import com.gustavo.findCar.Funcionario;
@Service
public class ClienteService {

	public Cliente cadastrarCliente (Cliente cliente) {
	System.out.println(cliente);
		
		return (cliente);
	}
	
	public Cliente obterCliente (long id) {
		Cliente obter = new Cliente();		
		return obter;
	}
	
	public static long atualizarCliente (Cliente cliente, long nomeCliente) {
		cliente.setnomeCliente(nomeCliente);
		return nomeCliente;
	}
	
	public void deletarCliente (Long id) {
	}
}
