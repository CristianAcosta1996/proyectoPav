package logica;

import java.util.ArrayList;
import java.util.Iterator;

public class Docente extends Perfil{
	private String instituto;
	private ArrayList<Rol> roles = new ArrayList<>();

	public Docente(String nombre, String imagenUrl, String email, String password, String instituto) {
		super(nombre, imagenUrl, email, password);
		this.instituto = instituto;
	}

	public String getInstituto() {
		return instituto;
	}

	public void setInstituto(String instituto) {
		this.instituto = instituto;
	} 
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true; 
		}
		
		if(!(obj instanceof Docente)) {
			return false;
		}
		Docente objADocente = (Docente) obj; 
		
		return this.getEmail() == objADocente.getEmail();
	}
	
	public void agregarRol(Rol nuevoRol) {
		if(verificarRol(nuevoRol))
			this.roles.add(nuevoRol);
	}
	
	public void quitarRol(TipoRol tipo, String codigoAsignatura) {
		Rol rolAQuitar = getRol(tipo, codigoAsignatura);
		if(rolAQuitar != null)
			this.roles.remove(rolAQuitar);
	}
	
	public boolean verificarRol(Rol rol) {
		Iterator<Rol> rolIterator = this.roles.iterator(); 
		boolean rolValido = true;
		Rol rolAComparar = null;
	
		while(rolIterator.hasNext() && rolValido) {
			rolAComparar = rolIterator.next();
			if(rolAComparar.getTipo().equals(rol.getTipo()) && rolAComparar.getAsignatura().equals(rol.getAsignatura()))
				rolValido = false;
		}
		
		return rolValido;
	}
	
	public Rol getRol(TipoRol tipo, String codigoAsignatura) {
		Iterator<Rol> rolIterator = this.roles.iterator(); 
		Rol rolADevolver = null; 
		boolean rolEncontrado = false;
		
		while(rolIterator.hasNext() && !rolEncontrado) {
			rolADevolver = rolIterator.next(); 
			if(rolADevolver.getTipo().equals(tipo) && rolADevolver.getAsignatura().getCodigo().equals(codigoAsignatura))
				rolEncontrado = true;
		}
		
		if(!rolEncontrado) {
			return null;
		}
		
		return rolADevolver;
	}
}
