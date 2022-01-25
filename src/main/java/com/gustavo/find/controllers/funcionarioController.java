package com.gustavo.find.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Funcionario")

public class funcionarioController {
	
	@PostMapping
	public ResponseEntity<Funcionario> idCarro (@RequestBody Funcionario funcionario) {
		System.out.println(funcionario);
		
		return ResponseEntity.created(null).body(funcionario);
	}
	@PostMapping
	public ResponseEntity<Funcionario> categoria (@RequestBody Funcionario funcionario) {
		System.out.println(funcionario);
		
		return ResponseEntity.created(null).body(funcionario);
	}
	

}
