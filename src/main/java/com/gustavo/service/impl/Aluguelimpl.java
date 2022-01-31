package com.gustavo.service.impl;

import com.gustavo.domains.Aluguel;
import com.gustavo.service.AluguelService;

public class Aluguelimpl implements AluguelService {

	@Override
	public Aluguel cadastrarAluguel(Aluguel aluguel)  {
	System.out.println(aluguel);
		
		return (aluguel);
	}

	@Override
	public Aluguel obterAluguel(long idAluguel) {
		Aluguel obter = new Aluguel();		
		return obter;
	}
	
	@Override
	public void  deletarAluguel(Long idAluguel) {

		
	}
	


	
	
}
