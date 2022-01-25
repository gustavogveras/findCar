package com.gustavo.find.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Cliente")

public class clienteController {

	@PostMapping
	public ResponseEntity<Cliente> idcliente (@RequestBody Cliente cliente) {
		System.out.println(cliente);
		
		return ResponseEntity.created(null).body(cliente);
	}
	@PostMapping
	public ResponseEntity<Cliente> nomecliente (@RequestBody Cliente cliente) {
		System.out.println(cliente);
		
		return ResponseEntity.created(null).body(cliente);
	}
	@PostMapping
	public ResponseEntity<Cliente> cpfcliente (@RequestBody Cliente cliente) {
		System.out.println(cliente);
		
		return ResponseEntity.created(null).body(cliente);
	}
	@PostMapping
	public ResponseEntity<Cliente> endcliente (@RequestBody Cliente cliente) {
		System.out.println(cliente);
		
		return ResponseEntity.created(null).body(cliente);
	}
	@PostMapping
	public ResponseEntity<Cliente> dadospagamento (@RequestBody Cliente cliente) {
		System.out.println(cliente);
		
		return ResponseEntity.created(null).body(cliente);
	}
	
	

}