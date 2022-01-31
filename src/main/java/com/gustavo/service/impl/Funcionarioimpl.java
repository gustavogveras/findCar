package com.gustavo.service.impl;

import com.gustavo.domains.Funcionario;
import com.gustavo.repository.FuncionarioRepository;
import com.gustavo.service.FuncionarioService;

public class Funcionarioimpl implements FuncionarioService{

	@Override
	public Funcionario cadastrarFuncionario(Funcionario funcionario) {
		Funcionario funcionarioCadastrado = FuncionarioRepository.save(funcionario);
		return funcionarioCadastrado;
	}

	@Override
	public Funcionario obterFuncionario(long id) {
		Funcionario funcionarioobtido = FunionarioRepository.findById(id).get();		
		return funcionarioobtido;
	}

	@Override
	public void deletarUsuário(Long id) {
		FuncionarioRepository.deleteById(id);	
	}

	
}
