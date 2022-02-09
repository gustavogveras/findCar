package com.gustavo.dto;

import java.util.Objects;

import com.gustavo.domains.Aluguel;

public class AluguelRequest {

	private Long idAluguel;
	private Integer numreserva;

	
	public AluguelRequest() {
		// TODO Auto-generated constructor stub
	}
	public Long getIdAluguel() {
		return idAluguel;
	}
	public void setId(Long idAluguel) {
		this.idAluguel = idAluguel;
	}
	public Integer getNumreserva() {
		return numreserva;
	}
	public void setNumreserva(long numreserva) {
		this.numreserva = (int) numreserva;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idAluguel, numreserva);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluguel other = (Aluguel) obj;
		return Objects.equals(idAluguel, other.getIdAluguel()) && Objects.equals(numreserva, other.getNumreserva());
	}

}
