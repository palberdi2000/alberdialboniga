/**
 * Clase Alumno. 
 * @author Pablo Alberdi
 * @author Julen Alboniga-menor
 *
 */
public class Alumno extends Persona{
	private String asigMatriculada;
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre,String apellido,int telefono,String asigMatriculada) {
		this.asigMatriculada=asigMatriculada;
		
	}

	public String getAsigMatriculada() {
		return asigMatriculada;
	}

	public void setAsigMatriculada(String asigMatriculada) {
		this.asigMatriculada = asigMatriculada;
	}

	@Override
	public String toString() {
		return "Alumno [asigMatriculada=" + asigMatriculada + "]";
	}
	
	
}

