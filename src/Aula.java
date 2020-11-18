
public class Aula {
	private int numAula;
	private int capacidad;
	
	public Aula() {
		
	}
	
	public Aula(int numAula,int capacidad) {
		this.capacidad=capacidad;
		this.numAula=numAula;
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
		
	public void capacidadClase() throws Exception
	{
		if(capacidad>=15)
		{
			throw new Exception();
		}
		
	}
}
