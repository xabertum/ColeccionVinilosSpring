package com.xabertum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value = "/vinilos/fechaEdicion", method = {RequestMethod.POST})
	public String postViniloByFechaEdicion(Model model, @RequestParam(value = "fechaEdicion") String fechaEdicion) {
		model.addAttribute("fechaEdicion", viniloRepo.findByFechaEdicion(fechaEdicion));
				
		return "resultados";
	}
	
}
