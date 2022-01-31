package com.gustavo.service.impl;

import com.gustavo.domains.Estoque;
import com.gustavo.service.EstoqueService;

public class Estoqueimpl implements EstoqueService {

	@Override
	public Estoque cadastrarEstoque(Estoque estoque)  {
		System.out.println(estoque);
		
		return (estoque);
	}

	@Override
	public Estoque obterEstoque(Long idEstoque)  {
		Estoque obter = new Estoque();		
		return obter;
	}

	@Override
	public void deletarEstoque(Long idEstoque) {
		
		
	}

	
}
