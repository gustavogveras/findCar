package com.gustavo.service;

import org.springframework.stereotype.Service;

import com.gustavo.findCar.Funcionario;

@Service
public class FuncionarioService {

	public Funcionario cadastrarFuncionario (Funcionario funcionario) {
	System.out.println(funcionario);
		
		return (funcionario);
	}
	
	public Funcionario obterFuncionario (long id) {
		Funcionario obter = new Funcionario();		
		return obter;
	}
	
	public static Funcionario atualizarFuncionario (Funcionario funcionario, long idFuncionario) {
		funcionario.setIdFuncionario(idFuncionario);
		return funcionario;
	}
	
	public void deletarUsuário (Long id) {
	}
}
