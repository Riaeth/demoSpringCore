package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PersonaDto;
import com.example.demo.model.PersonaModel;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	private PersonaRepository repository;

	@Override
	public List<PersonaDto> obtenerPersonas() {
		List<PersonaModel> models= repository.obtenerPersonas();
		List<PersonaDto> dtos= new ArrayList<PersonaDto>();
		PersonaDto persona;
		for (PersonaModel personaModel : models) {
			persona=new PersonaDto();
			persona.setNombre(personaModel.getNombre());
			persona.setApellido(personaModel.getApellido());
			persona.setEdad(personaModel.getEdad());
			dtos.add(persona);
		}
		return dtos;
	}
	

	
}
