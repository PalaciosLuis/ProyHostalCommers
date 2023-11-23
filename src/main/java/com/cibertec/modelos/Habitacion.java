package com.cibertec.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="habitaciones")
public class Habitacion {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numero;
	private String tipo;
	private double precio;

	public Habitacion(int id, int numero, String tipo, double precio) {
		super();
		this.id = id;
		this.numero = numero;
		this.tipo = tipo;
		this.precio = precio;
	}

	public Habitacion() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Habitacion [id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", precio=" + precio + "]";
	}

}
