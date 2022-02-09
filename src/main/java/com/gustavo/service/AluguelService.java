package com.gustavo.service;

import com.gustavo.domains.Aluguel;

public interface AluguelService {

	public Aluguel cadastrarAluguel (Aluguel aluguel);
	
	public Aluguel obterAluguel (Long idAluguel); 
	
	public static long atualizarAluguel (Aluguel aluguel, long numreserva) {
		aluguel.setNumreserva(numreserva);
		return numreserva;
	}
	
	public void deletarAluguel (Long idAluguel);

	
	
}
