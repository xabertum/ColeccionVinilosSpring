package com.xabertum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.xabertum.model.Vinilo;
import com.xabertum.repo.ViniloRepo;

@Controller
public class Controlador {

	@Autowired
	ViniloRepo viniloRepo;
	
	
	@GetMapping (value = "/")
	public String index () {
		return "index";
	}
	
	@GetMapping (value = "/vinilos")
	public String categoriaString (Model model) {
		model.addAttribute("vinilos", viniloRepo.findAll());
		return "categoria";
	}
	
	@GetMapping(value = "/vinilos/{fechaEdicion}")
	public String getViniloByFechaEdicion(Model model, @PathVariable(value = "fechaEdicion") String fechaEdicion) {
		model.addAttribute("fechaEdicion", viniloRepo.findByFechaEdicion(fechaEdicion));
				
		return "resultados";
	}
		
	
}
