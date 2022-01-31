package com.gustavo.service.impl;

import com.gustavo.domains.Estoque;
import com.gustavo.repository.EstoqueRepository;
import com.gustavo.service.EstoqueService;

public class Estoqueimpl implements EstoqueService {

	@Override
	public Estoque cadastrarEstoque(Estoque estoque)  {
		Estoque estoquecadastrado = EstoqueRepository.save(estoque);
		return estoquecadastrado;
	}

	@Override
	public Estoque obterEstoque(Long idEstoque)  {
		Estoque estoqueobtido = EstoqueRepository.findById(idEstoque).get();		
		return estoqueobtido;
	}

	@Override
	public void deletarEstoque(Long idEstoque) {
		EstoqueRepository.deleteById(idEstoque);
		
	}

	
}
