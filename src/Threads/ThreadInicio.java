package Threads;

import Clases.GestorBD;

/**
 * 
 * @author Pablo Alberdi
 * @author Julen Alboniga-menor
 *
 */
public class ThreadInicio extends Thread{
	/**
	 * metodo que inicializa la base de datos
	 */
	public void run() {
		GestorBD.conectar();
	}

}
