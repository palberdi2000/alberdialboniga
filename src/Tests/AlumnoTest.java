package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Clases.Alumno;

@SuppressWarnings("deprecation")

/**
 * 
 * @author Pablo Alberdi
 * @author Julen Alboniga-menor
 *
 */
public class AlumnoTest {
	/**
	 * Alumno a testear
	 */
	private Alumno alumno1;
	
	@Before
	public void setUp() {
		this.alumno1 = new Alumno();
		this.alumno1.setNumeroFaltas(6);
	}
	/**
	 * test realizado
	 */
	@Test
	public void comprobarFaltas() {
		assertEquals(false, this.alumno1.aviso());
	}

}
