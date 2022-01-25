package com.gustavo.findCar;

import java.util.Objects;

import Cliente.Cliente;

public class Aluguel {

	public Integer numreserva;
	public String categoria;
	public Double valdiaria;
	public String marca;
	public String modelo;
	public Cliente cliente;
	public Aluguel(Integer numreserva, String categoria, Double valdiaria, String marca, String modelo,
			com.gustavo.findCar.Cliente cliente) {
		super();
		this.numreserva = numreserva;
		this.categoria = categoria;
		this.valdiaria = valdiaria;
		this.marca = marca;
		this.modelo = modelo;
		this.cliente = cliente;
	}
	public Integer getNumreserva() {
		return numreserva;
	}
	public void setNumreserva(Integer numreserva) {
		this.numreserva = numreserva;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Double getValdiaria() {
		return valdiaria;
	}
	public void setValdiaria(Double valdiaria) {
		this.valdiaria = valdiaria;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numreserva);
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
		return Objects.equals(numreserva, other.numreserva);
	}
	
	
}
