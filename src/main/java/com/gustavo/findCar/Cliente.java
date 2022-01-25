package com.gustavo.findCar;

import java.util.Objects;

public class Cliente implements serializble {

	private static final Integer serialVersionUID = 1; 
	public Integer idcliente;
    public String nomecliente;
	public Double cpfcliente;
	public String endcliente;
	public String dadospagamento;
	
	public Cliente(Integer idcliente, String nomecliente, Double cpfcliente, String endcliente, String dadospagamento) {
		super();
		this.idcliente = idcliente;
		this.nomecliente = nomecliente;
		this.cpfcliente = cpfcliente;
		this.endcliente = endcliente;
		this.dadospagamento = dadospagamento;
	}

	public Integer getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(Integer idcliente) {
		this.idcliente = idcliente;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public Double getCpfcliente() {
		return cpfcliente;
	}

	public void setCpfcliente(Double cpfcliente) {
		this.cpfcliente = cpfcliente;
	}

	public String getEndcliente() {
		return endcliente;
	}

	public void setEndcliente(String endcliente) {
		this.endcliente = endcliente;
	}

	public String getDadospagamento() {
		return dadospagamento;
	}

	public void setDadospagamento(String dadospagamento) {
		this.dadospagamento = dadospagamento;
	}

	public static Integer getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idcliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(idcliente, other.idcliente);
	}
	
	
	
}
