package com.cibertec.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.modelos.Reserva;

public interface InterfaceReserva extends JpaRepository<Reserva, Integer>{

}
