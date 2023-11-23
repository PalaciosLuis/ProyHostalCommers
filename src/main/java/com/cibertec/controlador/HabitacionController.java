package com.cibertec.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import com.cibertec.interfaces.InterfaceHabitacion;
import com.cibertec.modelos.Habitacion;

@Controller
@RequestMapping("/habitacion")
public class HabitacionController {
	
	@Autowired
	private InterfaceHabitacion IHabitacion;

	@GetMapping("/")
	public String listarHabitaciones(Model model) {
		List<Habitacion> habitacion = IHabitacion.findAll();
		model.addAttribute("habitacion", habitacion);
		return "listarHabitaciones"; // nombre de la vista
	}
	
	@GetMapping("/catalogo")
	public String listarCatalogo(Model model) {
		List<Habitacion> habitacion = IHabitacion.findAll();
		model.addAttribute("habitacion", habitacion);
		return "catalogo"; // nombre de la vista
	}
	
	@GetMapping("/detalles/{id}")
	public String editarHabitacion(@PathVariable Integer id, Model model) {
		Habitacion habitacion= IHabitacion.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("ID de cliente no válido"));
		model.addAttribute("habitacion",habitacion);
		return "detallesHabitacion"; // Vista de edición
	}
	

}
