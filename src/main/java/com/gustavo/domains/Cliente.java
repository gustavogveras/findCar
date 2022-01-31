package com.gustavo.domains;


import java.util.Objects;

public class Cliente  {

	private static final Integer serialVersionUID = 1; 
	public Integer idCliente;
    public long nomeCliente;

	
	public Cliente() {
		
	}
	

	public Integer getIdcliente() {
		return idCliente;
	}

	public void setIdcliente(long idCliente) {
		this.idCliente = (int) idCliente;
	}

	public long getnomeCliente() {
		return nomeCliente;
	}

	public void setnomeCliente(long nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	@Override
	public int hashCode() {
		return Objects.hash(idCliente);
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
		return Objects.equals(idCliente, other.idCliente);
	}


		
	}
	
	

