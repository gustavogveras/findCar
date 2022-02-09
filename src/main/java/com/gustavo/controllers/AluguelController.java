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
import com.gustavo.dto.AluguelRequest;
import com.gustavo.service.AluguelService;
import com.gustavo.service.ClienteService;

import com.gustavo.dto.AluguelResponse;

@RestController
@RequestMapping("/aluguel")
public class AluguelController {

	@Autowired
	private AluguelService aluguelservice;
	
	@PostMapping
	public ResponseEntity<AluguelResponse> cadastrarAluguel (@RequestBody AluguelRequest aluguelRequest) {
		Aluguel aluguel = new Aluguel();
		aluguel.setId(aluguelRequest.getIdAluguel());
		aluguel.setNumreserva(aluguelRequest.getNumreserva());
		
		Aluguel aluguelcadastrado = aluguelservice.cadastrarAluguel(aluguel);
		
		AluguelResponse aluguelResponse = new AluguelResponse();
		aluguelResponse.setId(aluguelcadastrado.getIdAluguel());
		aluguelResponse.setNumreserva(aluguelcadastrado.getNumreserva());
		
		return ResponseEntity.created(null).body(aluguelResponse);
	}
	@GetMapping("obterAluguel/{idAluguel}")
	public ResponseEntity<AluguelResponse> obterAluguel (@PathVariable AluguelRequest aluguelRequest) {
		Aluguel aluguel = new Aluguel();
		aluguel.setId(aluguelRequest.getIdAluguel());
		aluguel.setNumreserva(aluguelRequest.getNumreserva());
		
		Aluguel aluguelobtido = aluguelservice.obterAluguel(aluguel);
		
		AluguelResponse aluguelResponse = new AluguelResponse();
		aluguelResponse.setId(aluguelobtido.getIdAluguel());
		aluguelResponse.setNumreserva(aluguelobtido.getNumreserva());
		
		return ResponseEntity.created(null).body(aluguelResponse);
	}
	@PatchMapping("atualizarAluguel/{idAluguel}")
	public ResponseEntity<AluguelResponse> atualizarAluguel(@RequestBody AluguelRequest aluguelRequest, @PathVariable long idAluguel){
		Aluguel aluguel = new Aluguel();
		aluguel.setId(aluguelRequest.getIdAluguel());
		aluguel.setNumreserva(aluguelRequest.getNumreserva());
		
		Aluguel aluguelatualizado = aluguelservice.cadastrarAluguel(aluguel);
		
		AluguelResponse aluguelResponse = new AluguelResponse();
		aluguelResponse.setId(aluguelatualizado.getIdAluguel());
		aluguelResponse.setNumreserva(aluguelatualizado.getNumreserva());
		
		return ResponseEntity.created(null).body(aluguelResponse);

	}

	@DeleteMapping("deletarAluguel/{idAluguel}")
	public ResponseEntity<Aluguel> deletarAluguel(@PathVariable long idAluguel){
		 return ResponseEntity.noContent().build();
		
	}

	}

//http://localhost:8080/aluguel


