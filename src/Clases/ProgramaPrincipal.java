package Clases;

import Threads.ThreadInicio;
import Ventanas.Login;

/**
 * 
 * @author Pablo Alberdi
 * @author Julen Alboniga-menor
 */

public class ProgramaPrincipal {
	
	/**
	 * Metodo main que llama al hilo ThreadInicio y inicializa el programa
	 */

	public static void main(String[] args) 
	{
		  ThreadInicio threadBD = new ThreadInicio();
		  threadBD.run();
		  
		  Login pantalla = new Login();
		  pantalla.setVisible(true);
		
	}

}
