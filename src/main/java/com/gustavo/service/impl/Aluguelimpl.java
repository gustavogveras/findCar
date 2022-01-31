package com.gustavo.service.impl;

import org.springframework.stereotype.Service;

import com.gustavo.domains.Aluguel;
import com.gustavo.repository.AluguelRepository;
import com.gustavo.service.AluguelService;
@Service
public class Aluguelimpl implements AluguelService {

	private AluguelRepository aluguelRepository;
	
	@Override
	public Aluguel cadastrarAluguel(Aluguel aluguel)  {
		Aluguel aluguelCadastrado = AluguelRepository.save(aluguel);
		return aluguelCadastrado;
	}

	@Override
	public Aluguel obterAluguel(long idAluguel) {
		Aluguel aluguelobtido = AluguelRepository.findById(idAluguel).get();		
		return aluguelobtido;
	}
	
	@Override
	public void  deletarAluguel(Long idAluguel) {
		AluguelRepository.deleteById(idAluguel);		
	}
	


	
	
}
