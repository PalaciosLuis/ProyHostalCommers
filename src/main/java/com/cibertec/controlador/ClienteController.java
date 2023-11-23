package com.cibertec.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.interfaces.InterfaceCliente;
import com.cibertec.modelos.Cliente;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired InterfaceCliente ICliente;
	
	@GetMapping("/")
	public String listarcliente(Model model) {
		List<Cliente> cliente = ICliente.findAll();
		model.addAttribute("cliente", cliente);
		return "listarClientes"; // nombre de la vista
	}

}
