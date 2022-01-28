package com.gustavo.service;

import org.springframework.stereotype.Service;

import com.gustavo.findCar.Aluguel;
import com.gustavo.findCar.Cliente;

@Service
public class AluguelService {

	public Aluguel cadastrarAluguel (Aluguel aluguel) {
	System.out.println(aluguel);
		
		return (aluguel);
	}
	
	public Aluguel obterAluguel (long idAluguel) {
		Aluguel obter = new Aluguel();		
		return obter;
	}
	
	public static long atualizarAluguel (Aluguel aluguel, long numreserva) {
		aluguel.setNumreserva(numreserva);
		return numreserva;
	}
	
	public void deletarAluguel (Long idAluguel) {
	}
}
