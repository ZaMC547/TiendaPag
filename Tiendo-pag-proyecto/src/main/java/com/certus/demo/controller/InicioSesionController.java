package com.certus.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioSesionController {
	
	@Value("${titleiniciosesion.param}")
	private String titleiniciosesion;
	
	@GetMapping("/InicioSesion")
	public String InicioSesion(Model model) {
		
		model.addAttribute("titleiniciosesion", titleiniciosesion);
		model.addAttribute("mensaje", "Bienvenido al Inicio de Sesion");
		
		return "InicioSesion";
	}
	
}
