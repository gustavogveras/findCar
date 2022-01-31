package com.gustavo.service;

import org.springframework.stereotype.Service;

import com.gustavo.domains.Estoque;
import com.gustavo.domains.Funcionario;

@Service
public interface EstoqueService {

	public Estoque cadastrarEstoque (Estoque estoque);
		
		public Estoque obterEstoque (Long idEstoque);
		
		public static Estoque atualizarEstoque (Estoque estoque, String nomeEstoque) {
			estoque.setnomeEstoque(nomeEstoque);
			return estoque;
		}
		
		public void deletarEstoque (Long idEstoque);
	
	
}
