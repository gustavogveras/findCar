package com.gustavo.find.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Estoque")

public class estoqueController {

	
	@PostMapping
	public ResponseEntity<Estoque> idCarro (@RequestBody Estoque estoque) {
		System.out.println(estoque);
		
		return ResponseEntity.created(null).body(estoque);
	}
	@PostMapping
	public ResponseEntity<Estoque> categoria (@RequestBody Estoque estoque) {
		System.out.println(estoque);
		
		return ResponseEntity.created(null).body(estoque);
	}
	@PostMapping
	public ResponseEntity<Estoque> marca (@RequestBody Estoque estoque) {
		System.out.println(estoque);
		
		return ResponseEntity.created(null).body(estoque);
	}
	@PostMapping
	public ResponseEntity<Estoque> modelo (@RequestBody Estoque estoque) {
		System.out.println(estoque);
		
		return ResponseEntity.created(null).body(estoque);
	}
	@PostMapping
	public ResponseEntity<Estoque> kmRodados (@RequestBody Estoque estoque) {
		System.out.println(estoque);
		
		return ResponseEntity.created(null).body(estoque);
	}
	
	
	
	
}
