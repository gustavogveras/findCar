package com.gustavo.service;

import org.springframework.stereotype.Service;

import com.gustavo.findCar.Estoque;
import com.gustavo.findCar.Funcionario;

@Service
public class EstoqueService {

	public Estoque cadastrarEstoque (Estoque estoque) {
		System.out.println(estoque);
			
			return (estoque);
		}
		
		public Estoque obterEstoque (Long idEstoque) {
			Estoque obter = new Estoque();		
			return obter;
		}
		
		public static Estoque atualizarEstoque (Estoque estoque, String nomeEstoque) {
			estoque.setnomeEstoque(nomeEstoque);
			return estoque;
		}
		
		public void deletarEstoque (Long idEstoque) {
		}
	
}
