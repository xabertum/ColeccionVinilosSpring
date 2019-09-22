package com.xabertum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xabertum.model.Vinilo;
import com.xabertum.repo.ViniloRepo;

@RestController
@RequestMapping("/api")
public class ControladorViniloREST {

	@Autowired
	ViniloRepo viniloRepo;

	@GetMapping("/vinilos")
	public List<Vinilo> getAllVinilos() {
		return viniloRepo.findAll();
	}

	@GetMapping("/vinilos/{fechaEdicion}")
	public List<Vinilo> getViniloByFechaEdicion(@PathVariable(value = "fechaEdicion") String fechaEdicion) {
		return viniloRepo.findByFechaEdicion(fechaEdicion);
	}

}
