package com.certus.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrarseController {

	
	@GetMapping("/Registro")
	public String Registro(Model model) {
		
		model.addAttribute("titulo", "Registro");
		model.addAttribute("mensaje", "Bienvenido al Registro");
		
		return "Registro";
	}
	
}
