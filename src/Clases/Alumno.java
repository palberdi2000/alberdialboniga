package Clases;
/**
 * Clase Alumno hereda de Persona. 
 * @author PabloAlberdi
 * @author JulenAlboniga-menor
 *
 */
public class Alumno extends Persona implements IComparable{
	private int idAlumno;
	private String asigMatriculada;
	private int numeroFaltas;
	private int nota;
	
	/**
	 * Contructor vacio
	 */
	
	public Alumno() {
		
	}
	
	
	public Alumno(int idAlumno, String nombre, String apellido) {
		super(nombre, apellido, 0);
		this.idAlumno = idAlumno;
	}



	/**
	 * 
	 * @param nombre del objeto Persona
	 * @param apellido del objeto Persona
	 * @param telefono del objeto Persona
	 * @param asigMatriculada Asignaturas que va a cursar
	 * @param numeroFaltas número de veces que no ha asistido a clase
	 * @param nota calificación del Alumno
	 */
	
	public Alumno(String nombre,String apellido,int telefono,String asigMatriculada, int numeroFaltas, int nota) {
		super(nombre, apellido, telefono);
		this.asigMatriculada=asigMatriculada;
		this.numeroFaltas=numeroFaltas;
		this.nota=nota;
	}
	
/*
 * Metodo para obtener la asignatura del alumno
 */
	
	public String getAsigMatriculada() {
		return asigMatriculada;
	}

/*
 * Metodo para asignar la asignatura al alumno	
 */
	
	public void setAsigMatriculada(String asigMatriculada) {
		this.asigMatriculada = asigMatriculada;
	}
	
/*
 * Metodo para obtener el numero de faltas del alumno
 */

	public int getNumeroFaltas() {
		return numeroFaltas;
	}
	
/*
 * Metodo para asignar el numero de faltas al alumno	
 */

	public void setNumeroFaltas(int numeroFaltas) {
		this.numeroFaltas = numeroFaltas;
	}

/*
 * Metodo para obtener la asignatura del alumno
 */
	
	public int getNota() {
		return nota;
	}

/*
 * 
 */

	public void setNota(int nota) {
		this.nota = nota;
	}

/*
 * Metodo para mostrar aviso de que el alumno ha faltado 5 veces o mas a clase
 */
	
	public boolean aviso()
	{
		if(numeroFaltas>=5)
		{
			System.out.println("Los padres de " + this.getNombre() + "recibiran una llamada comentando que esta faltando mucho a clase.");
			return false;
		}
		else
		{
			return true;
		}
	}


	@Override
	public String toString() {
		return super.getNombre() + " " + super.getApellido();
	}


	@Override
	public int value() {
		// TODO Auto-generated method stub
		return super.getApellido().toLowerCase().charAt(0);
	}
	
	
}

