package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Clases.Alumno;
import Clases.Aula;

public class AulaTest {
	
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
	
		@Test
		public void comprobarCapacidad() {
		try {
			assertEquals(false, this.aula1.capacidadClase());
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		}

}
