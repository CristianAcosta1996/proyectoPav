package logica;

public class Estudiante extends Perfil {
	private String documento;

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

}
