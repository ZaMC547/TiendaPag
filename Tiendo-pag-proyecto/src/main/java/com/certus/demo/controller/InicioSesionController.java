package com.certus.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioSesionController {
	
	@GetMapping("/InicioSesion")
	public String InicioSesion(Model model) {
		
		model.addAttribute("titulo", "Inicio de Sesion");
		model.addAttribute("mensaje", "Bienvenido al Inicio de Sesion");
		
		return "InicioSesion";
	}
	
}
