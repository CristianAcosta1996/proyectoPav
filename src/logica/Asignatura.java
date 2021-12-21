package logica;

import java.util.ArrayList;
import java.util.Iterator;

public class Asignatura {
	private String codigo;
	private String nombre;
	private ArrayList<Clase> clases = new ArrayList<Clase>();

	public Asignatura(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Clase> getClases() {
		return clases;
	}

	public void setClases(ArrayList<Clase> clases) {
		this.clases = clases;
	}

	public void agregarClase(Clase nuevaClase) {
		if (claseEnAsignatura(nuevaClase.getId()))
			this.clases.add(nuevaClase);
	}

	public void quitarClase(String idClase) {
		Clase claseAQuitar = buscarClase(idClase);
		if (claseAQuitar != null)
			this.clases.remove(claseAQuitar);
	}

	public Clase buscarClase(String idClase) {
		Iterator<Clase> claseIterator = this.clases.iterator();
		Clase claseResultado = null;
		boolean claseEncontrada = false;

		while (claseIterator.hasNext() && !claseEncontrada) {
			claseResultado = claseIterator.next();
			if (claseResultado.getId().equals(idClase)) {
				claseEncontrada = true;
			}
		}

		if (!claseEncontrada) {
			return null;
		}

		return claseResultado;
	}

	public boolean claseEnAsignatura(String idClase) {
		return buscarClase(idClase) != null;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true; 
		}
		
		if(!(obj instanceof Asignatura)) {
			return false;
		}
		Asignatura objAAsignatura = (Asignatura) obj; 
		
		return this.getCodigo() == objAAsignatura.getCodigo();		
	}
}
