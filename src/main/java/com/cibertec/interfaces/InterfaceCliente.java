package com.cibertec.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.modelos.Cliente;

public interface InterfaceCliente extends JpaRepository<Cliente, Integer>{

}
