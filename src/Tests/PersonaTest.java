package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Clases.Alumno;
import Clases.Persona;

public class PersonaTest {

	/**
	 * alumno1 nuevo alumno que hereda de persona
	 */
	private Alumno alumno1;

	
	/**
	 * Creacion del alumno y se le da el nombre y el apellido
	 */
	@Before
	public void setUp() throws Exception {
		alumno1=new Alumno();
		this.alumno1.setNombre("Pablo");
		this.alumno1.setApellido("Alberdi");
	}
	/**
	 * Testeo del metodo getNombre()
	 */
	
	@Test
	public void getNombretest() {
		assertEquals("Pablo",alumno1.getNombre());
	}
	
	/**
	 * Testeo del metodo setNombre()
	 */
	
	@Test
	public void setNombretest() {
		alumno1.setNombre("Ander");
		assertEquals("Ander",alumno1.getNombre());
	}
	
	/**
	 * Testeo del metodo getApellido
	 */
	
	@Test
	public void getApellidotest() {
		assertEquals("Alberdi",alumno1.getApellido());
	}
	
	/**
	 * Testeo del metodo setApellido
	 */
	
	@Test
	public void setApellidotest() {
		alumno1.setApellido("Escudero");
		assertEquals("Escudero",alumno1.getApellido());
	}
	
	


	
	

}
