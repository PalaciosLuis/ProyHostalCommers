package com.cibertec.modelos;



import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;


@Entity
@Table(name="reservas")
public class Reserva {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int habitacion_id; // Cambio de nombre a habitacion y tipo a Habitacion
    private Date fecha_inicio; // Estilo de nombre CamelCase
    private Date fecha_fin; // Estilo de nombre CamelCase
    private double total;
    private String estado;
	public Reserva(int id, int habitacion_id, Date fecha_inicio, Date fecha_fin, double total, String estado) {
		super();
		this.id = id;
		this.habitacion_id = habitacion_id;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.total = total;
		this.estado = estado;
	}
	public Reserva() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getHabitacion_id() {
		return habitacion_id;
	}
	public void setHabitacion_id(int habitacion_id) {
		this.habitacion_id = habitacion_id;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", habitacion_id=" + habitacion_id + ", fecha_inicio=" + fecha_inicio
				+ ", fecha_fin=" + fecha_fin + ", total=" + total + ", estado=" + estado + "]";
	}
    
    
    


}
