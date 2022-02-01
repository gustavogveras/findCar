package com.gustavo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavo.domains.Aluguel;
import com.gustavo.domains.Funcionario;
import com.gustavo.repository.FuncionarioRepository;
import com.gustavo.service.FuncionarioService;
@Service
public class Funcionarioimpl implements FuncionarioService{

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	@Override
	public Funcionario cadastrarFuncionario(Funcionario funcionario) {
		Funcionario funcionarioCadastrado = funcionarioRepository.save(funcionario);
		return funcionarioCadastrado;
	}

	@Override
	public Funcionario obterFuncionario(long idFuncionario)  {
		Funcionario funcionarioObtido = funcionarioRepository.findById(idFuncionario).get();		
		return funcionarioObtido;
	}
	
	@Override
	public Funcionario atualizarFuncionario(Funcionario funcionario, Long idFuncionario) {
		Funcionario atualizarFuncionario = this.obterFuncionario(idFuncionario);
		atualizarFuncionario.setNomeFuncionario(funcionario.getNomeFuncionario());
		return atualizarFuncionario;
	}
	

	@Override
	public void deletarUsuário(Long idFuncionario) {
		funcionarioRepository.deleteById(idFuncionario);	
	}

	
}
