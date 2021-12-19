package logica;

import java.util.Date;

public class AsisteEnVivo {
	private Estudiante asiste;
	private Date inicio;
	private Date fin;

	public AsisteEnVivo(Estudiante asiste, Date inicio) {
		super();
		this.asiste = asiste;
		this.inicio = inicio;
	}

	public Estudiante getAsiste() {
		return asiste;
	}

	public void setAsiste(Estudiante asiste) {
		this.asiste = asiste;
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
}
