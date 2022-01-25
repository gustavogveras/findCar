package com.gustavo.find.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gustavo.findCar.Aluguel;

@RestController
@RequestMapping("/Aluguel")

public class aluguelController {

	@PostMapping
	public ResponseEntity<Aluguel> reservar(@RequestBody Aluguel aluguel) {
		System.out.println(aluguel);
		
		return ResponseEntity.ok(aluguel);
	}
	@DeleteMapping
	public ResponseEntity<String> cancelar(@RequestBody Aluguel aluguel) {
		return ResponseEntity.noContent().build();
	}
	@PatchMapping
	public ResponseEntity<Aluguel> alterar(@RequestBody Aluguel aluguel) {
		return ResponseEntity.ok(aluguel);
	}
	@GetMapping
	public ResponseEntity<Aluguel> iniciarefinalizar(@RequestBody Aluguel aluguel) {
		return ResponseEntity.ok(aluguel);
	}
}

//http://localhost:8080/aluguel


