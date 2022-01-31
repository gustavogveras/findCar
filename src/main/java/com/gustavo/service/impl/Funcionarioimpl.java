package com.gustavo.service.impl;

import com.gustavo.domains.Funcionario;
import com.gustavo.service.FuncionarioService;

public class Funcionarioimpl implements FuncionarioService{

	@Override
	public Funcionario cadastrarFuncionario(Funcionario funcionario) {
	System.out.println(funcionario);
		
		return (funcionario);
	}

	@Override
	public Funcionario obterFuncionario(long id) {
		Funcionario obter = new Funcionario();		
		return obter;
	}

	@Override
	public void deletarUsuário(Long id) {
				
	}

	
}
