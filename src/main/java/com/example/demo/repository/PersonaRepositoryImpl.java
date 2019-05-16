package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.PersonaModel;

@Repository
public class PersonaRepositoryImpl implements PersonaRepository{

	//Tendria que obtenerlo de la base de datos
	/*	
	 * @Query("SELECT ptype FROM PetType ptype ORDER BY ptype.name")
	 * @Transactional(readOnly = true)
	 * public List<PersonaModel> obtenerPersonas();
	*/
	@Override
	public List<PersonaModel> obtenerPersonas(){
		List<PersonaModel> lista = new ArrayList<PersonaModel>();
		PersonaModel persona=new PersonaModel();

		persona.setNombre("N1");
		persona.setApellido("A1");
		persona.setEdad(1);
		lista.add(persona);
		
		persona=new PersonaModel();
		persona.setNombre("N2");
		persona.setApellido("A2");
		persona.setEdad(2);
		lista.add(persona);
		
		persona=new PersonaModel();
		persona.setNombre("N3");
		persona.setApellido("A3");
		persona.setEdad(3);
		lista.add(persona);
		
		return lista;
	}
}
