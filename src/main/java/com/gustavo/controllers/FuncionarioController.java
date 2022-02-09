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

import com.gustavo.domains.Funcionario;
import com.gustavo.dto.FuncionarioRequest;
import com.gustavo.dto.FuncionarioResponse;
import com.gustavo.service.FuncionarioService;

@RestController
@RequestMapping("/Funcionario")
public class FuncionarioController {
	
	@Autowired
	private  FuncionarioService funcionarioservice;
	
	@PostMapping
	public ResponseEntity<FuncionarioResponse> cadastrarFuncionario (@RequestBody FuncionarioResponse funcionarioResponse) {
		Funcionario funcionario = new Funcionario();
		funcionario.setIdFuncionario(funcionario.getIdFuncionario());
		funcionario.setNomeFuncionario(funcionario.getNomeFuncionario());
		
		Funcionario  funcionariocadastrado = funcionarioservice.cadastrarFuncionario(funcionario);
		
		FuncionarioResponse funcionarioResponse = new FuncionarioResponse();
		funcionarioResponse.setIdFuncionario(funcionariocadastrado.getIdFuncionario());
		funcionarioResponse.setNomeFuncionario(funcionariocadastrado.getNomeFuncionario());
		
		return ResponseEntity.created(null).body(funcionarioResponse);
	}
	@GetMapping("obterFuncionario/{id}")
	public ResponseEntity<Funcionario> obterFuncionario (@PathVariable long id) {
				
		return ResponseEntity.noContent().build();
	}
	@PatchMapping("atualizarFuncionario/{idFuncionario}")
	public ResponseEntity<Funcionario> atualizarFuncionario(@RequestBody Funcionario funcionario, @PathVariable long idFuncionario){
		Funcionario atualizarFuncionario = funcionarioservice.atualizarFuncionario(funcionario, idFuncionario);
		
		return ResponseEntity.ok(atualizarFuncionario);
	}

	@DeleteMapping("deletarFunionario/{idFuncionario}")
	public ResponseEntity<Funcionario> deletarFuncionario(@PathVariable long id){
		 return ResponseEntity.noContent().build();
		
	}
}
