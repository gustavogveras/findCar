package com.gustavo.service;

import com.gustavo.domains.Estoque;

public interface EstoqueService {

	public Estoque cadastrarEstoque (Estoque estoque);
		
		public Estoque obterEstoque (Long idEstoque);
		
		public static Estoque atualizarEstoque (Estoque estoque, String nomeEstoque) {
			estoque.setnomeEstoque(nomeEstoque);
			return estoque;
		}
		
		public void deletarEstoque (Long idEstoque);
	
	
}
