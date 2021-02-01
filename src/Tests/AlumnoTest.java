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
	 * Alumno sobre el que vamos a testear
	 */
	private Alumno alumno1;
	
	/*
	 * Definimos el numero de faltas en el alumno
	 */
	@Before
	public void setUp() {
		this.alumno1 = new Alumno();
		this.alumno1.setNumeroFaltas(6);
		

	}
	/**
	 * testeo del metodo comprobaFaltas
	 */
	@Test
	public void comprobarFaltas() {
		assertEquals(false, this.alumno1.aviso());
	}


}
