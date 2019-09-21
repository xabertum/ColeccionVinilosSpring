package com.xabertum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xabertum.model.Vinilo;
import com.xabertum.repo.ViniloRepo;

@RestController
@RequestMapping("/api")
public class ControladorVinilo {
	
	@Autowired
	ViniloRepo viniloRepo;
	
	@GetMapping("/vinilos")
	public List<Vinilo> getAlVinilos() {
		return viniloRepo.findAll();
	}
	
	
}
