package com.certus.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.certus.demo.models.service.ProductosService;

@Controller
public class HomeController {
	
	//ProductosService IPService = new ProductosService();
	@Autowired(required = false)
	private ProductosService IPService;
	
	@Value("${titlehome.param}") 
	private String titlehome;
	
	@GetMapping("/home")
	public 	String Home( Model model) {
		
		model.addAttribute("titlehome", titlehome);
		model.addAttribute("mensaje", "Lorem ipum dolor sit amet, consectetur");
		model.addAttribute("menaj", IPService.LisProductos());
		model.addAttribute("product", "Producto");
		return "home";
	}
	

	
	
}
