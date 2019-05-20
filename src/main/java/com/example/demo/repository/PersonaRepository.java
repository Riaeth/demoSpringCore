package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.PersonaModel;


public interface PersonaRepository extends JpaRepository<PersonaModel, Integer>{

	
	@Query("SELECT DISTINCT p FROM PersonaModel p")
	public List<PersonaModel> obtenerPersonas();
}
