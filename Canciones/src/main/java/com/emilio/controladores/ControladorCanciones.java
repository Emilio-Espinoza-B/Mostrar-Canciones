package com.emilio.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.emilio.modelos.Cancion;
import com.emilio.servicios.ServicioCanciones;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ControladorCanciones {
	
	@Autowired
	private ServicioCanciones servicio;
	
	@GetMapping("/canciones")
	public String desplegarCanciones(Model model) {
		List<Cancion> canciones = servicio.obtenerTodasLasCanciones();
		model.addAttribute("canciones", canciones);
		return "canciones";
	}
	@GetMapping("/canciones/detalle/{idCancion}") public String desplegarDetalleCancion(@PathVariable Long idCancion, Model model) {
		Cancion cancion = servicio.obtenerCancionPorId(idCancion);
		model.addAttribute("cancion", cancion); 
		return "detalleCancion";
	}
}
