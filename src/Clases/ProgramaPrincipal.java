package Clases;

import Threads.ThreadInicio;
import Ventanas.Login;

/**
 * 
 * @author Pablo Alberdi
 * @author Julen Alboniga-menor
 */

public class ProgramaPrincipal {

	public static void main(String[] args) 
	{
		  ThreadInicio threadBD = new ThreadInicio();
		  threadBD.run();
		  
		  Login pantalla = new Login();
		  pantalla.setVisible(true);
		
	}

}
