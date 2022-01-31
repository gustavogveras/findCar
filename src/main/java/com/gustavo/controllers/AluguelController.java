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

import com.gustavo.domains.Aluguel;
import com.gustavo.domains.Cliente;
import com.gustavo.service.AluguelService;
import com.gustavo.service.ClienteService;

@RestController
@RequestMapping("/aluguel")
public class AluguelController {

	@Autowired
	private AluguelService aluguelservice;
	@PostMapping
	public ResponseEntity<Aluguel> cadastrarAluguel (@RequestBody Aluguel aluguel) {
		
		Aluguel cadastrarAluguel = aluguelservice.cadastrarAluguel(aluguel);
		
		return ResponseEntity.created(null).body(cadastrarAluguel);
	}
	@GetMapping("obterAluguel/{idAluguel}")
	public ResponseEntity<Aluguel> obterAluguel (@PathVariable long idAluguel) {
				
		return ResponseEntity.noContent().build();
	}
	@PatchMapping("atualizarAluguel/{idAluguel}")
	public ResponseEntity<Long> atualizarAluguel(@RequestBody Aluguel aluguel, @PathVariable long idAluguel){
		ResponseEntity<Long> atualizarAluguel = atualizarAluguel (aluguel, idAluguel);
		return atualizarAluguel;
	}

	@DeleteMapping("deletarAluguel/{idAluguel}")
	public ResponseEntity<Aluguel> deletarAluguel(@PathVariable long idAluguel){
		 return ResponseEntity.noContent().build();
		
	}

	}

//http://localhost:8080/aluguel


