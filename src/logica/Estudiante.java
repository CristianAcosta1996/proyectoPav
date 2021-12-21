package logica;

import java.util.ArrayList;
import java.util.Iterator;

public class Estudiante extends Perfil {
	private String documento;
	private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>(); 

	public Estudiante(String nombre, String imagenUrl, String email, String password, String documento) {
		super(nombre, imagenUrl, email, password);
		this.documento = documento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true; 
		}
		
		if(!(obj instanceof Estudiante)) {
			return false; 
		}
		Estudiante objAEstudiante = (Estudiante) obj;
		
		return this.getEmail() == objAEstudiante.getEmail();		
	}

	public void agregarAsignatura(Asignatura nuevaAsignatura) {
		if(!tieneAsignatura(nuevaAsignatura.getCodigo()))
			this.asignaturas.add(nuevaAsignatura);
	}
	
	public void quitarAsignatura(String codigoAsignatura) {
		Asignatura asignaturaAQuitar = buscarAsignatura(codigoAsignatura);
		if(asignaturaAQuitar != null) {
			this.asignaturas.remove(asignaturaAQuitar);
		}
	}
	
	public boolean tieneAsignatura(String codigoAsignatura) {
		Asignatura asignatura = buscarAsignatura(codigoAsignatura);
		return asignatura != null;
	}
	
	public Asignatura buscarAsignatura(String codigoAsignatura) {
		Iterator<Asignatura> asignaturaIt = this.asignaturas.iterator();
		boolean asignaturaEcontrada = false;
		Asignatura asignaturaADevolver = null;
		
		while(asignaturaIt.hasNext() && !asignaturaEcontrada) {
			asignaturaADevolver = asignaturaIt.next();
			if(asignaturaADevolver.getCodigo().equals(codigoAsignatura))
				asignaturaEcontrada = true;
		}
		
		if(!asignaturaEcontrada) {
			return null; 
		}
		
		return asignaturaADevolver; 
	}
}
