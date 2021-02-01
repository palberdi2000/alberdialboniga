package Clases;

/**
 * 
 * @author PabloAlberdi
 * @author JulenAlboniga-menor
 *
 */

public class Aula {
	private int numAula;
	private int capacidad;
	
	/**
	 * Constructor vacio
	 */
	
	public Aula() {
		
	}
	
	/**
	 * @param numAula numero del Aula
	 * @param capacidad numero de personas que entran
	 */
	
	public Aula(int numAula,int capacidad) {
		this.capacidad=capacidad;
		this.numAula=numAula;
	}

	/*
	 * Obtener el numero del aula
	 */
	public int getNumAula() {
		return numAula;
	}
	
	/*
	 * Modificar el numero del aula
	 */

	public void setNumAula(int numAula) {
		this.numAula = numAula;
	}
	
	/*
	 * Obtener la capacidad del aula
	 */

	public int getCapacidad() {
		return capacidad;
	}

	/*
	 * Definir la capacidad del aula
	 */
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	/**
	 * Si la capacidad es mayor a la del aula salta excepcion
	 * 
	 * @throws Exception
	 */
	
	public boolean capacidadClase() throws Exception
	{
		
		if(capacidad>=15)
		{
			throw new Exception();
		}else {
			return true;
		}
		
	}
}
