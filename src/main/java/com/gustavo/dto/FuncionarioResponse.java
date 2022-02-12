package com.gustavo.dto;

import java.util.Objects;

import com.gustavo.domains.Funcionario;

import lombok.Data;

@Data
public class FuncionarioResponse {

	private  Long idFuncionario;
	private  String nomeFuncionario;
	
	public FuncionarioResponse() {
		
	}

	public Long getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Long idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFuncionario, nomeFuncionario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return Objects.equals(idFuncionario, other.getIdFuncionario())
				&& Objects.equals(nomeFuncionario, other.getNomeFuncionario());
	}

}
