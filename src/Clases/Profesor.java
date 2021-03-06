package Clases;

/**
 * Clase que hereda de Persona
 * 
 * @author PabloAlberdi
 * @author JulenAlboniga-menor
 *
 */

public class Profesor extends Persona {
	private String asigImpartida;
	
	/**
	 * Constructor vacio
	 */
	
	public Profesor() {
		
	}
	
	/**
	 * Constructor de Profesor
	 * 
	 * @param nombre del objeto Persona
	 * @param apellido del objeto Persona
	 * @param telefono del objeto Persona
	 * @param asigImpartida imparte la asignatura
	 * 
	 */
	
	public Profesor(String nombre, String apellido,int telefono,String asigImpartida) {
		super(nombre, apellido, telefono);
		this.asigImpartida=asigImpartida;
		
	}
	/**
	 * Obtener la asignatura que imparte
	 * @return asigImpartida
	 */

	public String getAsigImpartida() {
		return asigImpartida;
	}
	/**
	 * Definir la asignatura que imparte el profesor
	 */

	public void setAsigImpartida(String asigImpartida) {
		this.asigImpartida = asigImpartida;
	}

	
	
}
