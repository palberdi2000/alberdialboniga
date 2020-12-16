package Threads;

import Clases.GestorBD;

public class ThreadInicio extends Thread{
	public void run() {
		GestorBD.conectar();
	}

}
