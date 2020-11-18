import java.util.ArrayList;

public class Grupo {
	private int numGrupo;
	private Alumno alumno;
	private Aula aula;
	private ArrayList<Alumno>lista_alumnos;
	private Profesor profe;
	
	public Grupo() {
		this.lista_alumnos=new ArrayList<Alumno>();
	}

	public Grupo(int numGrupo, Alumno alumno, Aula aula, ArrayList<Alumno> lista_alumnos, Profesor profe) {
		super();
		this.numGrupo = numGrupo;
		this.alumno = alumno;
		this.aula = aula;
		this.lista_alumnos = lista_alumnos;
		this.profe=profe;
	}

	public int getNumGrupo() {
		return numGrupo;
	}

	public void setNumGrupo(int numGrupo) {
		this.numGrupo = numGrupo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}
	
	public ArrayList<Alumno> getLista_alumnos() {
		return lista_alumnos;
	}

	public void setLista_alumnos(ArrayList<Alumno> lista_alumnos) {
		this.lista_alumnos = lista_alumnos;
	}

	public Profesor getProfe() {
		return profe;
	}

	public void setProfe(Profesor profe) {
		this.profe = profe;
	}

	public void anyadirAlumno(Alumno a)
	{
		{
			lista_alumnos.add(a);
		}
	}
	
	public void anyadirProfesor(Profesor p)
	{
		
	}
}
