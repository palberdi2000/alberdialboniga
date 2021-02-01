package Clases;
import java.util.ArrayList;

/**
 * 
 * @author PabloALberdi
 * @author JulenAlboniga-menor
 *
 */
public class Grupo {
	private int numGrupo;
	private Alumno alumno;
	private Aula aula;
	private ArrayList<Alumno>lista_alumnos;
	private Profesor profe;
	private ArrayList<Profesor>arrayProfe;
	
	/**
	 * Contructor vacio
	 */
	
	public Grupo() {
		this.lista_alumnos=new ArrayList<Alumno>();
		this.arrayProfe= new ArrayList<Profesor>();
	}

	/**
	 * 
	 * @param numGrupo numero del grupo
	 * @param alumno objeto Alumno
	 * @param aula objeto Aula
	 * @param lista_alumnos ArrayList de Alumnos
	 * @param profe objeto Profesor
	 */
	
	public Grupo(int numGrupo, Alumno alumno, Aula aula, ArrayList<Alumno> lista_alumnos, Profesor profe,ArrayList<Profesor>arrayProfe) {
		super();
		this.numGrupo = numGrupo;
		this.alumno = alumno;
		this.aula = aula;
		this.lista_alumnos = lista_alumnos;
		this.profe=profe;
		this.arrayProfe=arrayProfe;
	}

	/**
	 * Obtener el numero del grupo 
	 * @return numGrupo
	 */
	public int getNumGrupo() {
		return numGrupo;
	}
	
	/**
	 * Definir numero de grupo 
	 */
	public void setNumGrupo(int numGrupo) {
		this.numGrupo = numGrupo;
	}
	/**
	 * Obtener un alumno del grupo
	 * @return alumno
	 */
	public Alumno getAlumno() {
		return alumno;
	}
	
	/**
	 * Definir un alumno en el grupo
	 */
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	/**
	 * Obtener el aula del grupo
	 * @return aula
	 */
	public Aula getAula() {
		return aula;
	}
	
	/**
	 * Definir aula del grupo
	 */
	
	public void setAula(Aula aula) {
		this.aula = aula;
	}
	/**
	 * Obtener el listado de alumnos del grupo
	 * @return lista_alumnos
	 */
	public ArrayList<Alumno> getLista_alumnos() {
		return lista_alumnos;
	}
	
	/**
	 * Definir el listado de alumnos
	 */

	public void setLista_alumnos(ArrayList<Alumno> lista_alumnos) {
		this.lista_alumnos = lista_alumnos;
	}

	/**
	 * Obtener el profesor del grupo
	 * @return profe
	 */
	
	public Profesor getProfe() {
		return profe;
	}

	/**
	 * Definir el profesor del grupo
	 */
	
	public void setProfe(Profesor profe) {
		this.profe = profe;
	}
	
	/**
	 * Obtener lista de profesor del grupo
	 * @return arrayProfe
	 */

	public ArrayList<Profesor> getArrayProfe() {
		return arrayProfe;
	}
	
	/**
	 * Definir lista de profesor del grupo
	 */
	
	public void setArrayProfe(ArrayList<Profesor> arrayProfe) {
		this.arrayProfe = arrayProfe;
	}

	/**
	 * 
	 * @param a Alumno creado
	 * Metodo para añadir alumno al grupo
	 */
	
	public void anyadirAlumno(Alumno a)
	{
		
			lista_alumnos.add(a);
		
	}
	
	/**
	 * Metodo para añadir al Profesor 
	 * @param p objeto Profesor
	 */
	
	public void anyadirProfesor(Profesor p)
	{
		arrayProfe.add(p);
	}
}
