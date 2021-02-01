
package Clases;

/**
 * Clase Asignatura
 * 
 * @author PabloAlberdi
 * @author JulenAlboniga-menor
 */

public class Asignatura {
	private String nombre;
	private int horasCurso;
	
	/**
	 * Constructor vacio
	 */
	
	public Asignatura() {
		
	}
	
	/**
	 * 
	 * @param nombre del objeto Asignatura
	 * @param horasCurso numero de horas que contendra el curso
	 */
	
	public Asignatura(String nombre, int horasCurso) {
		
		this.horasCurso=horasCurso;
		this.nombre=nombre;
	}
	/**
	 * Metodo para obtener el nombre de la asignatura
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Definir el nombre de la asignatura
	 * @param nombre
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Obtener horas del curso de la asignatura
	 * @return horasCurso
	 */

	public int getHorasCurso() {
		return horasCurso;
	}

	/**
	 * Definir duracion del curso
	 * @param horasCurso
	 */
	public void setHorasCurso(int horasCurso) {
		this.horasCurso = horasCurso;
	}

	
	
}