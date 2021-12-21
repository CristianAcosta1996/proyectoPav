package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public abstract class Clase {
	private String id;
	private String nombre;
	private Date inicio;
	private Date fin;
	private String rutaVideo;
	private ArrayList<Participacion> participaciones = new ArrayList<Participacion>();
	private ArrayList<AsisteEnVivo> asistenciasEnVivo = new ArrayList<AsisteEnVivo>();
	private ArrayList<AsisteDiferido> asistenciasDiferidas = new ArrayList<AsisteDiferido>();
	private ArrayList<Docente> profesores = new ArrayList<Docente>();
	
	public Clase(String id, String nombre, Date inicio, Date fin, String rutaVideo, Docente profesor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
		this.rutaVideo = rutaVideo;
		this.profesores.add(profesor);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public String getRutaVideo() {
		return rutaVideo;
	}

	public void setRutaVideo(String rutaVideo) {
		this.rutaVideo = rutaVideo;
	}
	
	public void agregarParticipacion(Participacion nuevaParticipacion) {
		if(getParticipacion(nuevaParticipacion.getId()) != null) {
			this.participaciones.add(nuevaParticipacion);
		}
	}
	
	public void quitarParticipacion(String idParticipacion) {
		Participacion participacionAQuitar = getParticipacion(idParticipacion);
		if(participacionAQuitar != null)
			this.participaciones.remove(participacionAQuitar);
	}
	
	private Participacion getParticipacion(String idParticipacion) {
		Iterator<Participacion> participacionIt = this.participaciones.iterator();
		boolean existeId = false;
		Participacion participacionARevisar = null; 
		
		while(participacionIt.hasNext() && !existeId) {
			participacionARevisar = participacionIt.next();
			if(participacionARevisar.getId().equals(idParticipacion))
				existeId = true;
		}
		
		return participacionARevisar;
	}
	
	public void agregarAsistenciaEnVivo(AsisteEnVivo nuevaAsistencia) {
		this.asistenciasEnVivo.add(nuevaAsistencia);
	}
	
	public void quitarAsistenciaEnVivo(AsisteEnVivo asistenciaAQuitar) {
		this.asistenciasEnVivo.remove(asistenciaAQuitar);
	}
	
	public void agregarAsistenciaDiferida(AsisteDiferido nuevaAsistencia) {
		this.asistenciasDiferidas.add(nuevaAsistencia);
	}
	
	public void quitarAsistenciaDiferida(AsisteDiferido asistenciaAQuitar) {
		this.asistenciasDiferidas.remove(asistenciaAQuitar);
	}
	
	public void agregarProfesor(Docente nuevoProfesor) {
		if(!profesorAgregado(nuevoProfesor))
			this.profesores.add(nuevoProfesor);
	}
	
	private boolean profesorAgregado(Docente d) {
		Iterator<Docente> docenteIt = this.profesores.iterator();
		boolean estaAgregado = false; 
		
		while(docenteIt.hasNext() && !estaAgregado) {
			if(docenteIt.next().equals(d))
				estaAgregado = true;
		}
		
		return estaAgregado;
	}
	
	public void quitarProfesor(Docente profesorAQuitar) {
		if(this.profesores.size() > 1)
			this.profesores.remove(profesorAQuitar);
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(this == obj) {
			return true; 
		}
		
		if(!(obj instanceof Clase)) {
			return false; 
		}
		Clase objAClase = (Clase) obj; 
		
		return this.getId() == objAClase.getId();
	}
}
