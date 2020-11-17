
public class Profesor extends Persona {
	private String asigImpartida;
	
	public Profesor() {
		
	}
	
	public Profesor(String nombre, String apellido,int telefono,String asigImpartida) {
		super();
		this.asigImpartida=asigImpartida;
		
	}

	public String getAsigImpartida() {
		return asigImpartida;
	}

	public void setAsigImpartida(String asigImpartida) {
		this.asigImpartida = asigImpartida;
	}

	
	
}
