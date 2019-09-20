package com.xabertum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

	@GetMapping (value = "/")
	public String index () {
		return "index";
	}
	
}
