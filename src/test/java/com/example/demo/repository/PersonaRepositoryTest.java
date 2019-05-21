package com.example.demo.repository;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonaRepositoryTest {

	@Autowired
	private PersonaRepository repository;
	
	@Test
	public void obtenerPersonas() {
		assertTrue(repository.obtenerPersonas()!=null);
	}
}
