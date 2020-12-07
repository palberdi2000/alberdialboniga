package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Clases.Alumno;

@SuppressWarnings("deprecation")
public class AlumnoTest {
	private Alumno alumno1;
	
	@Before
	public void setUp() {
		this.alumno1 = new Alumno();
		this.alumno1.setNumeroFaltas(6);
	}

	@Test
	public void comprobarFaltas() {
		assertEquals(false, this.alumno1.aviso());
	}

}
