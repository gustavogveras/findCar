package com.gustavo.service;

import org.springframework.stereotype.Service;

import com.gustavo.domains.Funcionario;

@Service
public interface FuncionarioService {

	public Funcionario cadastrarFuncionario (Funcionario funcionario);
	
	public Funcionario obterFuncionario (long id); 
	
	public static Funcionario atualizarFuncionario (Funcionario funcionario, long idFuncionario) {
		funcionario.setIdFuncionario(idFuncionario);
		return funcionario;
	}
	
	public void deletarUsuário (Long id);
	
}
