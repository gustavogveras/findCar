package com.gustavo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.domains.Cliente;
import com.gustavo.domains.Funcionario;
import com.gustavo.dto.ClienteRequest;
import com.gustavo.dto.ClienteResponse;
import com.gustavo.service.ClienteService;
import com.gustavo.service.FuncionarioService;
@RestController
@RequestMapping("/Cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteservice;

	@PostMapping
	public ResponseEntity<ClienteResponse> cadastrarCliente (@RequestBody ClienteRequest clienteRequest) {
		Cliente cliente = new Cliente();
		cliente.setIdcliente(clienteRequest.getIdcliente());
		cliente.setnomeCliente(clienteRequest.getnomeCliente());
		
		Cliente clientecadastrado = clienteservice.cadastrarCliente(cliente);
		
		ClienteResponse clienteResponse = new ClienteResponse();
		clienteResponse.setIdcliente(clientecadastrado.getIdcliente()); 
		clienteResponse.setnomeCliente(clientecadastrado.getnomeCliente());
		
		return ResponseEntity.created(null).body(clienteResponse);
	}
	@GetMapping("obterCliente/{id}")
	public ResponseEntity<ClienteResponse> obterCliente (@PathVariable ClienteRequest clienteRequest) {
		Cliente cliente = new Cliente();
		cliente.setIdcliente(clienteRequest.getnomeCliente());
		cliente.setnomeCliente(clienteRequest.getnomeCliente());
		
		Cliente clienteobtido = clienteservice.cadastrarCliente(cliente);
		
		ClienteResponse clienteResponse = new ClienteResponse();
		clienteResponse.setIdcliente(clienteobtido.getIdcliente()); 
		clienteResponse.setnomeCliente(clienteobtido.getnomeCliente());
		
		return ResponseEntity.created(null).body(clienteResponse);
		
	}
	@PatchMapping("atualizarCliente/{idCliente}")
	public ResponseEntity<ClienteResponse> atualizarCliente(@RequestBody ClienteRequest clienteRequest, @PathVariable long idCliente){
		Cliente cliente = new Cliente();
		cliente.setIdcliente(clienteRequest.getnomeCliente());
		cliente.setnomeCliente(clienteRequest.getnomeCliente());
		
		Cliente clienteatualizado = clienteservice.cadastrarCliente(cliente);
		
		ClienteResponse clienteResponse = new ClienteResponse();
		clienteResponse.setIdcliente(clienteatualizado.getIdcliente()); 
		clienteResponse.setnomeCliente(clienteatualizado.getnomeCliente());
		
		return ResponseEntity.created(null).body(clienteResponse);
	}

	@DeleteMapping("deletarCliente/{idCliente}")
	public ResponseEntity<Cliente> deletarCliente(@PathVariable long id){
		 return ResponseEntity.noContent().build();
		
	}

}