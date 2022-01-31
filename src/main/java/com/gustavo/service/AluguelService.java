package com.gustavo.service;

import org.springframework.stereotype.Service;

import com.gustavo.domains.Aluguel;
import com.gustavo.domains.Cliente;

@Service
public interface AluguelService {

	public Aluguel cadastrarAluguel (Aluguel aluguel);
	
	public Aluguel obterAluguel (long idAluguel); 
	
	public static long atualizarAluguel (Aluguel aluguel, long numreserva) {
		aluguel.setNumreserva(numreserva);
		return numreserva;
	}
	
	public void deletarAluguel (Long idAluguel);
	
}
