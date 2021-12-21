package logica;

import java.util.Date;

public class Participacion {
	private String id;
	private Date fecha;
	private String mensaje;
	private Perfil perfil;
	private Participacion responde;

	public Participacion(String id, Date fecha, String mensaje, Perfil perfil) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.mensaje = mensaje;
		this.perfil = perfil;
	}
	
	public void setRespuestaAParticipacion(Participacion respuesta) {
		this.responde = respuesta;
	}
	
	public Participacion getRespondeA() {
		return responde;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Participacion)) {
			return false;
		}
		
		Participacion participacion = (Participacion) obj;
		
		return this.id == participacion.id;
	}
}
