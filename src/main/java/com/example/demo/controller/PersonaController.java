package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PersonaDto;
import com.example.demo.service.PersonaService;

@CrossOrigin
@RestController
@RequestMapping("/personaController")
public class PersonaController {
	
	@Autowired
	private PersonaService service;

	@GetMapping(path = "/prueba",  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PersonaDto> obtenerPersonas() {
		return service.obtenerPersonas();
	}
}
