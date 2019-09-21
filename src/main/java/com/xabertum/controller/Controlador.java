package com.xabertum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.xabertum.repo.ViniloRepo;

@Controller
public class Controlador {

	@Autowired
	ViniloRepo viniloRepo;
	
	
	@GetMapping (value = "/")
	public String index () {
		return "index";
	}
	
	@GetMapping (value = "/categoria")
	public String categoriaString (Model model) {
		model.addAttribute("vinilos", viniloRepo.findAll());
		return "categoria";
	}
	
}
