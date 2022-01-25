package com.gustavo.findCar;

import java.util.Objects;

public class Estoque {

	public Integer idCarro;
	public String categoria;
	public String marca;
	public String modelo;
	public Double kmRodados;
	public Estoque(Integer idCarro, String categoria, String marca, String modelo, Double kmRodados) {
		super();
		this.idCarro = idCarro;
		this.categoria = categoria;
		this.marca = marca;
		this.modelo = modelo;
		this.kmRodados = kmRodados;
	}
	public Integer getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(Integer idCarro) {
		this.idCarro = idCarro;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
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
	public Double getKmRodados() {
		return kmRodados;
	}
	public void setKmRodados(Double kmRodados) {
		this.kmRodados = kmRodados;
	}
	@Override
	public int hashCode() {
		return Objects.hash(idCarro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estoque other = (Estoque) obj;
		return Objects.equals(idCarro, other.idCarro);
	}
	
	
}
