package com.certus.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.certus.demo.models.service.ProductosService;

@Controller
public class HomeController {
	
 
	ProductosService IPService = new ProductosService();
	
	@GetMapping("/home")
	public 	String Home( Model model) {
		
		model.addAttribute("titulo", "NombreTienda");
		model.addAttribute("mensaje", "Lorem ipsum dolor sit amet, consectetur");
		model.addAttribute("menaj", IPService.LisProductos());
		return "home";
	}
	

	
	
}
