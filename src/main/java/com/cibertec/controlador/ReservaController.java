package com.cibertec.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.interfaces.InterfaceReserva;
import com.cibertec.modelos.Reserva;

@Controller
@RequestMapping("/reserva")
public class ReservaController {
	
	@Autowired
	private InterfaceReserva iReserva;
	
	@GetMapping("/")
	public String listarReservas(Model model) {
		List<Reserva> reservas = iReserva.findAll();
		model.addAttribute("reservas", reservas);
		return "listarReservas"; // nombre de la vista
	}

	@PostMapping("/guardar")
	public String guardarcliente(@ModelAttribute Reserva reserva ,RedirectAttributes redirec) {
	iReserva.save(reserva);
		redirec.addFlashAttribute("mensaje", "cliente registrado con exito");
		return "redirect:/reserva/";
	}

}
