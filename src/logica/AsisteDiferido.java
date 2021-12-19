package logica;

import java.util.Date;

public class AsisteDiferido {
	private Date inicio;
	private Date fin;
	private Estudiante asiste;

	public AsisteDiferido(Date inicio, Estudiante asiste) {
		super();
		this.inicio = inicio;
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

	public Estudiante getAsiste() {
		return asiste;
	}

	public void setAsiste(Estudiante asiste) {
		this.asiste = asiste;
	}

}
