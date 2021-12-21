package logica;

public class Rol {
	TipoRol tipo;
	Asignatura asignatura;

	public Rol(TipoRol tipo, Asignatura asignatura) {
		super();
		this.tipo = tipo;
		this.asignatura = asignatura;
	}

	public TipoRol getTipo() {
		return tipo;
	}

	public void setTipo(TipoRol tipo) {
		this.tipo = tipo;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
}
