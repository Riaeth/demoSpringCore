package com.example.demo.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.PersonaDto;
import com.example.demo.model.PersonaModel;
import com.example.demo.repository.PersonaRepository;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class PersonaServiceTest {

	@Autowired
	@InjectMocks
	private PersonaServiceImpl service;

	@Mock
	private PersonaRepository repository;

	@Test
	public void obtenerPersonas() {
		List<PersonaModel> lista = new ArrayList<PersonaModel>();

		PersonaModel persona = new PersonaModel();

		persona.setNombre("N1");
		persona.setApellido("A1");
		persona.setEdad(1);
		lista.add(persona);

		persona = new PersonaModel();
		persona.setNombre("N2");
		persona.setApellido("A2");
		persona.setEdad(2);
		lista.add(persona);

		Mockito.when(repository.obtenerPersonas()).thenReturn(lista);

		List<PersonaDto> devuelta = service.obtenerPersonas();
		
		
		assertNotNull(devuelta);
		assertTrue(devuelta.size()==lista.size());
		

	}
}
