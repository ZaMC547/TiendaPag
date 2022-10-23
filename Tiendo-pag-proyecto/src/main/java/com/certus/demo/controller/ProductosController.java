package com.certus.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductosController {
	
	@Value("${titleproductos.param}")
	private String titleproductos;
	
	@GetMapping("/producto")
	public String producto (Model model) {
		
		model.addAttribute("titleproductos", titleproductos);
		model.addAttribute("mensaje", "Bienvenido a los productos");
		
		return "producto";
	}
	

}
