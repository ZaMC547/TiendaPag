package com.certus.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductosController {
	
	@GetMapping("/producto")
	public String producto (Model model) {
		
		model.addAttribute("titulo", "Productos");
		model.addAttribute("mensaje", "Bienvenido a los productos");
		
		return "producto";
	}
	

}
