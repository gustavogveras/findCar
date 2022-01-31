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
import com.gustavo.service.ClienteService;
import com.gustavo.service.FuncionarioService;
@RestController
@RequestMapping("/Cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteservice;

	@PostMapping
	public ResponseEntity<Cliente> cadastrarCliente (@RequestBody Cliente cliente) {
		
		Cliente cadastrarCliente = clienteservice.cadastrarCliente(cliente);
		
		return ResponseEntity.created(null).body(cadastrarCliente);
	}
	@GetMapping("obterCliente/{id}")
	public ResponseEntity<Cliente> obterCliente (@PathVariable long id) {
				
		return ResponseEntity.noContent().build();
	}
	@PatchMapping("atualizarCliente/{idCliente}")
	public ResponseEntity<Long> atualizarCliente(@RequestBody Cliente cliente, @PathVariable long idCliente){
		long atualizarCliente = ClienteService.atualizarCliente(cliente, idCliente);
		
		return ResponseEntity.ok(atualizarCliente);
	}

	@DeleteMapping("deletarCliente/{idCliente}")
	public ResponseEntity<Cliente> deletarCliente(@PathVariable long id){
		 return ResponseEntity.noContent().build();
		
	}

}