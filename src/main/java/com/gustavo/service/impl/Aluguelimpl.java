package com.gustavo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.domains.Aluguel;
import com.gustavo.repository.AluguelRepository;
import com.gustavo.service.AluguelService;
@Service
public class Aluguelimpl implements AluguelService {

	@Autowired
	private AluguelRepository aluguelRepository;
	
	@Override
	public Aluguel cadastrarAluguel(Aluguel aluguel)  {
		Aluguel aluguelCadastrado = aluguelRepository.save(aluguel);
		return aluguelCadastrado;
	}

	@Override
	public Aluguel obterAluguel(Long idAluguel) {
		Aluguel aluguelobtido = aluguelRepository.findById(idAluguel).get();		
		return aluguelobtido;
	}
	
	@Override
	public void  deletarAluguel(Long idAluguel) {
		aluguelRepository.deleteById(idAluguel);		
	}
	


	
	
}
