package com.gustavo.domains;

import java.util.Objects;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class Aluguel {

	private Long idAluguel;
	private Integer numreserva;

	
	public Aluguel() {
	
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
		return Objects.equals(idAluguel, other.idAluguel) && Objects.equals(numreserva, other.numreserva);
	}
	
}
