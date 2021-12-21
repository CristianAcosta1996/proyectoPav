package logica;

import java.util.Date;

public class Teorico extends Clase {
	private int cantidadAsistentes;

	public Teorico(String id, String nombre, Date inicio, Date fin, String rutaVideo, Docente profesor) {
		super(id, nombre, inicio, fin, rutaVideo, profesor);
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

}
