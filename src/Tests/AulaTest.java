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
	 * aula sobre la cual vamos a  testear
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
	 * testeo del metodo comprobarCapacidad()
	 */
		@Test
		public void comprobarCapacidad() {
		try {
			assertEquals(false, this.aula1.capacidadClase());
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		}
		
		/**
		 * Testeo del metodo getAula()
		 */
		@Test
		
		public void getAulaTest() {
			assertEquals(1,aula1.getNumAula());
		}
		
		/**
		 * Testeo del metodo setAula()
		 */
		@Test
		public void setAulaTest() {
			aula1.setNumAula(2);
			assertEquals(2,aula1.getNumAula());
		}
		
		/**
		 * testeo del metodo getCapacidad()
		 */
		@Test
		public void getCapacidadTest() {
			assertEquals(16,aula1.getCapacidad());
		}
		/**
		 * testeo del metodo setCapacidad()
		 */
		@Test
		public void setCapacidadTest() {
			aula1.setCapacidad(3);
			assertEquals(3,aula1.getCapacidad());
		}	
}
