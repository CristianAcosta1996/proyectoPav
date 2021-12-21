package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Monitoreo extends Clase{
	private final int maxCantEstudiantes = 15;
	private ArrayList<Estudiante> listaDeEstudiantes = new ArrayList<Estudiante>(15);

	public Monitoreo(String id, String nombre, Date inicio, Date fin, String rutaVideo,Docente profesor , Estudiante estudiante) {
		super(id, nombre, inicio, fin, rutaVideo,profesor);
		this.listaDeEstudiantes.add(estudiante);
	}
	
	public void agregarEstudianteALista(Estudiante nuevoEstudiante) {
		if(listaDeEstudiantes.size() <= maxCantEstudiantes && !estudianteAgregado(nuevoEstudiante)) {
			this.listaDeEstudiantes.add(nuevoEstudiante);
		}
	}
	
	private boolean estudianteAgregado(Estudiante e) {
		Iterator<Estudiante> estudianteIt = this.listaDeEstudiantes.iterator();
		boolean estaAgregado = false;
		
		while(estudianteIt.hasNext() && !estaAgregado) {
			if(estudianteIt.next().equals(e))
				estaAgregado = true;
		}
		
		return estaAgregado;
	}

}
