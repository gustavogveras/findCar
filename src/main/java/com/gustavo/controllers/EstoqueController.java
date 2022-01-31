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

import com.gustavo.domains.Estoque;
import com.gustavo.domains.Funcionario;
import com.gustavo.service.EstoqueService;
import com.gustavo.service.FuncionarioService;

@RestController
@RequestMapping("/Estoque")

public class EstoqueController {
	
	@Autowired
	private  EstoqueService estoqueservice;
	
	@PostMapping
	public ResponseEntity<Estoque> cadastrarEstoque (@RequestBody Estoque estoque) {
		
		Estoque  cadastrarEstoque = estoqueservice.cadastrarEstoque(estoque);
		
		return ResponseEntity.created(null).body(cadastrarEstoque);
	}
	@GetMapping("obterEstoque/{idEstoque}")
	public ResponseEntity<Estoque> obterEstoque (@PathVariable Long idEstoque) {
		Estoque estoqueobtido = estoqueservice.obterEstoque(idEstoque);		
		return ResponseEntity.ok(estoqueobtido);
	}
	@PatchMapping("atualizarEstoque/{idEstoque}")
	public ResponseEntity<Estoque> atualizarEstoque(@RequestBody Estoque estoque, @PathVariable String nomeEstoque){
		Estoque atualizarEstoque = EstoqueService.atualizarEstoque(estoque , nomeEstoque);
		
		return ResponseEntity.ok(atualizarEstoque);
	}

	@DeleteMapping("deletarEstgoque/{idEstoque}")
	public ResponseEntity<Estoque> deletarEstoque(@PathVariable Long idEstoque){
		 return ResponseEntity.noContent().build();
		
	}		
}
