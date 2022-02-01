package com.gustavo.service;

import com.gustavo.domains.Funcionario;

public interface FuncionarioService {

	public Funcionario cadastrarFuncionario (Funcionario funcionario);
	
	public Funcionario obterFuncionario (long idFuncionario); 
	
	public Funcionario atualizarFuncionario (Funcionario funcionario, Long idFuncionario);
	
	public void deletarUsuário (Long idFuncionario);
	
}
