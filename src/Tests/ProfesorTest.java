package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Clases.Profesor;
/**
 * 
 * @author Pablo Alberdi
 * @author Julen Alboniga
 */
public class ProfesorTest {
	/**
	 * Definimos a
	 */
	private Profesor a;
	
	/**
	 * Definimos la asignatura que imparte 
	 */
	@Before
	public void setUp() throws Exception {
		a=new Profesor();
		a.setAsigImpartida("Microeconomia");
	}
	/**
	 * Testeamos si fuciona corrrectamente el getAsigImpartida
	 */
	@Test
	public void getAsigImpartidatest() {
		assertEquals("Microeconomia",a.getAsigImpartida());
	}
	/**
	 * Testeamos si fuciona corrrectamente el setAsigImpartida
	 */
	@Test
	public void setAsigImpartidatest() {
		a.setAsigImpartida("Macroeconomia");
		assertEquals("Macroeconomia",a.getAsigImpartida());
	}
}
