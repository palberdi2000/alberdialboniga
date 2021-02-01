package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Clases.Alumno;
import Clases.Grupo;
import Clases.Profesor;

/**
 * 
 * @author Pablo Alberdi
 * @author Julen Alboniga-menor
 * 
 */
public class GrupoTest {
	/**
	 * grupo alumno y profesor para realizar el test
	 */
	private Grupo grupo1;
	private Alumno a;
	private Profesor p;
	
	/*
	 * definimos y añadimos a las listas
	 */
	@Before
	public void setUp() {
		this.grupo1 = new Grupo();
		this.a=new Alumno();
		this.grupo1.anyadirAlumno(a);
		this.p =new Profesor();
		this.grupo1.anyadirProfesor(p);	
	}

	/**
	 * testeo del metodo comprobarAlumnoAnyadido()
	 */
	@Test
	public void comprobarAlunmoAnyadido() {
		assertEquals(grupo1.getLista_alumnos().size(), 1);
	}
	
	/**
	 * testeo del metodo comprobarProfeAnyadido()
	 */
	@Test
	public void comprobarProfeAnyadido() {
		assertEquals(grupo1.getArrayProfe().size(),1);
	}
	
	
	
}

