package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Clases.Alumno;
import Clases.Grupo;
import Clases.Profesor;

public class GrupoTest {
	
	private Grupo grupo1;
	private Alumno a;
	private Profesor p;
	
	@Before
	public void setUp() {
		this.grupo1 = new Grupo();
		this.a=new Alumno();
		this.grupo1.anyadirAlumno(a);
		this.p =new Profesor();
		this.grupo1.anyadirProfesor(p);
		
	}

	@Test
	public void comprobarAlunmoAnyadido() {
		assertEquals(grupo1.getLista_alumnos().size(), 1);
	}
	
	@Test
	public void comprobarProfeAnyadido() {
		assertEquals(grupo1.getArrayProfe().size(),1);
	}
	
	
	
}

