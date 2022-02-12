package com.gustavo.service;

import com.gustavo.domains.Aluguel;
import com.gustavo.dto.AluguelRequest;

public interface AluguelService {

	public Aluguel cadastrarAluguel (AluguelRequest aluguelRequest);
	
	public Aluguel obterAluguel (Aluguel aluguel); 
	
	public static long atualizarAluguel (Aluguel aluguel, long numreserva) {
		aluguel.setNumreserva(numreserva);
		return numreserva;
	}
	
	public void deletarAluguel (Long idAluguel);

	
	
}
