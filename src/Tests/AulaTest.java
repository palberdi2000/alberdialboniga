package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Clases.Alumno;
import Clases.Aula;

/**
 * 
 * @author Pablo Alberdi
 * @author Julen Alboniga-menor
 *
 */
public class AulaTest {
	/**
	 * aula a testear
	 */
	private Aula aula1;
		
		@Before
		public void setUp() {
			this.aula1 = new Aula(1,16);
			try {
				this.aula1.capacidadClase();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	/**
	 * test realizado 
	 */
		@Test
		public void comprobarCapacidad() {
		try {
			assertEquals(false, this.aula1.capacidadClase());
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		}

}
