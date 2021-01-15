package Threads;

import Clases.GestorBD;

/**
 * 
 * @author Pablo Alberdi
 * @author Julen Alboniga-menor
 *
 */
public class ThreadInicio extends Thread{
	
	public void run() {
		GestorBD.conectar();
	}

}
