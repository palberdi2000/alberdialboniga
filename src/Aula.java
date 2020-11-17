
public class Aula {
	private int numAula;
	private int capacidad;
	private Alumno[]lista_alumnos;
	private Profesor profe;
	private String asignatura;
	
	public Aula() {
		this.lista_alumnos= new Alumno[capacidad] ;
	}
	
	public Aula(int numAula,int capacidad, Alumno lista_alumnos, Profesor profe, String asignatura) {
		this.capacidad=capacidad;
		this.numAula=numAula;
		this.lista_alumnos= new Alumno[capacidad] ;
		this.profe=profe;
		this.asignatura=asignatura;
	}

	public int getNumAula() {
		return numAula;
	}

	public void setNumAula(int numAula) {
		this.numAula = numAula;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Alumno[] getLista_alumnos() {
		return lista_alumnos;
	}

	public void setLista_alumnos(Alumno[] lista_alumnos) {
		this.lista_alumnos = lista_alumnos;
	}

	public Profesor getProfe() {
		return profe;
	}

	public void setProfe(Profesor profe) {
		this.profe = profe;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public void anyadirAlumno(Alumno a)
	{
		for(int i=0;i<capacidad;i++)
		{
			if(lista_alumnos[i]==null)
			{
				lista_alumnos[i] = a;
			}
		}
	}
	
	public void recomendacion()
	{
		int contador=0;
		for(int i=0;i<capacidad;i++)
		{
			if(lista_alumnos[i].getNota()<5)
			{
				contador++;
				System.out.println("Se le recomienda a " + lista_alumnos[i].getNombre() + lista_alumnos[i].getApellido() + "que se apunte a las clases para preparar la recuperacion de " + lista_alumnos[i].getAsigMatriculada());
			}
		}
	}
	
	public boolean clase()
	{
		if(this.asignatura != this.profe.getAsigImpartida())
		{
			System.out.println("El profesor " + this.profe.getNombre() + this.profe.getApellido() + "se ha equivocado de aula");
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public void capacidadClase(Alumno[]lista_alumnos) throws Exception
	{
		for(Alumno a: lista_alumnos)
		{
			if(capacidad>=15)
			{
				throw new Exception();
			}
		}
	}
}
