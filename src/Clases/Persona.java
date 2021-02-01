package Clases;

/**
 * Clase abstracta 
 * 
 * @author PabloAlberdi
 * @author JulenAlboniga-menor
 */

public abstract class Persona {
	private String nombre;
	private String apellido;
	private int telefono;
	
	/**
	 * Constructor vacio
	 */
	
	public Persona(){
		
	}
	
	/**
	 * Contructor
	 * @param nombre nombre de la persona
	 * @param apellido de la persona
	 * @param telefono de la persona
	 */
	
	public Persona(String nombre, String apellido, int telefono){
		this.nombre=nombre;
		this.apellido=apellido;
		this.telefono=telefono;
	}
	
	/**
	 * Obtener el Nombre de la persona
	 * @return nombre
	 */

	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Definir el nombre de la persona
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtener el apellido de la persona
	 * @return apellido
	 */
	
	public String getApellido() {
		return apellido;
	}

	/**
	 * Definir el apellido de la persona
	 */
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	
	
	
}
