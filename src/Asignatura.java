
public class Asignatura {
	private String nombre;
	private int horasCurso;
	
	
	public Asignatura() {
		
	}
	
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

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", horasCurso=" + horasCurso + "]";
	}
	
	
}
