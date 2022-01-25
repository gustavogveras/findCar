package com.gustavo.findCar;

import java.util.Objects;

public class Funcionario {

	public Integer idFuncionario;
	public String nomeFuncionario;
	public Funcionario(Integer idFuncionario, String nomeFuncionario) {
		super();
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
	}
	public Integer getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(Integer idFuncionario) {
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
		return Objects.hash(idFuncionario);
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
		return Objects.equals(idFuncionario, other.idFuncionario);
	}
	
	
}
