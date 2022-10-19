package com.certus.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public 	String Home( Model model) {
		
		model.addAttribute("titulo", "NombreTienda");
		model.addAttribute("mensaje", "Lorem ipsum dolor sit amet, consectetur");
		model.addAttribute("menaj", "Lorem ipsum dolor sit amet, consectetur");
		return "home";
	}
	
}
