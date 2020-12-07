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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasCurso() {
		return horasCurso;
	}

	public void setHorasCurso(int horasCurso) {
		this.horasCurso = horasCurso;
	}

	
	
}
