/**
 * Clase Alumno. 
 * @author Pablo Alberdi
 * @author Julen Alboniga-menor
 *
 */
public class Alumno extends Persona{
	private String asigMatriculada;
	private int numeroFaltas;
	private int nota;
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre,String apellido,int telefono,String asigMatriculada, int numeroFaltas, int nota) {
		this.asigMatriculada=asigMatriculada;
		this.numeroFaltas=numeroFaltas;
		this.nota=nota;
	}

	public String getAsigMatriculada() {
		return asigMatriculada;
	}

	public void setAsigMatriculada(String asigMatriculada) {
		this.asigMatriculada = asigMatriculada;
	}

	public int getNumeroFaltas() {
		return numeroFaltas;
	}

	public void setNumeroFaltas(int numeroFaltas) {
		this.numeroFaltas = numeroFaltas;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

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
	
	
}

