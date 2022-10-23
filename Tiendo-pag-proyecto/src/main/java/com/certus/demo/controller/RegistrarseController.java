package com.certus.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrarseController {

	@Value("${titleregistro.param}")
	private String titleregistro;
	
	@GetMapping("/Registro")
	public String Registro(Model model) {
		
		model.addAttribute("titleregistro", titleregistro);
		model.addAttribute("mensaje", "Bienvenido al Registro");
		
		return "Registro";
	}
	
}
