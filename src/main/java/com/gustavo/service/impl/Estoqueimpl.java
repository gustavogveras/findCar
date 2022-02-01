package com.gustavo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.domains.Estoque;
import com.gustavo.repository.EstoqueRepository;
import com.gustavo.service.EstoqueService;
@Service
public class Estoqueimpl implements EstoqueService {

	@Autowired
	private EstoqueRepository estoqueRepository;
	@Override
	public Estoque cadastrarEstoque(Estoque estoque)  {
		Estoque estoquecadastrado = estoqueRepository.save(estoque);
		return estoquecadastrado;
	}

	@Override
	public Estoque obterEstoque(Long idEstoque)  {
		Estoque estoqueobtido = estoqueRepository.findById(idEstoque).get();		
		return estoqueobtido;
	}

	@Override
	public void deletarEstoque(Long idEstoque) {
		estoqueRepository.deleteById(idEstoque);
		
	}

	
}
